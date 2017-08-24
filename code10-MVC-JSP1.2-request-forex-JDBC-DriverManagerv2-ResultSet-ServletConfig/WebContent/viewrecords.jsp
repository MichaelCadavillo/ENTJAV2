<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:useBean id="records" type="java.sql.ResultSet" scope="request"/>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Records - MVC MODEL 2</title>
</head>
<body>
	<!-- header -->
	<%@include file="design/header.html" %>
	
	<h2>BPIxBDO Forex Collab Records</h2>
	<style>
		th {
    		background-color: #4CAF50;
    		color: white;
		}
		
		tr:nth-child(even) {background-color: #f0f0f0}
		
		th, td {
 	   		padding: 15px;
    		text-align: left;
		}
		
		tr:hover {background-color: #868686}
	</style>

	<div style="height: 30vh; width: 90vw; overflow-y: scroll;">
		<table align="center" style="width: 80vw;">
			<tr>
				<th>#</th>
				<th>Peso Amount</th>
				<th>Currency Type</th>
				<th>Equivalent Value</th>
			</tr>
			<%
				while (records.next()) {
			%>
			<tr>
				<td><%=records.getInt("id")%></td>
				<td><%=records.getString("pesoAmount")%></td>
				<td><%=records.getString("currencyType")%></td>
				<td><%=records.getString("message")%></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>

	<a href="index.jsp"><button>Go Back</button></a>
	
	<!-- footer -->
	<%@include file="design/footer.jsp" %>
</body>
</html>