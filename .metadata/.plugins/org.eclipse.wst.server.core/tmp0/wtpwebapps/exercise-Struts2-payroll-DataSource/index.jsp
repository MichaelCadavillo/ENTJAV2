<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts 2 Payroll Web Application</title>
</head>
<body>
	
	<h2>Struts 2 Payroll Web Application</h2>
	<s:form action="compute.action" method="post">
		<s:textfield label="Enter Employee Name" key="name" size="35"/>
		<s:textfield label="Enter Hours Worked" key="hoursWorked" size="5"/>
		<s:textfield label="Enter Pay Rate" key="payRate" size="10"/>
		<s:submit value="Compute Salary"/>
		<s:reset/>
	</s:form>
</body>
</html>