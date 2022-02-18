package com.jwtAuthentication.authentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwtAuthentication.authentication.entity.User;
import com.jwtAuthentication.authentication.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
		
	}
	
	@GetMapping("/onlyAdmin")
	@PreAuthorize("hasRole('Admin')")
	public String onlyAdmin() {
		return "Only for Adminss";
		
	}
	
	@GetMapping("/allUsers")
	@PreAuthorize("hasRole('User')")
	public  @ResponseBody List<String> getAllUserName() {
		return userService.getAllUserName();
				}
	
	
}
