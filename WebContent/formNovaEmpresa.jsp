<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/novaempresa" var="linkServletNovaEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2 style="display: flex; justify-content: center;">Formulario para Cadastro de Empresa</h2>
	<div style="display: flex; justify-content: center">
		<form action="${linkServletNovaEmpresa}" method="post">
	Nome: <input type="text" name="nome" /><br><br>
	CNPJ: <input type="text" name="cnpj" /><br>
					<input type="submit" style="margin-top: 10px; margin-left: 159px">
	</form>
	</div>

</body>
</html>