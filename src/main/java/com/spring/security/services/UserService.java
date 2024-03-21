package com.spring.security.services;

import com.spring.security.entity.User;

public interface UserService {
        
	public User saveUser(User user);
	
	public void removeSessionMessage();
}
