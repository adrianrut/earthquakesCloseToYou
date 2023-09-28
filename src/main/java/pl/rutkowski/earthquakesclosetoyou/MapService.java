package pl.rutkowski.earthquakesclosetoyou;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.rutkowski.earthquakesclosetoyou.model.googleMapsApi.Candidate;
import pl.rutkowski.earthquakesclosetoyou.model.googleMapsApi.GoogleMapsResponseDto;
import pl.rutkowski.earthquakesclosetoyou.model.googleMapsApi.Result;

import java.util.List;

@Service
public class MapService {

    private final String googleMapsApiKey;

    public MapService(@Value("${app.googleMapsApiKey}")String googleMapsApiKey) {
        this.googleMapsApiKey = googleMapsApiKey;
    }

    private String getPlaceId(String city) {
        String cityToFind = city.toLowerCase();
        String placeId = null;

        String urlForPlaceId =
                "https://maps.googleapis.com/maps/api/place/findplacefromtext/" +
                        "json?fields=place_id&input=" + cityToFind + "&inputtype=textquery&key=" + googleMapsApiKey;

        RestTemplate restTemplate = new RestTemplate();
        GoogleMapsResponseDto response = restTemplate.getForObject(urlForPlaceId, GoogleMapsResponseDto.class);
        assert response != null;
        List<Candidate> candidates = response.getCandidates();
        for (Candidate candidate : candidates) {
            placeId = candidate.getPlace_id();
        }
        return placeId;

    }

    public LocationDetails getLocation(String city) {
        String placeId = getPlaceId(city);

        String url =
                "https://maps.googleapis.com/maps/api/place/details/json?place_id=" + placeId +"&key=" + googleMapsApiKey;

        LocationDetails location = new LocationDetails();

        RestTemplate restTemplate = new RestTemplate();
        GoogleMapsResponseDto response = restTemplate.getForObject(url, GoogleMapsResponseDto.class);
        assert response != null;
        Result result = response.getResult();
        location.setLat(result.getGeometry().getLocation().getLat());
        location.setLon(result.getGeometry().getLocation().getLng());
        return location;
    }
}
