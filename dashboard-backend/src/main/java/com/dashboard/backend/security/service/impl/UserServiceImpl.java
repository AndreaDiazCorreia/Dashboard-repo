package com.dashboard.backend.security.service.impl;

import com.dashboard.backend.security.entities.User;
import com.dashboard.backend.security.entities.UserRole;
import com.dashboard.backend.security.repository.RoleRepository;
import com.dashboard.backend.security.repository.UserRepository;
import com.dashboard.backend.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User saveUser(User user, Set<UserRole> userRoles) throws Exception {
        User localUser = userRepository.findByUsername(user.getUsername());
        if(localUser != null){
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya ha iniciado");
        }
        else {
            for(UserRole userRole:userRoles){
                roleRepository.save(userRole.getRole());

            }
            user.getUserRoles().addAll(userRoles);
            localUser = userRepository.save(user);
        }
        return localUser;
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId) {
    userRepository.deleteById(userId);
    }


}
