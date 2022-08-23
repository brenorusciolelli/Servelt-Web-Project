<%
String nomeEmpresa = (String)request.getAttribute("nomeEmpresa");
String cnpj = (String)request.getAttribute("cnpj");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Novas Empresas</title>
</head>
<body>
<h3>Empresa: ${nomeEmpresa}</h3>
<h3>CNPJ: ${cnpj}</h3>
<h2>Cadastrada com Sucesso!</h2>

<table>
  <tr>
    <th>Empresa</th>
    <th>CNPJ</th>
  </tr>
  <tr>
    <td>${nomeEmpresa}</td>
    <td>${cnpj}</td>
  </tr>
</table>
</body>
</html>