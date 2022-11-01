package com.dashboard.backend.security.repository;

import com.dashboard.backend.security.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {



}
