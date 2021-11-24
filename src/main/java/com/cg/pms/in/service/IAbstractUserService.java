package com.cg.pms.in.service;

import com.cg.pms.in.model.AbstractUser;

public interface IAbstractUserService {

	public AbstractUser login(AbstractUser abstractUser);
	public String logout(String userName);
}
