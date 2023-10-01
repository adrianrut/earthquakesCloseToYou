package pl.rutkowski.earthquakesclosetoyou.earthquake;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.rutkowski.earthquakesclosetoyou.City;
import pl.rutkowski.earthquakesclosetoyou.MapService;
import pl.rutkowski.earthquakesclosetoyou.model.Point;

import java.util.Set;

@Controller
public class EarthquakeController {

    private final EarthquakeService earthquakeService;
    private final MapService mapService;

    public EarthquakeController(EarthquakeService earthquakeService, MapService mapService) {
        this.earthquakeService = earthquakeService;
        this.mapService = mapService;
    }

    @GetMapping("/earthquakes={city}")
    public String findEarthquakes(@PathVariable String city, Model model) {
        Set<Point> earthquakeLocations = earthquakeService.sortEarthquakesSet(city);
        model.addAttribute("earthquakeSet", earthquakeLocations);
        return "home";
    }

    @GetMapping("/")
    public String homeForMap(Model model) {
        model.addAttribute("city", new City());
        return "findCity";
    }

    @PostMapping(value = "/city", params = "map")
    public String getCityForMap(City city) {
        return "redirect:/map=" + city.getName().toLowerCase();
    }

    @PostMapping(value = "/city", params = "list")
    public String getCityForList(City city) {
        return "redirect:/earthquakes=" + city.getName().toLowerCase();
    }

    @GetMapping("/map={city}")
    public String getMap(Model model, @PathVariable String city) {
        Set<Point> points = earthquakeService.sortEarthquakesSet(city);
        model.addAttribute("points", points);
        model.addAttribute("city", mapService.getLocation(city));
        return "map";
    }

}
