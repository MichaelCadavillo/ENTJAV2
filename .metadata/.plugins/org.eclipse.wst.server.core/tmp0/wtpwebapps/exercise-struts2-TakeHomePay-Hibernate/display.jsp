<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Take Home Pay</title>
</head>
<body>
	<p>Employee Name: <b><s:property value="name"/></b></p>
	<p>Sales Code: <b><s:property value="code"/></b></p>
	<p>Sales Amount: <b>Php<s:property value="sales"/></b></p>
	<p>Sales Gross Commission: <b>Php<s:property value="gross"/></b></p>
	<p>Sales Commission: <b>Php<s:property value="commission"/></b></p>
	<p>Take Home Pay: <b>Php<s:property value="takeHomePay"/></b></p>
	
	<a href="index.jsp"><button> **GO BACK** </button></a> 

</body>
</html>