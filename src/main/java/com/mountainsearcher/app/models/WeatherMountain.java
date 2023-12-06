package com.mountainsearcher.app.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class WeatherMountain {
    private int mountainId;
    private int weatherCode;
    private int day;
}

//make db
