package com.cg.service;

import com.cg.entities.LoginReturnValues;
import com.cg.entities.Users;
import com.cg.exception.UniversityException;

public interface IUniversityApplicatoin {
	public LoginReturnValues authentication(Users users, LoginReturnValues loginReturnValues) throws UniversityException;

}
