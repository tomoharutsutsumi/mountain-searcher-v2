import org.springframework.web.client.RestTemplate;
import java.util.concurrent.CompletableFuture;
import java.util.List;
import java.util.stream.Collectors;
import com.mountainsearcher.app.models.WeatherResponse;
import com.mountainsearcher.app.models.Mountain;

public class WeatherService {

    private static final RestTemplate restTemplate = new RestTemplate();

    // public WeatherService() {
    //     this.restTemplate = new RestTemplate();
    // }

    // public List<WeatherData> fetchWeatherForMountains(List<Mountain> mountains) {
    //     List<CompletableFuture<WeatherData>> futures = mountains.stream()
    //         .map(mountain -> CompletableFuture.supplyAsync(() -> fetchWeather(mountain)))
    //         .collect(Collectors.toList());

    //     return futures.stream()
    //         .map(CompletableFuture::join)
    //         .collect(Collectors.toList());
    // }
    public static void GetWeatherData(Mountain mountain){
        String apiUrl = "https://api.open-meteo.com/v1/forecast?latitude=" + mountain.getLatitude() 
            + "&longitude=" + mountain.getLongitude()
            + "&daily=weathercode&timezone=auto";
        String result = restTemplate.getForObject(apiUrl, WeatherResponse.class);
        System.out.println(result);
    }
    //define object
    //curl "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&daily=weathercode&timezone=America%2FLos_Angeles&start_date=2023-10-21&end_date=2023-10-22"
//{"latitude":52.52,"longitude":13.419998,"generationtime_ms":0.015974044799804688,"utc_offset_seconds":-25200,"timezone":"America/Los_Angeles","timezone_abbreviation":"PDT","elevation":38.0,"daily_units":{"time":"iso8601","weathercode":"wmo code"},"daily":{"time":["2023-10-21","2023-10-22"],"weathercode":[80,3]}}

   

    // private WeatherData fetchWeather(Mountain mountain) {
    //     String apiUrl = "https://api.open-meteo.com/v1/forecast?latitude=" + mountain.getLatitude() 
    //         + "&longitude=" + mountain.getLongitude()
    //         + "&daily=weathercode&timezone=auto";
    //     return restTemplate.getForObject(apiUrl, WeatherData.class);
    // }
}

//  caching should be used as well.
// wanna check how fast caching is 
