package com.jwtAuthentication.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwtAuthentication.authentication.dao.RoleDao;
import com.jwtAuthentication.authentication.entity.Role;

@Service
public class RoleService {

	@Autowired
	private RoleDao roleDao;
	
	public Role createRole(Role role)
	{
		return roleDao.save(role);
		
	}
}
