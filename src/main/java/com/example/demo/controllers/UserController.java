package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private final static Logger LOG = Logger.getLogger("com.example.demo.controllers.UserController");

	// Services
	@Autowired
	UserService userService;

	@GetMapping("getUsers")
	public ResponseEntity<?> getUsers() {
		Map<String, Object> response = new HashMap<>();

		if (userService.getUsuarios().isEmpty()) {
			response.put("data", "No se encuentran usuarios Registrados");
		} else {
			response.put("data", userService.getUsuarios());
		}
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.ACCEPTED);
	}

}