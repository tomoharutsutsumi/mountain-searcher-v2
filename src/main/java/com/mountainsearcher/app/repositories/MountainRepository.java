package com.mountainsearcher.app.repositories;

import com.mountainsearcher.app.models.Mountain;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MountainRepository extends JpaRepository<Mountain, Integer> {
    boolean existsById(Integer id);
    boolean existsByName(String name);

    List<Mountain> findAll();
    List<Mountain> findByHeightGreaterThan(int height);
}