package pl.rutkowski.earthquakesclosetoyou.earthquake;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.rutkowski.earthquakesclosetoyou.LocationDetails;
import pl.rutkowski.earthquakesclosetoyou.MapService;
import pl.rutkowski.earthquakesclosetoyou.model.earthquakeApi.EarthquakeResponseDto;
import pl.rutkowski.earthquakesclosetoyou.model.earthquakeApi.Feature;
import pl.rutkowski.earthquakesclosetoyou.model.earthquakeApi.Geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EarthquakeService {

    private final DistanceCalculator distanceCalculator = new DistanceCalculator();
    private final MapService mapService;
    private static final String EARTHQUAKE_LINK = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_month.geojson";

    public EarthquakeService(MapService mapService) {
        this.mapService = mapService;
    }

    public List<EarthquakeLocation> getEarthquakesDetails(String city) {
        List<EarthquakeLocation> earthquakeLocationList = new ArrayList<>();
        LocationDetails location = mapService.getLocation(city);

        RestTemplate restTemplate = new RestTemplate();
        EarthquakeResponseDto response = restTemplate.getForObject(EARTHQUAKE_LINK, EarthquakeResponseDto.class);
        assert response != null;
        List<Feature> features = response.getFeatures();
        for (Feature feature : features) {
            Geometry geometry = feature.getGeometry();
            double eqLon = geometry.getCoordinates().get(0);
            double eqLat = geometry.getCoordinates().get(1);

            String title = feature.getProperties().getTitle();
            int distance = (int) distanceCalculator.distanceCalculate
                    (location.getLat(), eqLat, location.getLon(), eqLon);

            EarthquakeLocation earthquakeLocation = new EarthquakeLocation(title, distance);
            earthquakeLocationList.add(earthquakeLocation);
        }

        return earthquakeLocationList;
    }



    public List<EarthquakeLocation> sortEarthquakesList(String city) {
        return getEarthquakesDetails(city).stream()
                .sorted()
                .limit(10)
                .collect(Collectors.toList());
        }
}
