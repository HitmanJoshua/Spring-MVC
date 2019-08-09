<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
	<h1>Customer Details</h1>
	Name: ${customer.name }
	<br />
	<br /> Country: ${customer.country }
	<br />
	<br /> Favourite Cuisine: ${customer.favCuisine }
	<br />
	<br /> Books to buy:
	<br />
	<ul>
		<c:forEach var="bookgf" items="${customer.book }">
			<li>${bookgf }</li>
		</c:forEach>
	</ul>
	<br/><br/>
	Discount:${customer.discountCoupons }
</body>
</html>