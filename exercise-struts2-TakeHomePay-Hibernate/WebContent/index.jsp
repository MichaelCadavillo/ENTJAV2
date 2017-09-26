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
<s:form action="process.action" method="post">
		<s:textfield label="Enter Name" key="name" size="35"/>
		<s:radio list="#{'1':'A', '2':'B', '3':'C'}" value="1" label="Enter Sales Code" key='code'/>
		<s:textfield label="Enter Sales Amount" key="sales"/>
		<s:submit value="Compute"/>
		<s:reset/>
	</s:form>
</body>
</html>