<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="s" uri="/struts-tags" %>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts 2 Payroll Computation Web Application</title>
</head>
<body>
	<h2>Struts 2 Payroll Computation Web Application 
		using HTML Form</h2>	
	<form action="compute.action" method="post">
		<p>Enter Employee Name:
			<input type="text" name="name" size="35"/> 
		</p>
		<p>
			Enter Hours Worked:
			<input type="text" name="hoursWorked" size="5"/>
		</p>
		<p>
			Enter PayRate:
			<input type="text" name="payRate" size="10"/>
		</p>
		<p><input type='submit' value='Compute Salary'/></p>
		<p><input type='reset'/></p>
	</form>
	
	<hr/>
	<h2>Struts 2 Payroll Computation Web Application 
		using Struts 2 Tag Library Form</h2>
	<s:form action="compute.action" method="post">
		<s:textfield label="Enter Employee Name" name="name" 
			size="35"/>
		<s:textfield label="Enter Hours Worked" name="hoursWorked" 
			size="5"/>
		<s:textfield label="Enter Payrate" name="payRate" 
			size="10"/>
		<s:submit value="Compute Salary"/>
		<s:reset/>		
	</s:form>	
</body>
</html>