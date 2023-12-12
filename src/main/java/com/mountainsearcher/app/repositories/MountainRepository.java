package com.mountainsearcher.app.repositories;

import com.mountainsearcher.app.models.Mountain;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MountainRepository extends JpaRepository<Mountain, Integer> {
    boolean existsById(Integer id);
    boolean existsByName(String name);

    List<Mountain> findAll();
    // List<Mountain> findByHeightGreaterThan(int height);
    List<Mountain> findByHeightBetween(minHeight, maxHeight);
    List<Mountain> findByHeight(int height) {
        if (height >= 3000) {
            return findByHeightBetween(height, 8000);
        } else if (height >= 2000) {
            return findByHeightBetween(height, 2999);
        } else if (height > 1000) {
            return findByHeightBetween(height, 1999);
        } else if (height < 1000) {
            return findByHeightBetween(0, 999);
        } else {
            throw new Error("Not defined constant height");
        }
    }
}