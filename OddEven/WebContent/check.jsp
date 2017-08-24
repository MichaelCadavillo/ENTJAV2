<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
    	String result = "";
    	String num = request.getParameter("num");
    	char[] numArr = num.toCharArray();
    	
    	if((numArr[0]%2 == 0) && (numArr[num.length()-1]%2 == 1)){
			result = "The First Number is Even, Last Number is Odd";
		}else if((numArr[0]%2 == 1) && (numArr[num.length()-1]%2 == 0)){
			result = "The First Number is Odd, Last Number is Even";
		}else if((numArr[0]%2 == 0) && (numArr[num.length()-1]%2 == 0)){
    		result = "Both First and Last Number are Even";
    	}else if((numArr[0]%2 == 1) && (numArr[num.length()-1]%2 == 1)){
    		result = "Both First and Last Number are Odd";

    	}
    	
    %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><%= result %></title>
</head>
<body style="text-align: center;">
		<h1 style="margin-top: 40vh;"><%= result %></h1>
	
</body>
</html>