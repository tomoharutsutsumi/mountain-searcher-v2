package com.example.demo.models;

public class Mountain {
    private int id;
    private String name;
    private String prefecture;
    private boolean hasTentSite;
    private float latitude;
    private float longitude;

    public Mountain(int id, String name, String prefecture, boolean hasTentSite, float latitude, float longitude) {
        this.id = id;
        setName(name);
        setPrefecture(prefecture);
        this.hasTentSite = hasTentSite;
        this.latitude = latitude;
        this.longitude = longitude;
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

    public boolean isHasTentSite() {
        return hasTentSite;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setName(String name) {
        if (name != null && name.length() <= 20) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name should be non-null and up to 20 characters.");
        }
    }

    public void setPrefecture(String prefecture) {
        if (prefecture != null && prefecture.length() <= 20) {
            this.prefecture = prefecture;
        } else {
            throw new IllegalArgumentException("Prefecture should be non-null and up to 20 characters.");
        }
    }
}
