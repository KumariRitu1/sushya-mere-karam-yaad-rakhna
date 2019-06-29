package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.employee.util.DBUtil;
import com.cg.entities.LoginReturnValues;
import com.cg.entities.Users;
import com.cg.exception.UniversityException;

public class UserLoginImpl implements IUserLogin{
	
	Connection con;
	public UserLoginImpl()
	{
		con = DBUtil.getConnect();
	}
	
	@Override
	public LoginReturnValues authentication(Users users, LoginReturnValues loginReturnValues) throws UniversityException {
		
		String enteredPassword = users.getPassword();
		String dbPassword = null;
		loginReturnValues.setRole(null);
		loginReturnValues.setSuccess(false);
		int id = users.getId();
		String qry = "SELECT password,role FROM users WHERE id = ?";
		try
		{
			PreparedStatement pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				dbPassword = rs.getString("password");
				String role = rs.getString("role");
				if(dbPassword.equals(enteredPassword))
				{
					loginReturnValues.setRole(role);
					loginReturnValues.setSuccess(true);
				}
				else
				{
					throw new UniversityException("Id and Password do not match!");
				}
			}  
			else
			{
				throw new UniversityException("Id do not exist!");
			}
		}catch(SQLException e)
		{
			throw new UniversityException(e.getMessage() + "WTF");
		}
		return loginReturnValues;
	}
	
}
