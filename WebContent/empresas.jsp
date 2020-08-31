<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@  page import="java.util.List, br.com.gerence.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <!--  is not empty e empty sao da linguagem EL e TEST é a expressao de condicao do JSTL core -->

	 <c:if test="${ not empty empresa }">
		  <h1>EMPRESA ${ empresa.nome } CRIADA COM SUCESSO</h1>
	 </c:if>
		
     <h4>Lista de Empresas</h4>
     
     <!--  empresa.getNome() => empresa.nome (feito por debaixo dos panos pela EL) -->
     
     <!-- PATTERN = dd/MM/yyyy = padrao de data ou algo -->
     
     <!-- fmt é uma taglib de formatacao, que agora na exibicao de dados um date ira exibir 
     nesse pattern -->
      
     <ul>
     
	     <c:forEach items="${empresas}" var="empresa">
	     
	        <li>${empresa.nome} - <fmt:formatDate value="${empresa.data}" pattern="dd/MM/yyyy"/> 
	        	<a href="/gerence/mostraempresa?id=${empresa.id}">alterar</a>
	        	<a href="/gerence/removeempresa?id=${empresa.id}">remover</a>
	        </li>
	        
	     </c:forEach> 
     
     </ul>
     
     
         
      
    


</body>
</html>