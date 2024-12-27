package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.UserDto;
import com.example.demo.Repository.UserRepository;
import com.example.demo.model.Users;
@Service
public class UserServiceImpl implements UserService  {
	@Autowired
	private UserRepository userRepository;

	@Override
	public Users signUp(Users users) {
		// TODO Auto-generated method stub
		return userRepository.save(users);
	}

	@Override
	public Users logIn(UserDto userDto) throws Exception {
		// TODO Auto-generated method stub
		try {
			return userRepository.findByUserNameAndPassword(userDto.getUserName(), userDto.getPassword());
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			throw new Exception("user name not found");
		
		}
		
	}

	@Override
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
