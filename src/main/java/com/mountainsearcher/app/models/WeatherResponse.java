package com.mountainsearcher.app.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
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
        private List<String> time;                 // Corresponds to "time":["2023-10-21","2023-10-22"]
        private List<Integer> weathercode;         // Corresponds to "weathercode":[80,3]

        // Constructors, getters, setters for Daily omitted for brevity
    }
    
}
