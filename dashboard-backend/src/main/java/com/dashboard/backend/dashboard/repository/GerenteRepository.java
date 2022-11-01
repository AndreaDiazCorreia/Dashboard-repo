package com.dashboard.backend.dashboard.repository;

import com.dashboard.backend.dashboard.entities.GerenteDash;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GerenteRepository extends JpaRepository<GerenteDash, Integer> {

}
