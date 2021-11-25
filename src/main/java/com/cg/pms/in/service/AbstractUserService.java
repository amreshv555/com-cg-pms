package com.cg.pms.in.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.pms.in.exception.AbstractUserAlreadyExistsException;
import com.cg.pms.in.exception.AbstractUserNotFoundException;
import com.cg.pms.in.model.AbstractUser;
import com.cg.pms.in.repository.AbstractUserRepository;

@Service
public class AbstractUserService implements IAbstractUserService{

	public boolean isLoggedIn;

	private AbstractUser tempUser;

	private static final Logger LOG = LoggerFactory.getLogger(AbstractUserService.class);

	@Autowired
	AbstractUserRepository abstractUserRepository;

	public AbstractUser register(AbstractUser abstractUser) {
		LOG.info("register");
		if (abstractUserRepository.findByUserName(abstractUser.getUserName()) != null) {
			LOG.error("User already exists");
			throw new AbstractUserAlreadyExistsException();
		} else {
			LOG.info("Register successfully");
			return abstractUserRepository.save(abstractUser);
		}
	}

	public AbstractUser login(AbstractUser abstractUser) {
		LOG.info("login");
		tempUser = abstractUserRepository.findByUserName(abstractUser.getUserName());
		if (tempUser.getUserName().equalsIgnoreCase(abstractUser.getUserName())) {
			LOG.info("User logged in successfully");
			isLoggedIn = true;
			return tempUser;
		}
		LOG.error("User not found");
		throw new AbstractUserNotFoundException();
	}

	public String logout(String userName) {
		LOG.info("logout");
		if (isLoggedIn) {
			isLoggedIn = false;
			return "User logged out successfully.";
		}
		LOG.error("User not found");
		throw new AbstractUserNotFoundException();
	}
}
