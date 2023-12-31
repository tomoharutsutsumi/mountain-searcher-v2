package com.mountainsearcher.app.services;
import org.springframework.web.client.RestTemplate;
import java.util.concurrent.CompletableFuture;
import java.util.List;
import java.util.stream.Collectors;
import com.mountainsearcher.app.models.WeatherResponse;
import com.mountainsearcher.app.models.Mountain;
import org.springframework.stereotype.Service;
import com.mountainsearcher.app.repositories.MountainRepository;

@Service
public class WeatherService {

    private static final RestTemplate restTemplate = new RestTemplate();

    @Autowired
    private MountainRepository mountainRepository;

    public static List<Mountain> getWeatherData(int daysLater){
        List<Mountain> mountains = mountainRepository.findAll();
        for (Mountain mountain : mountains) {
            String apiUrl = "https://api.open-meteo.com/v1/forecast?latitude=" + mountain.getLatitude() 
            + "&longitude=" + mountain.getLongitude()
            + "&daily=weathercode&timezone=auto";
            WeatherResponse result = restTemplate.getForObject(apiUrl, WeatherResponse.class);
            List<Integer> weatherCodeList = result.getWeatherCode();
            int weatherCode = result.getWeatherCode().get(dayLater);
            WeatherMountain weatherMountain = new WeatherMountain();
            weatherMountain.setWeatherCode(weatherCode);
            weatherMountain.setMountainId(mountain.getId());
            weatherMountainRepository.save(weatherMountain);
        }
        
        return mountains;
    }






    //define object
}

//  caching should be used as well.
// wanna check how fast caching is 
