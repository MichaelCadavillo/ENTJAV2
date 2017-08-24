<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="emp" type="model.EmployeeBean" scope="application"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Take Home Pay</title>
</head>
<body>
	<p>Employee Name: <jsp:getProperty property="name" name="emp"/></p>
	<p>Sales Code: <jsp:getProperty property="code" name="emp"/></p>
	<p>Sales Amount: <b>Php<jsp:getProperty property="sales" name="emp"/></b></p>
	<p>Sales Gross Commission: <b>Php<jsp:getProperty property="gross" name="emp"/></b></p>
	<p>Sales Commission: <b>Php<jsp:getProperty property="commission" name="emp"/></b></p>
	<p>Take Home Pay: <b>Php<jsp:getProperty property="takeHomePay" name="emp"/></b></p>
	
	<a href="index.jsp"><button> **GO BACK** </button></a> 

</body>
</html>