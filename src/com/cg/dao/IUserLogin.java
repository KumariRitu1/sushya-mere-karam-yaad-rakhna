package com.cg.dao;

import com.cg.entities.LoginReturnValues;
import com.cg.entities.Users;
import com.cg.exception.UniversityException;

public interface IUserLogin {
	
	public LoginReturnValues authentication(Users users, LoginReturnValues loginReturnValues) throws UniversityException;
	

}
