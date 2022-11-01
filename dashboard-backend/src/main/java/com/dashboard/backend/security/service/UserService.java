package com.dashboard.backend.security.service;

import com.dashboard.backend.security.entities.User;
import com.dashboard.backend.security.entities.UserRole;

import java.util.Set;

public interface UserService {

    public User saveUser(User user, Set<UserRole> userRoles) throws Exception;

    public User getUser(String username);

    public void deleteUser(Long userId);

}
