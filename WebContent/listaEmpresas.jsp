<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.List, br.com.brbtechnology.gerenciador.servlet.Empresa"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<ul>
		<%
		List<Empresa> listEmpresas = (List<Empresa>)request.getAttribute("empresas");
		for (Empresa empresas : listEmpresas) {
		%> 
			<li><%= empresas.getNome() %></li>
			<li><%= empresas.getCNPJ() %></li>
		<%
			}
		%>
	</ul>

</body>
</html>