/**
 * 
 */
package com.restful.service;

import java.io.*;
import java.sql.*;

import com.restful.model.UserBean;


/**
 * @author Adedayo
 *
 */
public class PaymentService {
	Connection connect = null;
	PreparedStatement psmt = null;
	
	
	
	public String InsertData(UserBean userbean){
		
		try{
			connect = DBConnection.createConnection();
			
			String Query = "INSERT INTO PaymentData Value(?,?,?,?,?,?,?,?,?,?,?)";
			
			psmt = connect.prepareStatement(Query);
			
		
			psmt.setString(1, userbean.getFname());
			psmt.setString(2, userbean.getLname());
			psmt.setString(3, userbean.getEmail());
			psmt.setString(4, userbean.getPhonenumber());
			psmt.setString(5, userbean.getCountry());
			psmt.setString(6, userbean.getCurrency());
			psmt.setString(7, userbean.getCardno());
			psmt.setString(8, userbean.getCvv());
			psmt.setString(9, userbean.getExpirymonth());
			psmt.setString(10, userbean.getExpiryyear());
			psmt.setString(11, userbean.getAmount());
			
			if(psmt.execute()== false){
				return "error";
			}
				
			
		
			
			
		  	
		}catch(Exception e){
			
		}

		return "successful";
		
	}
    
}
