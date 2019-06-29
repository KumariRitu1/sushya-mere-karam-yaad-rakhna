package com.cg.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.employee.util.DBUtil;
import com.cg.entities.ProgramOffered;
import com.cg.exception.UniversityException;

public class ViewProgramImpl implements IViewProgram {
	
	Connection con;
	
	public ViewProgramImpl()
	{
		con = DBUtil.getConnect();
	}
	
	public List<ProgramOffered> showAllProgram() throws UniversityException
	{
		ArrayList<ProgramOffered> programOfferedList = new ArrayList<ProgramOffered>();
		String qry = "SELECT * FROM program_offered";
		ProgramOffered programOffered = new ProgramOffered();
		try
		{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			while(rs.next())
			{
				programOffered.setProgramName(rs.getString(1));
				programOffered.setDescription(rs.getString(2));
				programOffered.setEligibility(rs.getString(3));
				programOffered.setDuration(rs.getInt(4));
				programOffered.setDegreeCertificateOffered(rs.getString(5));
				programOfferedList.add(programOffered);
			}
			
		}catch(SQLException e)
		{
			throw new UniversityException(e.getMessage());
		}
		return programOfferedList;
	}
	

}
