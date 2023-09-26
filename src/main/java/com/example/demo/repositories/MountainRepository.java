package com.example.demo.repositories;

import com.example.demo.models.Mountain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MountainRepository extends JpaRepository<Mountain, Integer> {
    
}
