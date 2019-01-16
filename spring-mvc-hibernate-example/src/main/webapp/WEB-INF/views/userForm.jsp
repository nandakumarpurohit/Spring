<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BORAJI.COM</title>
<style type="text/css">
fieldset {
	border: 1px solid #dedede;
}

legend {
	font-size: 20px;
	text-transform: uppercase;
}

.error {
	color: red;
}

.resltTable {
	width: 50%;
	border-collapse: collapse;
	border-spacing: 0px;
}

.resltTable td, .resltTable th {
	border: 1px solid #565454;
}
</style>
</head>
<body>
  <fieldset>
    <legend>User Input From</legend>
    <form:form action="saveUser" method="post" modelAttribute="user">
      <table>
        <tr>
          <th>Name</th>
          <td>
            <form:input path="name" /> 
            <form:errors path="name" cssClass="error" />
          </td>
          <th>Email</th>
          <td>
            <form:input path="email" /> 
            <form:errors path="email" cssClass="error" />
          </td>
          <td><button type="submit">Submit</button></td>
        </tr>
      </table>
    </form:form>
  </fieldset>
  <br>
  <br>

  <fieldset>
    <legend>Users List</legend>
    <table class="resltTable">
      <tr>
        <th>Name</th>
        <th>Email</th>
      </tr>
      <c:forEach items="${users}" var="user">
        <tr>
          <td>${user.name}</td>
          <td>${user.email}</td>
        </tr>
      </c:forEach>

    </table>
  </fieldset>

</body>
</html>