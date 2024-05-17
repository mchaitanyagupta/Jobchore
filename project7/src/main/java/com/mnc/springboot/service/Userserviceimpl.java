package com.mnc.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnc.springboot.Entity.User;
import com.mnc.springboot.repository.Userrepo;
@Service
public class Userserviceimpl implements Userservice{
	
	
	@Autowired
	private Userrepo userrepo;

	@Override
	public User save(User user) {
		userrepo.save(user);
		return null;
	}


	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return userrepo.findByEmail(email);
	}


}
