<%@ include file="cabecalho.jsp"%>

<section>
 	<h2>Compra Show</h2>
			
		<table id="tb_atores" border="1"> 
				<tr>
					<th>Evento</th>
					<th>Data</th>
					<th>Horario</th>
					<th>Area</th>
				</tr>
				<tr>
						<td>${vendaS.atracao}</td>
						<td></td>
						<td></td>
						<td>${vendaS.area}</td>
										
				</tr>
						   
			</table>		
			      <input type="button" class="bt_" value="Confirmar" name="Confirmar" > 
				
			</section>
<%@ include file="rodape.jsp"%>