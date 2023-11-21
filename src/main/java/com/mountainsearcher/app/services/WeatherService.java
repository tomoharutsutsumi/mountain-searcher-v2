package com.mountainsearcher.app.services;
import org.springframework.web.client.RestTemplate;
import java.util.concurrent.CompletableFuture;
import java.util.List;
import java.util.stream.Collectors;
import com.mountainsearcher.app.models.WeatherResponse;
import com.mountainsearcher.app.models.Mountain;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    private static final RestTemplate restTemplate = new RestTemplate();

    public static void GetWeatherData(Mountain mountain){
        String apiUrl = "https://api.open-meteo.com/v1/forecast?latitude=" + mountain.getLatitude() 
            + "&longitude=" + mountain.getLongitude()
            + "&daily=weathercode&timezone=auto";
        WeatherResponse result = restTemplate.getForObject(apiUrl, WeatherResponse.class);

        System.out.println(result);
    }






    //define object
}

//  caching should be used as well.
// wanna check how fast caching is 
