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
	<p>Employee Name: <b>${name}</b></p>
	<p>Hours Worked: <b>${hoursWorked}</b></p>
	<p>Rate per Hour: <b>${payRate}</b></p>
	<p>Basic Pay: <b>${basicPay}</b></p>
	<p>Overtime Pay: <b>${overtimePay}</b></p>
	<p>Gross Pay: <b>${grossPay}</b></p>
	<p>Withholding Tax: <b>${taxDeduction}</b></p>
	<p>NET PAY: <b>${netPay}</b></p>
	
	<hr>
	
	<h2>Struts 2 Payroll Web Application</h2>
	<p>Employee Name: <b><s:property value="name"/></b></p>
	<p>Hours Worked: <b><s:property value="hoursWorked"/></b></p>
	<p>Rate per Hour: <b><s:property value="payRate"/></b></p>
	<p>Basic Pay: <b><s:property value="basicPay"/></b></p>
	<p>Overtime Pay: <b><s:property value="overtimePay"/></b></p>
	<p>Gross Pay: <b><s:property value="grossPay"/> </b></p>
	<p>Withholding Tax: <b><s:property value="taxDeduction"/> </b></p>
	<p>NET PAY: <b><s:property value="netPay"/> </b></p>
	<hr>
	<p><i>&copy; 2017 iACADEMY Game Changers</i></p>
</body>
</html>