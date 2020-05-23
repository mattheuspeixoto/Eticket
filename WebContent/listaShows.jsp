<%@ include file="cabecalho.jsp"%>
<section>

<h2>Listar Shows</h2>

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
			<th>Evento</th>
			<th>Data</th>
			<th>Horario</th>
			<th>Classificação</th>
			
		</tr>
       
        <c:forEach items="${listaShow}" var="lista">
       
 		<tr>
			<td>${lista.atracao}</td>
			<td>${lista.data}</td>
			<td>${lista.hora}H: ${lista.minuto}Min</td>
			<td>${lista.classificacao}</td>
			
		</tr>
		</c:forEach>
	</table>
</section>

 <%@ include file="rodape.jsp"%>