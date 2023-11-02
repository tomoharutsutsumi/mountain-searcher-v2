package com.mountainsearcher.app.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mountain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;    
    // private boolean hasTentSite;
    private double latitude;
    private double longitude;
    private String prefecture;

    public Mountain(int id, String name, double latitude, double longitude, String prefecture, int height) {
        this.id = id;
        setName(name);
        setPrefecture(prefecture);
        // this.hasTentSite = hasTentSite;
        this.latitude = latitude;
        this.longitude = longitude;
        this.height = height
    }

    public Mountain() {
        // Default constructor
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrefecture() {
        return prefecture;
    }

    // public boolean isHasTentSite() {
    //     return hasTentSite;
    // }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getHeight(){
        return height
    }

    public void setName(String name) {
        if (name != null && name.length() <= 50) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name should be non-null and up to 20 characters.");
        }
    }

    public void setPrefecture(String prefecture) {
        if (prefecture != null && prefecture.length() <= 50) {
            this.prefecture = prefecture;
        } else {
            throw new IllegalArgumentException("Prefecture should be non-null and up to 20 characters.");
        }
    }
}
