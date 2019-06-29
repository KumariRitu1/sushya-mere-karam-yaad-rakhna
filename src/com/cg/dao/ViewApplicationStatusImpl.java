package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.employee.util.DBUtil;
import com.cg.exception.UniversityException;

public class ViewApplicationStatusImpl implements IViewApplicationStatus {
	
	Connection con;
	
	public ViewApplicationStatusImpl()
	{
		con = DBUtil.getConnect();
	}
	
	public String viewApplicationStatus(int id) throws UniversityException
	{
		String status = null;
		String qry = "SELECT status FROM application_forms WHERE applicationId = ?";
		try
		{
			PreparedStatement pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
				status = rs.getString("status");
			else
				throw new UniversityException("Application having "
						+ "id: " + id + "not found");
		}catch(SQLException e)
		{
			throw new UniversityException(e.getMessage());
		}
		return status;
	}
}
