package com.flightapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.entity.User;
import com.flightapp.service.UserService;

@RestController
@RequestMapping("/flight/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public Long CreateUser(@RequestBody User user) {
		Long id = userService.saveUser(user);
		return id;
	}
	
	
	

//	@GetMapping("/getusers")
//	public List<User> getAlluser() {
//		List<User> users = userService.getAllUser();
//		return users;
//	}
//
//	@GetMapping("/getuser/{email}")
//	public User getUser(@PathVariable("email") String email) {
//		User user = userService.getUser(email);
//		// System.out.println(user);
//		return user;
//	}
//
//	@DeleteMapping("/delete/{id}")
//	public ResponseEntity<User> deleteUser(@PathVariable Long id) {
//		ResponseEntity<User> responseEntity = new ResponseEntity<User>(HttpStatus.OK);
//		try {
//			userService.deleteUser(id);
//		} catch (Exception e) {
//			e.printStackTrace();
//			responseEntity = new ResponseEntity<User>(HttpStatus.NOT_FOUND);
//		}
//		return responseEntity;
//	}
//
//	@PutMapping("/update/{id}")
//	public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long id) {
//		ResponseEntity<User> responseEntity = new ResponseEntity<User>(HttpStatus.OK);
//		try {
//			userService.updateUser(user, id);
//		} catch (Exception e) {
//			e.printStackTrace();
//			responseEntity = new ResponseEntity<User>(HttpStatus.NOT_FOUND);
//		}
//		return responseEntity;
//	}
}
