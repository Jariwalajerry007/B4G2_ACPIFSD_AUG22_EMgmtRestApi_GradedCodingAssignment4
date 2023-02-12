package com.restemployee.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.restemployee.repo.UserRepository;

@Component("userSecurity")
public class UserSecurity {

	@Autowired
	UserRepository userRepo;

	public boolean hasUserId(Authentication authentication, Integer userId) {

		int userID = userRepo.findByUserName(authentication.getName()).getUserId();
		if (userID == userId)
			return true;

		return false;

	}
}
