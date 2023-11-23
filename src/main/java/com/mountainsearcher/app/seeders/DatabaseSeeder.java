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
            new Mountain(1, "Grouse Mountain", 49.3808, -123.0834, "North Vancouver, BC", 1231),
            new Mountain(2, "Mount Seymour", 49.3676, -122.9499, "North Vancouver, BC", 1449),
            new Mountain(3, "Cypress Mountain", 49.3925, -123.2045, "West Vancouver, BC", 1440),
            new Mountain(4, "Mount Strachan", 49.3801, -123.2106, "West Vancouver, BC", 1454),
            new Mountain(5, "Black Mountain", 49.4000, -123.2005, "West Vancouver, BC", 1217),
            new Mountain(6, "Mount Fromme", 49.3676, -123.0773, "North Vancouver, BC", 1185),
            new Mountain(7, "Mount Garibaldi", 49.8507, -123.0497, "Near Squamish, BC", 2678),
            new Mountain(8, "The Lions", 49.4500, -123.2014, "West Vancouver, BC", 1646),
            new Mountain(9, "Mount Brunswick", 49.5000, -123.1908, "Lions Bay, BC", 1788),
            new Mountain(10, "Mount Harvey", 49.4833, -123.2000, "Lions Bay, BC", 1652),
            new Mountain(11, "Mount Hanover", 49.5167, -123.1833, "Lions Bay, BC", 1748),
            new Mountain(12, "Capilano Mountain", 49.4833, -123.1234, "West Vancouver, BC", 1276),
            new Mountain(13, "Hollyburn Mountain", 49.3607, -123.1906, "West Vancouver, BC", 1326),
            new Mountain(14, "Mount Fisher", 49.2833, -122.9167, "North Vancouver, BC", 3053),
            new Mountain(15, "Mount Crickmer", 49.2500, -122.9333, "Maple Ridge, BC", 1359),
            new Mountain(16, "Mount Burnham", 49.2667, -122.9000, "Maple Ridge, BC", 2869),
            new Mountain(17, "Golden Ears", 49.1667, -122.4958, "Maple Ridge, BC", 1716),
            new Mountain(18, "Edge Peak", 49.1667, -122.5083, "Maple Ridge, BC", 1683),
            new Mountain(19, "Blanshard Peak", 49.2000, -122.4667, "Maple Ridge, BC", 1551),
            new Mountain(20, "Mount Robie Reid", 49.3000, -122.3833, "Mission, BC", 2096),
            new Mountain(21, "Mount Judge Howay", 49.3167, -122.3333, "Mission, BC", 2262),
            new Mountain(22, "Silverdaisy Mountain", 49.1667, -120.9333, "Hope, BC", 2063),
            new Mountain(23, "Snass Mountain", 49.1167, -121.3667, "Manning Park, BC", 2309),
            new Mountain(24, "Mount Outram", 49.1667, -121.0667, "Manning Park, BC", 2461),
            new Mountain(25, "Three Brothers Mountain", 49.0667, -120.9500, "Manning Park, BC", 2272),
            new Mountain(26, "Mount McFarlen", 49.1333, -121.8333, "Chilliwack, BC", 2090),
            new Mountain(27, "Mount Cheam", 49.1667, -121.7000, "Chilliwack, BC", 2112),
            new Mountain(28, "Liumchen Mountain", 49.0667, -122.0833, "Chilliwack, BC", 1837),
            new Mountain(29, "Mount Lindeman", 49.1333, -121.4667, "Chilliwack, BC", 2163),
            new Mountain(30, "Mount Rexford", 49.1000, -121.4333, "Chilliwack, BC", 2316)

        };
    }
}


