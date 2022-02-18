package com.jwtAuthentication.authentication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwtAuthentication.authentication.entity.Role;

@Repository
public interface RoleDao extends JpaRepository<Role, String>{

}
