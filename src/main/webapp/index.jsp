<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<body>
<%
	String name=request.getParameter("name");
%>
<h2>Hello <%= name %>!</h2>
</body>
</html>
