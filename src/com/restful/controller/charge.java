package com.restful.controller;



import org.codehaus.jackson.annotate.JsonProperty;
import org.jose4j.jwt.JwtClaims;

import com.restful.model.UserBean;
import com.restful.service.PaymentService;


public class charge {
	private String data;
	UserBean userbean = new UserBean();
	PaymentService paymentservice = new PaymentService();
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
	
	
	@JsonProperty
	public String create(){
		
		userbean.setFname(fname);
		userbean.setLname(lname);
		userbean.setEmail(email);
		userbean.setPhonenumber(phonenumber);
		userbean.setCountry(country);
		userbean.setCurrency(currency);
		userbean.setCardno(cardno);
		userbean.setCvv(cvv);
		userbean.setExpirymonth(expirymonth);
		userbean.setExpiryyear(expiryyear);
		userbean.setAmount(amount);
		
	    JwtClaims claims = new JwtClaims();
	    
	    claims.setAudience("Account-Holder");
	    claims.setExpirationTimeMinutesInTheFuture(130);
	    claims.setGeneratedJwtId();
	    claims.setIssuer("Adedayo-NG");
	    claims.setIssuedAtToNow();
	    claims.setNotBeforeMinutesInThePast(50);
	    claims.setSubject("Ticket Payment");
	    claims.setClaim("First Name", userbean.getFname());
	    claims.setClaim("Last Name", userbean.getLname());
	    claims.setClaim("Email", userbean.getEmail());
	    claims.setClaim("Phone Number :", userbean.getPhonenumber());
	    claims.setClaim("Country", userbean.getCountry());
	    claims.setClaim("Currency", userbean.getCurrency());
	    claims.setClaim("Card No", userbean.getCardno());
	    claims.setClaim("CVV", userbean.getCvv());
	    claims.setClaim("Expiry Month", userbean.getExpirymonth());
	    claims.setClaim("Expiry Year", userbean.getExpiryyear());
	    claims.setClaim("Amount", userbean.getAmount());
	    
	    paymentservice.InsertData(userbean);
		
	    setData(claims.toJson());
				
		System.out.print(claims.toJson());
		return "success";
		
	}
	public String index(){
		
		userbean.setFname(fname);
		userbean.setLname(lname);
		userbean.setEmail(email);
		userbean.setPhonenumber(phonenumber);
		userbean.setCountry(country);
		userbean.setCurrency(currency);
		userbean.setCardno(cardno);
		userbean.setCvv(cvv);
		userbean.setExpirymonth(expirymonth);
		userbean.setExpiryyear(expiryyear);
		userbean.setAmount(amount);
		
		 setData(paymentservice.InsertData(userbean));
		 
		 
		System.out.print("hello "+getFname()+" from GET");
		return "success";
		
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
	public void setLname(String lname) {
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
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
	

}
