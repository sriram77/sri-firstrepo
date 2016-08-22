<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find Actor</title>
</head>
<body>
		<form method="post" action="actor.jsp">
	<label> Enter First Name :</label>
	<input type="text" name="firstname">
	<br>
<input type="submit" value="Find Actors" >
<input type="reset" value="reset">
</form>
</body>
</html>