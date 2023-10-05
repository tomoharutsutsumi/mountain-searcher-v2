package com.mountainsearcher.app.repositories;

import com.mountainsearcher.app.models.Mountain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MountainRepository extends JpaRepository<Mountain, Integer> {
    
}