<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>


<body>
<h2>MDH Application</h2>

<form:form modelAttribute="ciCommand" method="POST" >

	<form:errors path="*" cssClass="errorblock" element="div" />

	<table>
		<tr>
			<td>CI Number:</td>
			<td><form:input path="cinum" /></td>
			<td><form:errors path="cinum" cssClass="error" /></td>
		</tr>
		<tr>
			<td>Label :</td>
			<td><form:input path="label" /></td>
			<td><form:errors path="label" cssClass="error" /></td>
		</tr>
		<tr>
			<td>Location :</td>
			<td><form:input path="location" /></td>
			<td><form:errors path="location" cssClass="error" /></td>
		</tr>
		<tr>
			<td>CI Type :</td>
			<td><form:input path="type" /></td>
			<td><form:errors path="type" cssClass="error" /></td>
		</tr>

		<tr>
			<td colspan="3"><input type="submit" value="Submit" /></td>
		</tr>
	</table>
</form:form>

</body>
</html>