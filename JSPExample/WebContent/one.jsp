<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>One.jsp</h1>
	
	 <%-- <jsp:forward page="two.jsp">
	 <jsp:param value="All Is Well" name="message"/> 
	 </jsp:forward> --%>
	
	<jsp:include page="two.jsp">
	 <jsp:param value="All Is Well" name="message"/> 
	</jsp:include>
	
	
</body>
</html>