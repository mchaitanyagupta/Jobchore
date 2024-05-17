package com.mnc.springboot.service;

import com.mnc.springboot.Entity.User;

public interface Userservice {
	public User save(User user);
	public User findByEmail(String email);

}
