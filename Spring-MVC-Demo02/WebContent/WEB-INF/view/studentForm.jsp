<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Form</h2>
	<form action="processStudentFormV3" method="post">
		<label for="firstName"> Firstname: <input type="text"
			id="firstName" name="firstName" />
		</label> <br /> <br /> <label for="lastName"> Password: <input
			type="password" id="lastName" name="lastName" />
		</label> <br /> <br /> <label for="courseId"> Course ID: <input
			type="text" id="courseId" name="courseID" />
		</label><br />
		<br />
		<button type="submit">Submit</button>
	</form>
</body>
</html>