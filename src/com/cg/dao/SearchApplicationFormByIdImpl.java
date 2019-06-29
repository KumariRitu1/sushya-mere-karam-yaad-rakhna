package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import com.cg.employee.util.DBUtil;
import com.cg.entities.ApplicationForm;
import com.cg.exception.UniversityException;

public class SearchApplicationFormByIdImpl implements ISearchApplicationFormById{
	
	Connection con;
	public SearchApplicationFormByIdImpl()
	{
		con = DBUtil.getConnect();
	}
	
	@Override
	public ApplicationForm searchFormById(int id) throws UniversityException
	{
		ApplicationForm applicationForm = null;
		String name = null;
		LocalDate dob = null;
		java.sql.Date sqlDOB = null;
		String qualification = null;
		int marks = 0;
		String goals = null;
		String email = null;
		int scheduledProgramId = 0;
		String status = null;
		LocalDate dateOfInterview = null;
		java.sql.Date sqlDateOfInterview;
		String qry = "SELECT * FROM application_forms WHERE id = ?";
		try
		{
			PreparedStatement pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				id = rs.getInt(1);
				name = rs.getString(2);
				sqlDOB = rs.getDate(3);
				dob = sqlDOB.toLocalDate();
				qualification = rs.getString(4);
				marks = rs.getInt(5);
				goals = rs.getString(6);
				email = rs.getString(7);
				scheduledProgramId = rs.getInt(8);
				status = rs.getString(9);
				sqlDateOfInterview = rs.getDate(10);
				dateOfInterview = sqlDateOfInterview.toLocalDate();
				applicationForm = new ApplicationForm(id, name, dob, qualification, marks, goals, email, scheduledProgramId, status, dateOfInterview);	
			}
			else
			{	
				throw new UniversityException("Application Id " + id + " is not found");
			}
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return applicationForm;
	}	
}
