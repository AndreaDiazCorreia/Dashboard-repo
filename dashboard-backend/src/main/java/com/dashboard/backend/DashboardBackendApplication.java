package com.dashboard.backend;

import com.dashboard.backend.security.entities.Role;
import com.dashboard.backend.security.entities.User;
import com.dashboard.backend.security.entities.UserRole;
import com.dashboard.backend.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DashboardBackendApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DashboardBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*User user = new User();

		user.setName("Team");
		user.setLastName("Team");
		user.setUsername("Team");
		user.setPassword(bCryptPasswordEncoder.encode("accenture"));
		user.setEmail("Team@accenture.com");

		Role role = new Role();
		role.setRoleId(4L);
		role.setName("TEAM");

		Set<UserRole> userRoles = new HashSet<>();
		UserRole userRole = new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);
		userRoles.add(userRole);

		User userSaved = userService.saveUser(user, userRoles);
		System.out.println(userSaved.getUsername());*/

	}
}
