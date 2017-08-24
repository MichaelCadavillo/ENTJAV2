<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="errMsg" type="java.lang.String" scope="request" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BPI x BDO Forex Form</title>
</head>
<body>
	<!-- header -->
	<%@include file="design/header.html" %>
		
	<h2><font color='red'><%= errMsg %></font></h2>
		
	<!-- footer -->
	<%@include file="design/footer.jsp" %>
</body>
</html>