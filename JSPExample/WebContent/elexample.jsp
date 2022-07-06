<%@page import="study.data.StudentData"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="elex2.jsp">
	<input type="text" name="data" />
	<input type="submit" value="Enter"/>
	</form>
	<%
		List<Integer> nums = Arrays.asList(12,13,14,15);
		pageContext.setAttribute("numbers", nums);    /* for this page only */
		request.setAttribute("year", 1947);           /* for this page only */
		session.setAttribute("message", "tell about el");/* for all till this session is going on */
		application.setAttribute("quote", "Let's play");/* for all over the project available */
		
		StudentData stud = new StudentData("AA","Nagpur","Maths");/* this is also availble in all over the project it's like application scope data only */
		application.setAttribute("s1", stud);
		
		
	%>
	
	${pageScope.numbers }
	
	
</body>
</html>