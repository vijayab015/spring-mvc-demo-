<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student1">
  First name:<br>
  <input type="text" name="firtsName" >
  <br>
  Last name:<br>
  <input type="text" name="lastName" >
  <br><br>
  <input type="submit" value="Submit">
</form:form> 
</body>
</html>