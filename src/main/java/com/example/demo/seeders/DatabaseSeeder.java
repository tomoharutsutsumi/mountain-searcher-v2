package com.example.demo.seeders;

public class DatabaseSeeder {
    public static void main(String[] args) {
        // Setup EntityManager, Session, etc. depending on your ORM
        INSERT INTO mountains (name, longitude, latitude, location) VALUES
(1, 'Grouse Mountain', -123.0834, 49.3808, 'North Vancouver, BC'),
(2, 'Mount Seymour', -122.9499, 49.3676, 'North Vancouver, BC'),
(3, 'Cypress Mountain', -123.2045, 49.3925, 'West Vancouver, BC'),
(4, 'Mount Strachan', -123.2106, 49.3801, 'West Vancouver, BC'),
(5, 'Black Mountain', -123.2005, 49.4000, 'West Vancouver, BC'),
(6, 'Mount Fromme', -123.0773, 49.3676, 'North Vancouver, BC'),
(7, 'Mount Garibaldi', -123.0497, 49.8507, 'Near Squamish, BC'),
(8, 'The Lions', -123.2014, 49.4500, 'West Vancouver, BC'),
(9, 'Mount Brunswick', -123.1908, 49.5000, 'Lions Bay, BC'),
(10, 'Mount Harvey', -123.2000, 49.4833, 'Lions Bay, BC'),
(11, 'Mount Hanover', -123.1833, 49.5167, 'Lions Bay, BC'),
(12, 'Capilano Mountain', -123.1234, 49.4833, 'West Vancouver, BC'),
(13, 'Hollyburn Mountain', -123.1906, 49.3607, 'West Vancouver, BC'),
(14, 'Mount Fisher', -122.9167, 49.2833, 'North Vancouver, BC'),
(15, 'Mount Crickmer', -122.9333, 49.2500, 'Maple Ridge, BC'),
(16, 'Mount Burnham', -122.9000, 49.2667, 'Maple Ridge, BC'),
(17, 'Golden Ears', -122.4958, 49.1667, 'Maple Ridge, BC'),
(18, 'Edge Peak', -122.5083, 49.1667, 'Maple Ridge, BC'),
(19, 'Blanshard Peak', -122.4667, 49.2000, 'Maple Ridge, BC'),
(20, 'Mount Robie Reid', -122.3833, 49.3000, 'Mission, BC'),
(21, 'Mount Judge Howay', -122.3333, 49.3167, 'Mission, BC'),
(22, 'Silverdaisy Mountain', -120.9333, 49.1667, 'Hope, BC'),
(23, 'Snass Mountain', -121.3667, 49.1167, 'Manning Park, BC'),
(24, 'Mount Outram', -121.0667, 49.1667, 'Manning Park, BC'),
(25, 'Three Brothers Mountain', -120.9500, 49.0667, 'Manning Park, BC'),
(26, 'Mount McFarlen', -121.8333, 49.1333, 'Chilliwack, BC'),
(27, 'Mount Cheam', -121.7000, 49.1667, 'Chilliwack, BC'),
(28, 'Liumchen Mountain', -122.0833, 49.0667, 'Chilliwack, BC'),
(29, 'Mount Lindeman', -121.4667, 49.1333, 'Chilliwack, BC'),
(30, 'Mount Rexford', -121.4333, 49.1000, 'Chilliwack, BC');

        // Example seeding data
        User user1 = new User();
        user1.setName("John Doe");
        user1.setEmail("john@example.com");
        // ... save user1 to the database

        User user2 = new User();
        user2.setName("Jane Smith");
        user2.setEmail("jane@example.com");
        // ... save user2 to the database

        // Close connections, etc.
    }
}
}