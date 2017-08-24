<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

     

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
<title>MRT - Station</title>
</head>
<body>
  <link rel="stylesheet" href="css/layout.css">
 <%@ include file="design/navbar.html" %>
  <div class="container-fluid">

		<div style="width: auto; height: auto; padding: 20px; background-color: white; text-align:center; border-radius: 20px;">
			<p>The fare amount to <i>${mrtbean.destinationName}</i> station from
				<i>North Avenue</i> station is <b><i>&#8369;${mrtbean.destinationFare}</i></b></p>
			<p>Please remember you have to alight at <b><i>STOP ${mrtbean.stopNo}</i></b></p>
			
			<hr>
			
			<p>LIST OF FARE PROFITS</p>

			<p>TOTAL FARE FOR ALL STOP 1: &#8369;${mrtbean.stop1}</p>
			<p>TOTAL FARE FOR ALL STOP 2: &#8369;${mrtbean.stop2}</p>
			<p>TOTAL FARE FOR ALL STOP 3: &#8369;${mrtbean.stop3}</p>
			<p>TOTAL FARE FOR ALL STOP 4: &#8369;${mrtbean.stop4}</p>
			<p>TOTAL FARE FOR ALL STOP 5: &#8369;${mrtbean.stop5}</p>
			<p>TOTAL FARE FOR ALL STOP 6: &#8369;${mrtbean.stop6}</p>
			<br>
			
			<form action ="records.html">
				<button class="btn btn-default center" type="submit">View Records</button>
			</form>
			<p>
				Click <a href="index.html#station" style="color:blue;">here</a> to go back to home.
			</p>
		</div>
	</div> 
	
	<hr>
 <%@ include file="design/footer.jsp" %>
</body>
</html>
