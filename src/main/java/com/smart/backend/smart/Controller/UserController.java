package com.smart.backend.smart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.backend.smart.Entities.User;
import com.smart.backend.smart.Services.UserServices;

@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/v1")
@RestController
public class UserController {

	@Autowired
	UserServices userServices;
	
	@GetMapping("/")
	public String test() {
	return "Hello Everyone";
	}
	
	@GetMapping("/user")
	List<User> getAllUsers(){
		return  userServices.getAllUsers();
	}
	@PostMapping("/user")
	User createUser(@RequestBody User user)
	{
		return userServices.addUser(user);
	}	
	
}
