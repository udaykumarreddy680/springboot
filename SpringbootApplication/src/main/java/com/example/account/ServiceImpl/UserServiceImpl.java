package com.example.account.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.account.Domain.User;
import com.example.account.Repository.UserRepository;
import com.example.account.Service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	public User addUser(User user) {
		userRepository.save(user);
		return user;
	}

	public User getUserById(Long userId) {
		
		return userRepository.findOne(userId);
	}

	public void deleteUser(Long userId) {
		
		userRepository.delete(userId);
	} 
	
	

}
