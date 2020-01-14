package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.services.AddUserService;

@RestController
@RequestMapping("/registrar")
public class AddUserController {
	
	private final static Logger LOG = Logger.getLogger("com.example.demo.controllers.UserController");

	@Autowired
	AddUserService addUserService;
	
	
	@PostMapping("addUser")
	public ResponseEntity<?> save(@RequestBody User user){
		Map<String, Object> response = new HashMap<>();

		User userR = addUserService.addUser(user);
		if (userR == null) {
			response.put("data", "No se pudo regitrar el usuario");
		} else {
			response.put("data", userR);
		}
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.ACCEPTED);		
	}
	


}
