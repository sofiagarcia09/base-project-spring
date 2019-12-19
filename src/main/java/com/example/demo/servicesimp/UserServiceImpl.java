package com.example.demo.servicesimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getUsuarios() {
		return (List<User>) userRepository.findAll();
	}

}
