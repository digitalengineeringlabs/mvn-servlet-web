<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<body>
<%
	String[] names= (String[]) request.getAttribute("names");
	for(int i=0; i<names.length;i++){
	String name = names[i];
	%>
		<h2>Hello test <%= name %>!</h2>	
	<%
	}
%>

</body>
</html>
