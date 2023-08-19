package com.smart.backend.smart.Services;

import java.util.List;

import com.smart.backend.smart.Entities.User;

public interface UserServices {
	
	//Get users
	List<User> getAllUsers();
	//add User
	User addUser(User user);
	//update User
	//View single User

}
