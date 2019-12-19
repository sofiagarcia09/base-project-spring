package com.example.demo.servicesimp;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.services.BaseService;


@Service
public class BaseServiceImpl implements BaseService {
	
	private final static Logger LOG= Logger.getLogger("com.example.demo.controllers.BaseController");
	

	@Override
	public ResponseEntity<?> getHolaMundo() {
		Map<String, Object> respuesta=new HashMap<>();		   
		   LOG.info("Hola Mundo desde Spring Boot- get hola mundo");
		   respuesta.put("respuesta", "Hola Mundo Desde Spring Boot (getHolaMundo)- 202Accepted");
		   return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.ACCEPTED);
	}

}
