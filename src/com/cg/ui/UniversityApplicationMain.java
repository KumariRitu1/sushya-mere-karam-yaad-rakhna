package com.cg.ui;

import java.util.Scanner;

import com.cg.entities.LoginReturnValues;
import com.cg.entities.Users;
import com.cg.exception.UniversityException;
import com.cg.service.IUniversityApplicatoin;
import com.cg.service.UniversityApplicationImpl;

public class UniversityApplicationMain {

	public static void main(String[] args) {

		IUniversityApplicatoin universityApplication = new UniversityApplicationImpl();
		LoginReturnValues loginReturnValues;

		Scanner scan = new Scanner(System.in);

		boolean loginFlag = true;
		while (loginFlag) 
		{
			try 
			{
				System.out.println("Enter Userid");
				int id = scan.nextInt();
				System.out.println("Enter password");
				String password = scan.next();
				Users user = new Users(id, password);
				loginReturnValues = universityApplication.authentication(user, new LoginReturnValues());
				loginFlag = !loginReturnValues.isSuccess();
				if (loginReturnValues.isSuccess()) 
				{
					System.out.println(loginReturnValues.getRole());
				}
			}catch (UniversityException e) 
			{
				System.out.println(e.getMessage());
			}
		}

	}

}
