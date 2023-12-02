package com.mountainsearcher.app.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;

public class WeatherResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private double latitude;
    private double longitude;
    private double generationtime_ms;
    private int utc_offset_seconds;
    private String timezone;
    private String timezone_abbreviation;
    private double elevation;
    private DailyUnits daily_units;
    private Daily daily;

    private class DailyUnits {
        private String time;          // Corresponds to "time":"iso8601"
        private String weathercode;   // Corresponds to "weathercode":"wmo code"

        // Constructors, getters, setters for DailyUnits omitted for brevity
    }

    private class Daily {
        private List<String> time;
        private List<Integer> weathercode;

        // Constructors, getters, setters for Daily omitted for brevity
    }

    // getweathercode
    public List<Integer> getWeatherCode() {
        return daily.weathercode;
    }

    private static final Map<Integer, String> WEATHER_CODES = Map.of(
        0, "clear sky"
        1, "Mainly clear"
        2, "partly cloudy"
        3, "overcast"
        45, "Fog"
        48, "depositing rime fog"
        51, "Drizzle: Light"
        53, "Drizzle: moderate"
        55, "Drizzle: dense intensity"
        56, "Freezing Drizzle: Light"
        57, "Freezing Drizzle: dense intensity"
        61, "Rain: Slight"
        63, "Rain: moderate"
        65, "Rain: heavy intensity"
        66, "Freezing Rain: Light"
        67, "Freezing Rain: heavy intensity"
        71, "Snow fall: Slight"
        73, "Snow fall: moderate"
        75, "Snow fall: heavy intensity"

77	Snow grains
80, 81, 82	Rain showers: Slight, moderate, and violent
85, 86	Snow showers slight and heavy
95 	Thunderstorm: Slight or moderate
96, 99 	Thunderstorm with slight and heavy hail
    );
    
}
