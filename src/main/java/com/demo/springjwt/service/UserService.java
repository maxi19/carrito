package com.demo.springjwt.service;

import com.demo.springjwt.payload.request.UserDto;

public interface UserService {

	public void createUser(UserDto user ) throws Exception;
}
