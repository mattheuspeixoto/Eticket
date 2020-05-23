<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<title>Sistema E-ticket</title>
	<meta name="description" content="Aqui voce compra seu ingresso!">
	<link rel="icon" href="favicon.ico">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<script src="js/atores.js" type="text/javascript" > </script>
	<script src="js/contato.js" type="text/javascript" > </script>
	<script src="js/diretor.js" type="text/javascript" > </script>
	<script src="js/filme.js" type="text/javascript" > </script>
	<script src="js/listarAtores.js" type="text/javascript" > </script>
	<script src="js/salas.js" type="text/javascript" > </script>
	<script src="js/show.js" type="text/javascript" > </script>
	<script src="js/vendaCinema.js" type="text/javascript" > </script>
	<script src="js/vendaShow.js" type="text/javascript" > </script>
</head>
<body>
   <header>
		<div id="logo">
			<img src="Imagens/logo.png" alt="Logo e-Ticket" title="e-Ticket" whidth="300" height="100"/>	
		</div>	
	</header>
	<nav>
		<ul id="menu">
    			<li><a href="home.jsp">Home</a></li>
    			<li>
				<a href="#">Cadastro</a>
       				<ul>
					<li><a href="cadAtores.jsp">Atores</a></li>
                                        <li><a href="cadDiretor.jsp">Diretor</a></li>
                                        <li><a href="cadFilme.jsp">Filmes</a></li>
                                        <li><a href="cadSalas.jsp">Salas</a></li>
                                        <li><a href="cadShow.jsp">Shows</a></li>
                                        <li><a href="cadCliente.jsp">Usuario</a></li>
        			</ul>
    			</li>               
                              
			<li>
				<a href="#">Venda</a>
       				<ul>
					<li><a href="vendas_Cinema.jsp">Cinema</a></li>
					<li><a href="vendas_Show.jsp">Shows</a></li>
        			</ul>
    			</li>
                
                <li>
				<a href="#">Lista</a>
       				<ul>
					<li><a href="listaAtores.jsp">Atores</a></li>
					<li><a href="listaDiretor.jsp">Diretor</a></li>
					<li><a href="listaFilmes.jsp">Filmes</a></li>
					<li><a href="listaSalas.jsp">Salas</a></li>
					<li><a href="listaShows.jsp">Shows</a></li>
					
        			</ul>
    			</li>
      
    			<li><a href="sobre.jsp">Sobre Nós</a></li>
    			<li><a href="contato.jsp">Contato</a></li>
    			<li><a href="login.do?operacao=logout">Logout</a></li>
		</ul>
	</nav>