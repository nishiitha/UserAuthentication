package com.jwtAuthentication.authentication.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jwtAuthentication.authentication.entity.User;

public interface UserDao extends JpaRepository<User, String>{
	
	@Query("select u.userName from User u")
	   List<String> getAllUserName();

}
