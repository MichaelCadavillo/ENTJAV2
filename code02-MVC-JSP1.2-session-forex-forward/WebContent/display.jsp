<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="forex" type="bpi.model.ForexBean" scope="session" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BPI x BDO Forex Form</title>
</head>
<body>
	<!-- header -->
	<%@include file="design/header.html" %>
		
		<p>Philippine Peso Amount: <b>Php<jsp:getProperty name="forex" property="pesoAmount"/></b>
		<p>Computed Value: <b>Php<jsp:getProperty name="forex" property="message"/></b>
		
	<!-- footer -->
	<%@include file="design/footer.jsp" %>
</body>
</html>