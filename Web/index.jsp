<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>INDEX PAGE</title>
</head>
<body style="color:white;background:black;">

<div align="center">
   <h1> Ticket Payment </h1>
<s:form action="/api/charge">
<div class="row">
<div class="col-md-6">
<s:textfield label="Firstname" name="fname" key="fname"/>
</div>
<div class="col-md-6">
<s:textfield label="Lastname" name="lname" key="lname"/>
</div>
</div>
<div class="row">
<div class="col-md-6">
<s:textfield label="Email" name="email" key="email"/>
</div>
<div class="col-md-6">
<s:textfield label="Phone Number" name="phonenumber" key="phonenumber"/>
</div>
</div>
<div class="row">
<div class="col-md-6">
<s:textfield label="Country" name="country" key="country"/>
</div>
<div class="col-md-6">
<s:textfield label="Currency" name="currency" key="currency"/>
</div>
</div>
<div class="row">
<div class="col-md-6">
<s:textfield label="Card No" name="cardno" key="cardno"/>
</div>
<div class="col-md-6">
<s:textfield label="Cvv" name="cvv" key="cvv"/>
</div>
</div>
 <div class="row">
<div class="col-md-6">
<s:textfield label="Expiry Month" name="expirymonth" key="country"/>
</div>
<div class="col-md-6">
<s:textfield label="Expiry Year" name="expiryyear" key="currency"/>
</div>
</div>
<div class="row">
<div class="col">
<s:textfield label="Amount" name="amount" key="amount"/>
</div>
</div>
<s:submit key="Pay" style="width:100%;height:40px;font-weight:bold;"/>
</s:form>

</div>

</body>
</html>