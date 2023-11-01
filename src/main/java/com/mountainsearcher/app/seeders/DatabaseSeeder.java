package com.mountainsearcher.app.seeders;

import com.mountainsearcher.app.models.Mountain;
import com.mountainsearcher.app.repositories.MountainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private final MountainRepository mountainRepository;

    @Autowired
    public DatabaseSeeder(MountainRepository mountainRepository) {
        this.mountainRepository = mountainRepository;
    }

    // transaction
    public void run(String... arg) {
        Mountain[] mountains = mountainData();
        for (Mountain m : mountains) {
            if(!mountainRepository.existsByName(m.getName())){
                mountainRepository.save(m);
            } 
        }
    }

    private Mountain[] mountainData() {
        return new Mountain[] {
            new Mountain(1, "Grouse Mountain", -123.0834, 49.3808, "North Vancouver, BC", 1231.0); // 1231 meters
            new Mountain(2, "Mount Seymour", -122.9499, 49.3676, "North Vancouver, BC", 1449.0); // 1449 meters
            new Mountain(3, "Cypress Mountain", -123.2045, 49.3925, "West Vancouver, BC", 1440.0); // Highest peak is 1440 meters, but Cypress encompasses multiple peaks
            new Mountain(4, "Mount Strachan", -123.2106, 49.3801, "West Vancouver, BC", 1454.0); // 1454 meters
            new Mountain(5, "Black Mountain", -123.2005, 49.4000, "West Vancouver, BC", 1217.0); // 1217 meters
            new Mountain(6, "Mount Fromme", -123.0773, 49.3676, "North Vancouver, BC", 1185.0); // 1185 meters
            new Mountain(7, "Mount Garibaldi", -123.0497, 49.8507, "Near Squamish, BC", 2678.0); // 2678 meters
            new Mountain(8, "The Lions", -123.2014, 49.4500, "West Vancouver, BC", 1646.0); // 1646 meters for West Lion
            new Mountain(9, "Mount Brunswick", -123.1908, 49.5000, "Lions Bay, BC", 1788.0); // 1788 meters
            new Mountain(10, "Mount Harvey", -123.2000, 49.4833, "Lions Bay, BC", 1652.0);
            new Mountain(11, "Mount Hanover", -123.1833, 49.5167, "Lions Bay, BC", Unknown);
            new Mountain(12, "Capilano Mountain", -123.1234, 49.4833, "West Vancouver, BC", 1276.0);
            new Mountain(13, "Hollyburn Mountain", -123.1906, 49.3607, "West Vancouver, BC", 1326.0);
            new Mountain(14, "Mount Fisher", -122.9167, 49.2833, "North Vancouver, BC", Unknown);
            new Mountain(15, "Mount Crickmer", -122.9333, 49.2500, "Maple Ridge, BC", Unknown);
            new Mountain(16, "Mount Burnham", -122.9000, 49.2667, "Maple Ridge, BC", Unknown);
            new Mountain(17, "Golden Ears", -122.4958, 49.1667, "Maple Ridge, BC", 1716.0);
            new Mountain(18, "Edge Peak", -122.5083, 49.1667, "Maple Ridge, BC", 1683.0);
            new Mountain(19, "Blanshard Peak", -122.4667, 49.2000, "Maple Ridge, BC", 1551.0);
            new Mountain(20, "Mount Robie Reid", -122.3833, 49.3000, "Mission, BC", 2096.0);
            new Mountain(21, "Mount Judge Howay", -122.3333, 49.3167, "Mission, BC", 2262.0);
            new Mountain(22, "Silverdaisy Mountain", -120.9333, 49.1667, "Hope, BC", 2063.0);
            new Mountain(23, "Snass Mountain", -121.3667, 49.1167, "Manning Park, BC", Unknown);
            new Mountain(24, "Mount Outram", -121.0667, 49.1667, "Manning Park, BC", 2461.0);
            new Mountain(25, "Three Brothers Mountain", -120.9500, 49.0667, "Manning Park, BC", 2272.0);
            new Mountain(26, "Mount McFarlen", -121.8333, 49.1333, "Chilliwack, BC", Unknown);
            new Mountain(27, "Mount Cheam", -121.7000, 49.1667, "Chilliwack, BC", 2112.0);
            new Mountain(28, "Liumchen Mountain", -122.0833, 49.0667, "Chilliwack, BC", Unknown);
            new Mountain(29, "Mount Lindeman", -121.4667, 49.1333, "Chilliwack, BC", 2163.0);
            new Mountain(30, "Mount Rexford", -121.4333, 49.1000, "Chilliwack, BC", 2316.0);
        };
    }
}


