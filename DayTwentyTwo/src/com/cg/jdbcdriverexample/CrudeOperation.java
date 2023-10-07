package com.cg.jdbcdriverexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudeOperation {
	
	//Create
	public static void addEmployee() throws SQLException {
		Connection con  = DBUtil.getConnection();
		Statement stmt = con.createStatement();
		String sqlinsert = "INSERT into Employee(Id,Name,Salary,Bonus) values(2,'Abhishek',450000,2050)";
		int status = stmt.executeUpdate(sqlinsert);
		if(status == 1) {
			System.out.println("Entery is added");
		}
		
	}
	//Update
	public static void updateEmployee() throws SQLException {
		Connection con  = DBUtil.getConnection();
		Statement stmt = con.createStatement();
		String sqlupdate = "UPDATE Employee SET Bonus = 1000 WHERE Id = 1";
		int status = stmt.executeUpdate(sqlupdate);
		if(status == 1) {
			System.out.println("Update is Successfully");
		}		
	}
	//Delete
	public static void deleteEmployee() throws SQLException {
		Connection con  = DBUtil.getConnection();
		Statement stmt = con.createStatement();
		String sqldelete = "DELETE from Employee WHERE Id = 1";
		int status = stmt.executeUpdate(sqldelete);
		if(status == 1) {
			System.out.println("Delete is Successfully");
		}	
	}
	// Reteriev ById
	public static void reterieveById() throws SQLException {
		Connection con = DBUtil.getConnection();
		Statement stmt = con.createStatement();
		String sqlreterieve = "SELECT * from Employee WHERE Id = 2";
		ResultSet rst = stmt.executeQuery(sqlreterieve);
		if(rst.next()) {
			int id = rst.getInt("Id");
			String name = rst.getString("Name");
			int salary = rst.getInt("salary");
			int bonus = rst.getInt("Bonus");
			System.out.println(id+ " "+name+" "+salary+" "+bonus);
			
		}else {
			System.out.println("No Record Found");
		}
		
	}
}
