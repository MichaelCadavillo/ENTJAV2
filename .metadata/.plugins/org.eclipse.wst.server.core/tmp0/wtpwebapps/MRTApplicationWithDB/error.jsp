<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="error" type="java.lang.String" scope="request"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Oops! - MRT Station</title>
</head>
<body>
  <%@ include file="design/navbar.html" %>
  <div class="container-fluid">
    <br><br><br>
    
    <div style="width: auto; height: auto; padding: 20px; background-color: white; text-align:center; border-radius: 20px;">
    <h2 style="color:#ff0000; text-align:center;"><%= error %></h2>
    <br>
    <div style="text-align:center">
    	<a href="index.html" style="color:#000000"><button>Go Back</button></a>
    </div>
    <br>
    </div>
  </div>
	
	<hr>
<%@ include file="design/footer.jsp" %>
</body>
</html>
