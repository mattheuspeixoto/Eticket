<%@ include file="cabecalho.jsp"%>
<section>

<h2>Listar Salas</h2>

<table id ="procurar">
	<form id="salas" action="#" method="post" onSubmit="return validateFormListar()">
		<tr>
			<td>  <input type="text"  value="" id="nome"  placeholder="Sala" name="nomeSala"> </td>
			<td>  <input class="bt_enviar" type="submit" value="Procurar" name="btEnviar">  </td>
		</tr> 
	</form>
</table>
	
	<table border="1" id="tb_salas"> 
		<tr>
			<th>Nome do Filme</th>
			<th>Horario</th>
			<th>Capacidade</th>
		</tr>
		<c:forEach items="${listaS}" var="lista">
		<tr>
			<td>${lista.titulo}</td>
			<td>${lista.hora}h:${lista.minuto}min</td>
			<td>${lista.capacidade}</td>
		</tr>
		</c:forEach>
	</table>
</section>

 <%@ include file="rodape.jsp"%>