package com.dashboard.backend.security.repository;

import com.dashboard.backend.security.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    public User findByUsername(String username);

}
