<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%int num1 = Integer.parseInt(request.getParameter("num1")); %>
	<%int num2 = Integer.parseInt(request.getParameter("num2")); %>
	<%String oprn = request.getParameter("operation"); %>

	<%if(oprn.equals("Add")){ %>
	Result = <%=num1+num2 %>
	<%} %>
	<%if(oprn.equals("Sub")){ %>
	Result = <%=num1-num2 %>
	<%} %>
	<%if(oprn.equals("Mul")){ %>
	Result = <%=num1*num2 %>
	<%} %>
	<%if(oprn.equals("Div")){ %>
	Result = <%=num1/num2 %>
	<%} %>
	
</body>
</html>