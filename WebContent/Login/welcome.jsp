<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WELCOME</title>

</head>
<body>
<H3>LOGIN SUCCESSFUL</H3>
<h4>
HELLO,
<%=session.getAttribute("name") %>

<%
		String id = request.getParameter("id");
		%>
		<img src="getimage.jsp?id=<%=id%>" width="400px"/>.getAttribute("photo") %>


</h4>
</body>
</html>