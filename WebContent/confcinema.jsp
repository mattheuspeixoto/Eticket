<%@ include file="cabecalho.jsp"%>

<section>
 	<h2>Compra Cinema</h2>
			
		<table id="tb_atores" border="2"> 
				<tr>
					<th>Sala</th>
					<th>Exibicao </th>
					<th>Cadeira  </th>
					<th>Horario  </th>
				</tr>
				<tr>
						<td>${venda.sala}</td>
						<td>${venda.exibicao}</td>
						<td>${venda.cadeira}</td>
						<td>${venda.horario}</td>
						
				</tr>
						   
			</table>		
			      <input type="button" class="bt_" value="Confirmar" name="Confirmar" > 
				
			</section>
<%@ include file="rodape.jsp"%>