package com.example.account.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.account.Domain.User;
import com.example.account.Service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping(value = "/v1/adduser")
	public ResponseEntity<User> addUser(@RequestBody User user)
	{
		userService.addUser(user);
		return new ResponseEntity<User>(HttpStatus.OK);
	}
	
	

}
