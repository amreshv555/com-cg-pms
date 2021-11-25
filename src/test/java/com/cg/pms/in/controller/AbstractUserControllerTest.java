package com.cg.pms.in.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

@SpringBootTest
public class AbstractUserControllerTest {
	
	@Autowired
	private AbstractUserController abstractController;
	
	@Test
	public void testlogin() {
		
		HttpStatus expected = abstractController.login(null)
				
				
		
	}

}
