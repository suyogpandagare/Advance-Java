<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
	<body style="background-color:bisque;">
	 <%@include file="title.jsp" %>
	 
	<%
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		if(uname != null && uname != "" && pwd != null && pwd != "")
		{%>
			<input type="date" name="date" />
			<br/><input type="text" name="purpose" />
			<br/><input type="radio" name="official" />
			<br/><input type="radio" name="personal" />
			<br/><input type="radio" name="official" />
			<br/><input type="reset" name="reset" />
			<input type="submit" name="submit" />
		<%}
		else
		{%>
		
			<jsp:forward page="Login.jsp">
	 		<jsp:param value="Incorrect Login please try again" name="message"/> 
	 		</jsp:forward>

			
		<%}
	
	%>
        <h1 align="center" style="font-size:45px;">WELCOME</h1>
        <br/><br/>
        <h2 align="center"><a href="SignUp.html">Click Here For Sign-Up</a></h2>
        

        <h2 align="center"><a href="SignIn.html">Click Here For Sign-In</a></h2>    

</body>
</html>