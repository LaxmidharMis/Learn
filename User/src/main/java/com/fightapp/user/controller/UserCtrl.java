package com.fightapp.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.user.service.UserService;

@RestController
@RequestMapping(value="/api/user/userctrl")
public class UserCtrl {
	
	@Autowired
	private UserService userService;
	
/**	@PostMapping(value = "/saveUser")
	public OutputModel saveUser(@RequestBody User user) {
		OutputModel model = new OutputModel();
		try {
			User saveUsers = userService.saveUser(user);
			model = new OutputModel(true, saveUsers.getUserEmail() + " User Created!!!!");
		}catch(Exception e) {
			System.err.println("Error "+ e);
			model = new OutputModel(false, "Somtheing Went to Wrong!!!!");
		}
		return model;
	}**/
	
}
