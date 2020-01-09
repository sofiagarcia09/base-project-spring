package com.example.demo.servicesimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDTO;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.UserService;
import com.example.demo.converter.UserConverter;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	@Qualifier("UserConverter")
	private UserConverter UserConverter;
	
	

	@Override
	public List<UserDTO> getUsuarios() {		
		return UserConverter.usersToUsersDTO(userRepository.findAll());		
	}

	@Override
	public UserDTO getUserByName(String name) {
		return UserConverter.userToUserDTO(userRepository.getUserByName(name));
	}

	@Override
	public UserDTO findByName(String name) {
		return UserConverter.userToUserDTO(userRepository.findByName(name));
	}

}
