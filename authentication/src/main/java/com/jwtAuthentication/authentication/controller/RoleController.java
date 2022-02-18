package com.jwtAuthentication.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwtAuthentication.authentication.entity.Role;
import com.jwtAuthentication.authentication.service.RoleService;

@RestController
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@PostMapping("/createRole")
	public Role createRole(@RequestBody Role role)
	{
		return roleService.createRole(role);
		
	}
}
