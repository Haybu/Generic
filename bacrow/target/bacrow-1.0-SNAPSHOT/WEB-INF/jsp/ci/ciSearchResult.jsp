<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h2>CI Search Result:</h2>

<table>
<tr>
<td>CI Number:</td><td>${ciCommand.cinum}</td>
</tr>
<tr>
<td>Label:</td><td>${ciCommand.label}</td>
</tr>
<tr>
<td>Location:</td><td>${ciCommand.location}</td>
</tr>
<tr>
<td>Type:</td><td>${ciCommand.type}</td>
</tr>

</table>

</body>
</html>