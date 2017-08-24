<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <jsp:useBean id="records" type="java.sql.ResultSet" scope="request"/>
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
  <link rel="stylesheet" href="css/layout.css">

  <style media="screen">
 table {
 border-collapse: collapse;
 border-spacing: 0;
 width: 100%;
 border: 1px solid #ddd;
   }

   th, td {
       border: none;
       text-align: left;
       padding: 8px;
   }

   tr:nth-child(even){background-color: #f2f2f2}

 </style>

<title>MRT Records</title>
</head>
<body>
 <%@ include file="design/navbar.html" %>
	<div class="container-fluid">
		<div style="width: auto; height: auto; padding: 20px; background-color: white; text-align: center; border-radius: 20px;">
			<div style="overflow-y: scroll; height: 50vh;">
				<table>
					<tr>
						<th>#</th>
						<th>Last Name</th>
						<th>First Name</th>
						<th>Destination</th>
						<th>Destination Fare</th>
					</tr>
					<%
						while (records.next()) {
					%>
					<tr align="center">
						<td><%=records.getInt("id")%></td>
						<td><%=records.getString("lastName")%></td>
						<td><%=records.getString("firstName")%></td>
						<td><%=records.getString("destination")%></td>
						<td><%=records.getDouble("destinationFare")%></td>
					</tr>
					<%
						}
					%>
				</table>
			</div>
			<br>
			<form action="display.jsp">
				<button class="btn btn-default center" type="submit" name="submit">View
					List of Profits</button>
			</form>
			<p>
				Click <a href="index.html#station" style="color: blue;">here</a> to
				go back to home.
			</p>

		</div>
	</div>
	
	<hr>
	<%@ include file="design/footer.jsp"%>

</body>
</html>
