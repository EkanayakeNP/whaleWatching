package com.whaleWatchingBooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whaleWatchingBooking.model.UserRole;
import com.whaleWatchingBooking.repository.UserRoleRepository;

@Service
public class UserRoleService {
	
	@Autowired
	private UserRoleRepository userRoleReposirory;
	
	public void addUserRole(UserRole userRole) {
		
		userRoleReposirory.save(userRole);
	}
	
	
}
