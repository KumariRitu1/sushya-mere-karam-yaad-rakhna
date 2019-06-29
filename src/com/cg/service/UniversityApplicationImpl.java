package com.cg.service;

import com.cg.dao.IUserLogin;
import com.cg.dao.UserLoginImpl;
import com.cg.entities.LoginReturnValues;
import com.cg.entities.Users;
import com.cg.exception.UniversityException;

public class UniversityApplicationImpl implements IUniversityApplicatoin {

	private IUserLogin userLoginDAO;

	public UniversityApplicationImpl() {
		userLoginDAO = new UserLoginImpl();
	}



	
	
	@Override
	public LoginReturnValues authentication(Users users, LoginReturnValues loginReturnValues) throws UniversityException {
		// TODO Auto-generated method stub
		return userLoginDAO.authentication(users, loginReturnValues);
	}

}
