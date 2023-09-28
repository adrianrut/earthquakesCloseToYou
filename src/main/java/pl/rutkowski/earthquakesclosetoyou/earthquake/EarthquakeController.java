package pl.rutkowski.earthquakesclosetoyou.earthquake;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.rutkowski.earthquakesclosetoyou.City;

import java.util.List;

@Controller
public class EarthquakeController {

    private final EarthquakeService earthquakeService;

    public EarthquakeController(EarthquakeService earthquakeService) {
        this.earthquakeService = earthquakeService;
    }

    @GetMapping("/earthquakes={city}")
    public String findEarthquakes(@PathVariable String city, Model model) {
        List<EarthquakeLocation> earthquakeLocations = earthquakeService.sortEarthquakesList(city);
        model.addAttribute("earthquakeList", earthquakeLocations);
        return "home";
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("city", new City());
        return "findCity";
    }

    @PostMapping("/city")
    public String getCity(City city) {
        return "redirect:/earthquakes=" + city.getName().toLowerCase();
    }


}
