package com.smart.backend.smart.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.backend.smart.Entities.User;
import com.smart.backend.smart.Repositories.UserRepo;

@Service
public class UserServiceImpl implements UserServices{

	@Autowired
	UserRepo userRepo;
	
	@Override
	public User addUser(User user) {
		System.out.println(user);
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}
	
}
