//package com.flightapp.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.flightapp.entity.User;
//import com.flightapp.exception.ResourceNotFoundException;
//import com.flightapp.repository.UserRepository;
//
//@Service
//public class UserServiceImpl implements UserService {
//	@Autowired
//	private UserRepository userRepository;
//
//	@Override
//	public Long saveUser(User user) {
//		User saveUser = userRepository.save(user);
//		return saveUser.getId();
//	}
//
//	@Override
//	public User getUser(String email) {
//		User user = userRepository.findByEmail(email);
//		// System.out.println(user);
//		return user;
//	}
//
//	@Override
//	public List<User> getAllUser() {
//		return userRepository.findAll();
//	}
//
//	@Override
//	public void deleteUser(Long id) {
//		userRepository.deleteById(id);
//	}
//
//	@Override
//	public User updateUser(User user, Long id) {
//		User exsistingUser = userRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
//		exsistingUser.setName(user.getName());
//		exsistingUser.setEmail(user.getEmail());
//		exsistingUser.setPassword(user.getPassword());
//		userRepository.save(exsistingUser);
//		return exsistingUser;
//	}
//
//}
