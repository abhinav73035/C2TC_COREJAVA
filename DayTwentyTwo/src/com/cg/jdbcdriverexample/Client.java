package com.cg.jdbcdriverexample;

import java.sql.Connection;
import java.sql.SQLException;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Connection con = DBUtil.getConnection();
    if(con != null) {
    	System.out.println("JDBC: Connection is Established");
    }
    try {
		CrudeOperation.addEmployee();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
    
	/*
	 * try { CrudeOperation.updateEmployee(); } catch (SQLException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 */
    
	/*
	 * try { CrudeOperation.deleteEmployee(); } catch (SQLException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 */
    try {
		CrudeOperation.reterieveById();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
