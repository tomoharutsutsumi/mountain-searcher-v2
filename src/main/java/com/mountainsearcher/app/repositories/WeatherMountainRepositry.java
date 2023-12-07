package com.mountainsearcher.app.repositories;

import com.mountainsearcher.app.models.WeatherMountain;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface WeatherMountainRepository extends JpaRepository<WeatherMountain, Integer> {
    boolean existsById(Integer id);
    boolean existsByName(String name);

    List<WeatherMountain> findAll();
}