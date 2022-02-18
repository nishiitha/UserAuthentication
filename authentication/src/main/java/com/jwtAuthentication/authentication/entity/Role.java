package com.jwtAuthentication.authentication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {

	@Id
	private String roleName;
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDate() {
		return roleDate;
	}
	public void setRoleDate(String roleDate) {
		this.roleDate = roleDate;
	}
	private String roleDate;
	
}
