package com.cg.dao;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import com.cg.employee.util.DBUtil;
import com.cg.entities.ApplicationForm;
import com.cg.exception.UniversityException;

public class FillApplicationFormImp implements IFillApplicationForm {
	
	Connection con;
	
	public FillApplicationFormImp()
	{
		con = DBUtil.getConnect();
	}
	
	public int addApplicationForm(ApplicationForm applicationForm) throws UniversityException
	{
		String qry = "INSERT INTO application_forms VALUES("
				+ "seq_application_id.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, null, ? )";
		int id = 0;
		String name = applicationForm.getName();
		LocalDate dob = applicationForm.getDob();
		java.sql.Date sqlDOB = Date.valueOf(dob);
		String qualification = applicationForm.getQualification();
		int marks = applicationForm.getMarks();
		String goals = applicationForm.getGoals();
		String email = applicationForm.getEmail();
		int scheduledProgramId = applicationForm.getScheduledProgramId();
		//String status = applicationForm.getStatus();
		LocalDate dateOfInterview = applicationForm.getDateOfInterview();
		java.sql.Date sqlDateOfInterview = Date.valueOf(dateOfInterview);
		//LocalDate bDate = date.toLocalDate();
		
		try
		{
			PreparedStatement pstmt = con.prepareStatement(qry);
			pstmt.setString(1, name);
			pstmt.setDate(2, sqlDOB);
			pstmt.setString(3, qualification);
			pstmt.setInt(4, marks);
			pstmt.setString(5, goals);
			pstmt.setString(6, email);
			pstmt.setInt(7, scheduledProgramId);
			pstmt.setDate(8, sqlDateOfInterview);
			int row = pstmt.executeUpdate();
			if(row > 0)
			{
				id = getCurrApplicationId();
			}
			else
				throw new UniversityException("Apllication Form Fillup Failed!");
		}catch(SQLException e)
		{
			throw new UniversityException(e.getMessage());
		}
		return id;
	}
	
	
	public int getCurrApplicationId() throws UniversityException
	{
		int id = 0;
		String qry = "SELECT seq_application_id.CURRVAL FROM DUAL";
		try
		{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			if(rs.next())
				 id = rs.getInt(1);
			else
				throw new UniversityException("Error in getting Current Sequence Number "
						+ "of Application Form");
		}catch(SQLException e)
		{
			throw new UniversityException(e.getMessage());
		}
		return id;
	}
	
}
