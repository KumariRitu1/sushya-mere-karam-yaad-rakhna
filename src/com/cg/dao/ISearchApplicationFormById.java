package com.cg.dao;

import com.cg.entities.ApplicationForm;
import com.cg.exception.UniversityException;

public interface ISearchApplicationFormById {
	public ApplicationForm searchFormById(int id) throws UniversityException;

}
