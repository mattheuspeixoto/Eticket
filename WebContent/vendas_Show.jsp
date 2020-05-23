<%@ include file="cabecalho.jsp"%> 
<h2>VENDA DE SHOWS</h2>
		<table>
			<form id="ingressos_show" action="VendaShow" method="post" onSubmit="return validateFormVend_Show()">
				<tr>
					<td>Evento:</td>
		        		<td> 
						<select class="select" id="atracao" name="selecaoShow">
					   <c:forEach items="${listaShow}" var="lista">
    				   <option value=${lista.atracao} name="selecaoShow">${lista.atracao}</option>
    				   </c:forEach>
    				    <option value="" selected >Escolha o Evento </option>
  					   </select>	
						</td>
				</tr>
				
                <tr>
					<td>Área:</td>
					<td>    
	                       <input type="radio" id="AV" name="area" value="Area Vip"> Area Vip 
	                       <input type="radio" id="LO" name="area" value="Louge"> Louge<br>
	                       <input type="radio" id="CA" name="area" value="Camarote"> Camarote
	                       <input type="radio" id="FS" name="area" value="Front Stage"> Front Stage
	                       <input type="radio" id="PI" name="area" value="Pista"> Pista					
					</td>
				</tr>    
                <tr>
					<td >
						<input type="reset" value="Limpar" name="cancelar">
						<input type="submit" value="Comprar" name="comprar">
					</td>
				</tr>
			</form>
	</table>
	
 <%@ include file="rodape.jsp"%>