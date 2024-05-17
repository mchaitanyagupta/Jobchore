package com.mnc.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mnc.springboot.Entity.User;

@Repository
public interface Userrepo extends JpaRepository<User, Integer> {
	 User findByEmail(String email);
    // Custom query methods can be defined here if needed
}
