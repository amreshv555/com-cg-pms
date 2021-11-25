package com.cg.pms.in.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.cg.pms.in.model.AbstractUser;

@SpringBootTest
public class TestAbstractUserService {

	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private AbstractUserService service;
	
	@Test
	void testLogin() {
		AbstractUser expected = context.getBean(AbstractUser.class);
		expected.setUid(1);
		expected.setUserName("akash");
		expected.setPassword("akash");
	boolean result = service.isLoggedIn;
		assertTrue(result);
	}

	

}
