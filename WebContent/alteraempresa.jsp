<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   
    <!--  se vc manda de algum lugar e pendura um atributo de nome empresa
    vc nao precisa declarar uma variavel empresaa e usar setatribute, se vc usar
    a empresa declarada no EL, ja vai ser subtendido queé o nome da requisicao pendurada que foi
    que foi despachada -->
         
    <c:url value="/alteraempresa" var="linkServletNovaEmpresa"/>
    

	<form action="${linkServletNovaEmpresa}" method="post">
	
	   <input type="hidden" name="id" value="${empresa.id }">
	
	   <label>nome da empresa: </label>
	   <input type="text" name="nome" value="${empresa.nome}">
	   
	   <label>data de abertura: </label>
	   <input type="text" name="data" value="<fmt:formatDate value="${empresa.data}" pattern="dd/MM/yyyy"/>" />
	   
	   <input type="submit" value="cadastrar">
	   
	</form>
	
	
</body>
</html>