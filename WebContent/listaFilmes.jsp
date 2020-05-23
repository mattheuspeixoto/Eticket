<%@ include file="cabecalho.jsp"%>
<section>

<h2>Listar Filmes</h2>

<table id ="procurar">
	<form id="listarFilmes" action="#" method="post" onSubmit="return validateFormListar()">
		<tr>
			<td>  <input type="text"  value="" id="nome"  placeholder="Sala" name="listarFilmes"> </td>
			<td>  <input class="bt_enviar" type="submit" value="Procurar" name="btProcurar">  </td>
		</tr> 
	</form>
</table>
	
	<table border="1" id="tb_filme"> 
		<tr>
			<th>Titulo</th>
			<th>Diretor</th>
			<th>Elenco</th>
			<th>Genero</th>
			<th>Duracao</th>
			<th>Classificacao</th>
		</tr>
		<c:forEach items="${listaFilme}" var="lista">
		<tr>
			<td>${lista.titulo}</td>
			<td>${lista.ator.nome}</td>
			<td>${lista.diretor.nome}</td>
			<td>${lista.genero}</td>
			<td>${lista.hora}h:${lista.minuto}min</td>
			<td>${lista.classificacao}</td>
		</tr>
		</c:forEach>
	</table>
</section>
 <%@ include file="rodape.jsp"%>