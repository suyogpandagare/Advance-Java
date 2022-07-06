<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<tr><th><i> Number </i></th><th><i> Square </i></th><th><i> Cube </i></th></tr>
		<tr><td> <%for(int i=1;i<=100;i++){ %>
		<br /><i><%=i %></i>
		<%} %>
		</td>
		<td> <%for(int i=1;i<=100;i++){ %>
		<br /><i><%=i*i %></i>
		<%} %>
		</td>
		<td> <%for(int i=1;i<=100;i++){ %>
		<br /><i><%=i*i*i %></i>
		<%} %>
		</td></tr>
	</table>
</body>
</html>