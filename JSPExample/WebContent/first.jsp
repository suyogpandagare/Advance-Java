<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="LOGO.jsp" %>
	<h1>Hii from JSP</h1>
	
	<% for(int i=0;i<100;i++){ %>
	</br><b><i>Hello Hii <%=i %></i></b>  
	
	<% }//end of for loop %>          <!-- inside scriplet we write java  -->

</body>
</html>