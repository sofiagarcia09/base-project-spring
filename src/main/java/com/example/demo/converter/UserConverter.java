package com.example.demo.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.dto.UserDTO;
import com.example.demo.models.User;

@Component("UserConverter")
public class UserConverter {

	public UserDTO userToUserDTO(User user) {
		
		if(user != null ) {
			UserDTO userDTO = new UserDTO();

			userDTO.setId(user.getId());
			userDTO.setName(user.getName());
			userDTO.setLastname(user.getLastname());
			userDTO.setCreateDatabase(user.getCreateDatabase());
			userDTO.setStatus(user.getStatus());
			userDTO.setRoles(user.getRoles());
			return userDTO;
		}
		return null;
	}

	public User userDTOToUser(UserDTO userDTO) {
		User user = new User();

		user.setId(userDTO.getId());
		user.setName(userDTO.getName());
		user.setLastname(userDTO.getLastname());
		user.setCreateDatabase(userDTO.getCreateDatabase());
		user.setStatus(userDTO.getStatus());
		user.setRoles(userDTO.getRoles());

		return user;

	}

	public List<UserDTO> usersToUsersDTO(Iterable<User> users) {

		List<UserDTO> usersDTO = new ArrayList<UserDTO>();

		for (User user : users) {
			UserDTO userDTO = new UserDTO();
			userDTO.setId(user.getId());
			userDTO.setName(user.getName());
			userDTO.setLastname(user.getLastname());
			userDTO.setCreateDatabase(user.getCreateDatabase());
			userDTO.setStatus(user.getStatus());
			userDTO.setRoles(user.getRoles());
			
			usersDTO.add(userDTO);

		}

		return usersDTO;
	}
	
	public List<User> userDTOToUser(List<UserDTO> usersDTO) {

		List<User> users = new ArrayList<User>();

		for (UserDTO userDTO : usersDTO) {
			User user = new User();
			user.setId(userDTO.getId());
			user.setName(userDTO.getName());
			user.setLastname(userDTO.getLastname());
			user.setCreateDatabase(userDTO.getCreateDatabase());
			user.setStatus(userDTO.getStatus());

			users.add(user);

		}

		return users;
	}

}
