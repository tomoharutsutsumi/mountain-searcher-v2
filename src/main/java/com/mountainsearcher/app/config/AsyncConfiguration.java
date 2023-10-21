import org.springframework.web.client.RestTemplate;
import java.util.concurrent.CompletableFuture;
import java.util.List;
import java.util.stream.Collectors;

public class WeatherService {

    private final RestTemplate restTemplate;

    public WeatherService() {
        this.restTemplate = new RestTemplate();
    }

    public List<WeatherData> fetchWeatherForMountains(List<Mountain> mountains) {
        List<CompletableFuture<WeatherData>> futures = mountains.stream()
            .map(mountain -> CompletableFuture.supplyAsync(() -> fetchWeather(mountain)))
            .collect(Collectors.toList());

        return futures.stream()
            .map(CompletableFuture::join)
            .collect(Collectors.toList());
    }

    private WeatherData fetchWeather(Mountain mountain) {

        //https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&daily=weathercode&timezone=America%2FLos_Angeles&start_date=2023-10-21&end_date=2023-10-22
        String apiUrl = "https://weatherapi.com/getWeather?mountain=" + mountain.getName();
        return restTemplate.getForObject(apiUrl, WeatherData.class);
    }
}

//  caching should be used as well.
