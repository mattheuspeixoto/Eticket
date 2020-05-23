<%@ include file="cabecalho.jsp"%>

<section>
 	<h2>Listar Atores</h2>
			
		<table id ="procurar">
	        <form id="atores" action="#" method="post" onSubmit="return validateFormListar()">
		        <tr>
			    <td>  <input type="text"  value="" id="nome"  placeholder="Nome do Ator" name="nomeAtor"> </td>
			    <td>  <input class="bt_enviar" type="submit" value="Procurar" name="btProcurar">  </td>
			    </tr> 
		    </form >
	    </table>
		
			<table border="1" id="tb_atores"> 
				<tr>
					<th>Nome</th>
					<th>Pais</th>
					<th>email</th>
				</tr>
				<c:forEach items="${listaAtor}" var="lista">
					<tr>
						<td>${lista.nome}</td>
						<td>${lista.pais}</td>
						<td>${lista.email}</td>
					</tr>
	       		</c:forEach>
       		</table>	
		
</section>

 <%@ include file="rodape.jsp"%>