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
        // Assume you have an API URL that takes a mountain name or ID and returns weather data
        String apiUrl = "https://weatherapi.com/getWeather?mountain=" + mountain.getName();
        return restTemplate.getForObject(apiUrl, WeatherData.class);
    }
}
