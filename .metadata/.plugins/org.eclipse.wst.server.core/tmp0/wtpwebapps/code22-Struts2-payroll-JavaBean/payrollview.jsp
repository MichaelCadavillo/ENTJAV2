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
	<p>Employee Name: <b>${payroll.name}</b></p>
	<p>Hours Worked: <b>${payroll.hoursWorked}</b></p>
	<p>Rate per Hour: <b>${payroll.payRate}</b></p>
	<p>Basic Pay: <b>${payroll.basicPay}</b></p>
	<p>Overtime Pay: <b>${payroll.overtimePay}</b></p>
	<p>Gross Pay: <b>${payroll.grossPay}</b></p>
	<p>Withholding Tax: <b>${payroll.taxDeduction}</b></p>
	<p>NET PAY: <b>${payroll.netPay}</b></p>
	
	<hr>
	
	<h2>Struts 2 Payroll Web Application</h2>
	<p>Employee Name: <b><s:property value="payroll.name"/></b></p>
	<p>Hours Worked: <b><s:property value="payroll.hoursWorked"/></b></p>
	<p>Rate per Hour: <b><s:property value="payroll.payRate"/></b></p>
	<p>Basic Pay: <b><s:property value="payroll.basicPay"/></b></p>
	<p>Overtime Pay: <b><s:property value="payroll.overtimePay"/></b></p>
	<p>Gross Pay: <b><s:property value="payroll.grossPay"/> </b></p>
	<p>Withholding Tax: <b><s:property value="payroll.taxDeduction"/> </b></p>
	<p>NET PAY: <b><s:property value="payroll.netPay"/> </b></p>
	<hr>
	<p><i>&copy; 2017 iACADEMY Game Changers</i></p>
</body>
</html>