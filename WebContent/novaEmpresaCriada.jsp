<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Novas Empresas</title>
</head>
<body>
	
	<c:if test="${not empty nomeEmpresa}">
		Empresa ${nomeEmpresa} cadastrada com sucesso!
	</c:if>
	
	<c:if test="${empty nomeEmpresa}">
		Nenhuma empresa encontrada!
	</c:if>

</body>
</html>