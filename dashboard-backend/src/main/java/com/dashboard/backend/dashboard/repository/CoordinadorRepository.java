package com.dashboard.backend.dashboard.repository;

import com.dashboard.backend.dashboard.entities.CoordinadorDash;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordinadorRepository extends JpaRepository<CoordinadorDash, Integer> {

}
