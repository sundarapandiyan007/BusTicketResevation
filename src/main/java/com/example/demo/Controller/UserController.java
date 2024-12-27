package com.example.demo.Controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.UserDto;
import com.example.demo.Services.UserService;
import com.example.demo.model.Users;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("signUp")
	public Map<String, Object> singUp(@RequestBody Users users){
		Users user=userService.signUp(users);
		Map<String, Object> response =new HashMap<>();
		if(user!=null) {
			response.put("message", "success");
			response.put("status", HttpStatus.OK);
			
		}else {
			response.put("message", "Faild");
			response.put("status", HttpStatus.BAD_REQUEST);
		}
		response.put("Staptime",new Date());
		return response;
		
		
	}
	
	@PostMapping("/Login")
	public Map<String, Object> login(@RequestBody UserDto users) throws Exception {
		Users user= userService.logIn(users);
		Map<String, Object> response =new HashMap<>();
		if(user!=null) {
			response.put("message", "success");
			response.put("status", HttpStatus.OK);
			
		}else {
			response.put("message", "Faild");
			response.put("status", HttpStatus.BAD_REQUEST);
		}
		response.put("Staptime",new Date());
		return response;

	}
	
	@GetMapping("/get/users")
	public List<Users> getUsers(){
		return userService.getUsers();
	}
	
	
}
