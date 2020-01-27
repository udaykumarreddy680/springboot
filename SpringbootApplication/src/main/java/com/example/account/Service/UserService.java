package com.example.account.Service;

import com.example.account.Domain.User;
import com.example.account.Dto.UserDto;

public interface UserService {
	
	
	User addUser(User user);
	
	User getUserById(Long userId);
	
	void deleteUser(Long userId);

}
