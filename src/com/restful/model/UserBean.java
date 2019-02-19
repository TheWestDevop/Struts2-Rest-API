/**
 * 
 */
package com.restful.model;

/**
 * @author Adedayo
 *
 */
public class UserBean {
	
	private String fname;
	private String lname;
	private String email;
	private String phonenumber;
	private String country;
	private String currency;
	private String cardno;
	private String cvv;
	private String expirymonth;
	private String expiryyear;
	private String amount;
	
	
	public UserBean() {
		super();
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String Lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getExpirymonth() {
		return expirymonth;
	}
	public void setExpirymonth(String expirymonth) {
		this.expirymonth = expirymonth;
	}
	public String getExpiryyear() {
		return expiryyear;
	}
	public void setExpiryyear(String expiryyear) {
		this.expiryyear = expiryyear;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	

}
