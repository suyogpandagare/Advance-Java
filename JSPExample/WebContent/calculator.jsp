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
	<form action="output.jsp">
	
	Num1 : <input type="number" name="num1"  placeholder="Enter Num1 here"/>
	</br></br>Num2 : <input type="number" name="num2" placeholder="Enter Num2 here" />
	</br ></br><select name="operation"> 
		<option> -select option- </option>
		<option> Add  </option>
		<option> Sub  </option>
		<option> Mul  </option>
		<option> Div  </option>
		     </select>
		     
	</br></br><input type="submit" value="calculate" />

</form>
</body>
</html>