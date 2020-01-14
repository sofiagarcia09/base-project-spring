package com.example.demo.services;

import java.util.List;
import com.example.demo.dto.UserDTO;

public interface UserService {	
	
	public List<UserDTO> getUsuarios();
	
	public UserDTO getUserByName(String name);
	
	public UserDTO findByName(String name);

}
