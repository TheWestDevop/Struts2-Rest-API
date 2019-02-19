/**
 * 
 */
package com.restful.service;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Adedayo
 *
 */
public class DBConnection {

 public static Connection createConnection(){
	 Connection connect = null;
	 String url = "jdbc:mysql://loclhost:3306/PaymentStack";
	 String user = "root";
	 String password = "root";
	 
	 try{
		     try{
		    	 
			          Class.forName("com.mysql.jdbc.Driver");
			          
		         }catch(ClassNotFoundException e){
		        	 
			             e.printStackTrace();
		         }
		  connect = DriverManager.getConnection(url,user,password);
		  System.out.print("POST ESTABLISHING A  DATABASE CONNECTION -" + connect);
		     
		     
	 }catch(Exception e){
		 e.printStackTrace();
	 }
	 
	return connect;
	 
 }
}
