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
		Using JSP Expression Language</h2>
	<p>Name: <b>${name}</b></p>
	<p>Hours Worked: <b>${hoursWorked}</b></p>
	<p>Pay Rate: <b>Php ${payRate}</b></p>
	<p>Basic Pay: <b>Php ${basicPay}</b></p>
	<p>Overtime: <b>Php ${overtimePay}</b></p>
	<p>Gross Pay: <b>Php ${grossPay}</b></p>
	<p>Withholding Tax: <b>Php ${withHoldingTax}</b></p>
	<p>NETPAY: <b>Php ${netPay}</b></p>
	<hr/>
	<h2>Struts 2 Payroll Computation Web Application 
		Using Struts 2 Tag Library</h2>
	<p>Name: <b><s:property value="name"/></b></p>
	<p>Hours Worked: <b><s:property value="hoursWorked"/></b></p>
	<p>Pay Rate: <b>Php <s:property value="payRate"/></b></p>
	<p>Basic Pay: <b>Php <s:property value="basicPay"/></b></p>
	<p>Overtime: <b>Php <s:property value="overtimePay"/></b></p>
	<p>Gross Pay: <b>Php <s:property value="grossPay"/></b></p>
	<p>Withholding Tax: <b>Php <s:property value="withHoldingTax"/></b></p>
	<p>NETPAY: <b>Php <s:property value="netPay"/></b></p>
	<hr/>
	
	<p><i>&copy; 2017 iACADEMY Game Changers</i></p>	
</body>
</html>