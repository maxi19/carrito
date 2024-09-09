package com.demo.springjwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springjwt.models.User;
import com.demo.springjwt.payload.request.UserDto;
import com.demo.springjwt.repository.UserRepository;


@Service
public class UserServiceImp implements UserService {


	@Autowired
	UserRepository userRepository;
	

	@Override
	public void createUser(UserDto user) throws Exception {
		User userModel = new User();
		userModel.setUsername(user.getUsername());
		userModel.setPassword(user.getPassword());
		this.userRepository.saveAndFlush(userModel);
		
	}

}
