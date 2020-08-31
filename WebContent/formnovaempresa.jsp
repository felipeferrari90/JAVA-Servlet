<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.List, br.com.gerence.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   
    <!--  tudo depois do endereco IP é considerado um context root, e esse contexto é 
         /gerencer/novaempresa (como estava o action da page) alterar o context root(diferente
         de nome de projeto) faz com que vc nao acesse mais os links, enfim escrever o nome
         do contexto no jsp nao é um boa pratica  -->
         
         <c:url value="/novaempresa" var="linkServletNovaEmpresa"/>
         
    <!--  a tag url é util para isso  -->
    

	<form action="${linkServletNovaEmpresa}" method="post">
	   <label>nome da empresa: </label>
	   <input type="text" name="nome">
	   
	    <label>data de abertura: </label>
	   <input type="text" name="data">
	   
	   <input type="submit" value="cadastrar">
	</form>
</body>
</html>