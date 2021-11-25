package com.cg.pms.in.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pms.in.model.AbstractUser;
import com.cg.pms.in.service.AbstractUserService;

@RestController
public class AbstractUserController {

	private static final Logger LOG = LoggerFactory.getLogger(AbstractUserController.class);

	@Autowired
	private AbstractUserService userService;

	// http://localhost:8082/register
	@PostMapping("/register")
	public ResponseEntity<AbstractUser> register(@RequestBody AbstractUser abstractUser) {
		LOG.info("Controller register");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "User registered successfully.");
		LOG.info(headers.toString());
		return new ResponseEntity<AbstractUser>(userService.register(abstractUser), headers, HttpStatus.CREATED);
	}

	// http://localhost:8082/login
	@PutMapping("/login")
	public ResponseEntity<AbstractUser> login(@RequestBody AbstractUser abstractUser) {
		LOG.info("Controller login");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "User logged in successfully.");
		LOG.info(headers.toString());
		return new ResponseEntity<AbstractUser>(userService.login(abstractUser),headers,HttpStatus.OK);
	}

	// http://localhost:8082/logout
	@PutMapping("/logout")
	public ResponseEntity<String> logout(@RequestBody String userName) {
		LOG.info("Controller logout");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "User logged out successfully.");
		LOG.info(headers.toString());
		return  new ResponseEntity<String>(userService.logout(userName),headers,HttpStatus.OK);
	}
}
