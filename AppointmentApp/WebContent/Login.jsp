<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <jsp:forward page="Homepage.jsp">
	 		<jsp:param value="Incorrect Login please try again" name="message"/> 
	 </jsp:forward>

    <body style ="background-color:bisque;">
    <%@include file="title.jsp" %>
        <h1 align="center">SIGN-IN</h1>

        <pre>

            <fieldset>
            <b> USERNAME: </b><input type="text" name="username" placeholder="USERNAME" />

            
            <b> PASSWORD: </b><input type="password" name="password" placeholder="PASSWORD" />
    
    		
            <%-- <%request.setAttribute("uname", username); %> --%>
            &emsp;<b><input type="submit" value="SUBMIT"  /></b>
            </fieldset>
        </pre>
        
    </body>
</form>
</body>
</html>