<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error {
color:red;
}
</style>

<meta charset="ISO-8859-1">
<title>Customer Form</title>
</head>
<body>
	<h1>Customer Form</h1>
	<form:form action="processForm" modelAttribute="customer">
	Name:<form:input path="name" />
	<form:errors path="name" cssClass="error"/>
		<br />
		Country: <form:select path="country">
			<!--<form:option value="IN">India</form:option>
		<form:option value="JPN">Japan</form:option>
		<form:option value="RUS">Soviet Union</form:option>
		<form:option value="CK">Chalakudy</form:option>
		<form:option value="KM">Kasimedu</form:option>-->
			<form:options items="${customer.countryList }" />
		</form:select>
		<br />
		<br />
		<form:radiobuttons path="favCuisine"
			items="${customer.favCuisineList }" />
		<br />
		<br/>
		<legend>Select Book To Buy</legend>
		<form:checkbox path="book" value="Death Note"/>Death Note
		<form:checkbox path="book" value="Harry Potter"/>Harry Potter
		<form:checkbox path="book" value="Angels and Demons"/>Angels and Demons
		<form:checkbox path="book" value="Elon Musk"/>Elon Musk
		<form:errors path="book" cssClass="error"/>
		<form:label path="">
		Number of discount Coupons:
		<form:input path="discountCoupons"/>
		<form:errors path="discountCoupons" cssClass="error"/>
		</form:label>
		
		
		
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>