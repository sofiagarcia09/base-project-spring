package com.example.demo.servicesimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.AddUserService;

@Service
public class AddUserServiceImpl implements AddUserService{
	
	@Autowired UserRepository userRepository;

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	

}
