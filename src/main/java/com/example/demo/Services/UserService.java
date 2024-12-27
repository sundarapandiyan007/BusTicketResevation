package com.example.demo.Services;

import java.util.List;

import com.example.demo.Dto.UserDto;
import com.example.demo.model.Users;

public interface UserService {
	public Users signUp(Users users);
	public Users logIn(UserDto userDto) throws Exception;
	public List<Users> getUsers();

}
