<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Take Home Pay</title>
</head>
<body>

<form action="process.html" method="post">
	Enter Name: <input type="text" name="name" placeholder="Enter name:" required>
	<br>
	<table>
		<tr>
			<td>Enter Sales Code: </td>
			<td>
				A<input type="radio" name="code" value="A" required><br>
				B<input type="radio" name="code" value="B" required><br>
				C<input type="radio" name="code" value="C" required><br>
			</td>
		</tr>
	</table>
	Enter Sales Amount: <input type="number" name="sales" placeholder="Enter Sales:" required min=1>
	<br><input type="submit" value="Submit">
	<inp	ut type="reset" value="reset">
</form>
</body>
</html>