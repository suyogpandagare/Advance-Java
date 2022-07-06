<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- EL : shorthand notation ${ expression } -->

	<p>Welcome ${param.data }</p>
	<p>Welcome <%=request.getParameter("data") %></p>
	
	<p> Page level data = ${pageScope.numbers } </p>
	<p> Request data = ${requestScope.year } </p>
	<p> Session data = ${sessionScope.message } </p>
	<p> Application data = ${applicationScope.quote } </p>
	<p> Student data = ${ applicationScope.s1.getSubject() }</p>
	
	
</body>
</html>