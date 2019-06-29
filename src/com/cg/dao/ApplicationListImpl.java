package com.cg.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.cg.employee.util.DBUtil;
import com.cg.entities.ApplicationForm;

import com.cg.exception.UniversityException;

public class ApplicationListImpl implements IApplicationList {
	Connection con;
	
	public ApplicationListImpl()
	{
		con = DBUtil.getConnect();
	}
	
	public List<ApplicationForm> applicationLists() throws UniversityException
	{
		ArrayList<ApplicationForm> applicationFormsList = new ArrayList<ApplicationForm>();
		String qry = "SELECT * FROM application_form";
		ApplicationForm applicationForm = null;
		
		int id = 0;
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
		
		try
		{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			while(rs.next())
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
				applicationFormsList.add(applicationForm);
			}
			
		}catch(SQLException e)
		{
			throw new UniversityException(e.getMessage());
		}
		if(applicationFormsList.isEmpty())
			throw new UniversityException("No Application List is found");
		return applicationFormsList;
	}
	

}
