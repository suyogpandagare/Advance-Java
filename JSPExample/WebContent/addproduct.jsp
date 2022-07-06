<%@page import="study.DAO.DAO" isErrorPage="false" errorPage="myerror.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="LOGO.jsp" %>
<form action="">
	Enter Id :<input type="number" name="id" /> <br/>
	Enter Name :<input type="text" name="name" /> <br/>
	Enter Cost :<input type="number" name="cost" /> <br/>
	<input type="submit" value="add" /> 
</form>

<%                                                   /* JSP Scriplet */
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String cost = request.getParameter("cost");
	
	if(id != null)
	{
		int pid = Integer.parseInt(id);
		int pcost = Integer.parseInt(cost);

		DAO dao = new DAO();
		dao.addProduct(pid, name, pcost);
		
	
	}
	
	
%>


</body>
</html>