package com.mountainsearcher.app.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import com.mountainsearcher.app.repositories.MountainRepository;

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
    private int height;

    public Mountain(int id, String name, double latitude, double longitude, 
                    String prefecture, int height, Date updatedAt, int weatherCode ) {
                        // weathercode is not here. weatehr mountain java
        this.id = id;
        setName(name);
        setPrefecture(prefecture);
        // this.hasTentSite = hasTentSite;
        this.latitude = latitude;
        this.longitude = longitude;
        this.height = height;
        this.updatedAt = updatedAt // in 12 hours, the mountain's code don't need to be updated
        this.weatherCode = weatherCode
    }
    // private static final int HigherThan3000 = 4;
    // private static final int HigherThan2000 = 3;
    // private static final int HigherThan1000 = 2;
    // private static final int LowerThan1000 = 1;

    private MountainRepository mountainRepository;

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
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setWeatherCode(int weatherCode) {
        this.weatherCode = weatherCode;
    }

    public static void filterMountains(int height, Date date, int distance) {
        List<Mountain> mountains = MountainRepository.findByHeightGreaterThan(height);
    }

     
    // private static int returnHeightConstant(int height){
    //     if (height === HigherThan3000) {
    //         return HigherThan3000
    //     } else if (height === HigherThan2000) {
    //         return HigherThan2000
    //     } else if (height === HigherThan1000) {
    //         return HigherThan1000
    //     } else if (height === LowerThan1000) {
    //         return LowerThan1000
    //     } else {
    //         throw new Error("Not defined constant height");
    //     }
    // }        
}
