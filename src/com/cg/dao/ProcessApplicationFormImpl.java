package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.employee.util.DBUtil;
import com.cg.entities.ApplicationForm;
import com.cg.exception.UniversityException;

public class ProcessApplicationFormImpl implements IProcessApplicationForm {
	
	Connection con;
	ISearchApplicationFormById searchApplicationFormById;
	
	public ProcessApplicationFormImpl()
	{
		con = DBUtil.getConnect();
	}
	
	public ApplicationForm processApplicationForm(int id, String setStatus) throws UniversityException
	{
		
		searchApplicationFormById = new SearchApplicationFormByIdImpl();		//Dependency;Tight Coupling!! Refactor the code
		ApplicationForm applicationForm  = searchApplicationFormById.searchFormById(id);
		String qry = "UPDATE application_forms SET status = ?";
		try
		{
			PreparedStatement pstmt = con.prepareStatement(qry);
			pstmt.setString(1, setStatus);
			int row = pstmt.executeUpdate();
			if(row > 0)
			{
				applicationForm  = searchApplicationFormById.searchFormById(id);
			}
			else 
			{
				throw new UniversityException("Can not Modify Application Form having id " + id);
			}
		}catch(SQLException e)
		{
			throw new UniversityException(e.getMessage());
		}
		return applicationForm;
	}
}
