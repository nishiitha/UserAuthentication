package com.jwtAuthentication.authentication.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jwtAuthentication.authentication.dao.UserDao;
import com.jwtAuthentication.authentication.entity.Role;
import com.jwtAuthentication.authentication.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public User createUser(User user) {
		Role role = new Role();
        Set<Role> userRoles = new HashSet<>();
        role.setRoleDate("Partial Access");
        role.setRoleName("User");
        userRoles.add(role);
        user.setRole(userRoles);
        user.setUserPassword(getEncodedPassword(user.getUserPassword()));
		
		return userDao.save(user);
		
	}
	public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
	public List<String> getAllUserName() {
		return userDao.getAllUserName();
	}
}
