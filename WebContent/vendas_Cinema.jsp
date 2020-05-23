<%@ include file="cabecalho.jsp"%>
<section id="cadastro">
	<h2>VENDA CINEMA</h2>
		<table id="tabVendaCinema">
    	<form id="vendacinema" action="VendaCinema" method="post" onSubmit="return validateVendCinema()">
			<tr><br>
				<td>Sala:</td>
		      		<td> 
		      		   <select class="select" id="sala" name="selecaoSala">
 					   <c:forEach items="${listaS}" var="lista">
    				   <option value=${lista.titulo} name="selecaoSala">${lista.titulo}</option>
    				   </c:forEach>
    				   <option value="" selected >Escolha a Sala </option>
    				    
  					   </select>	
				</td>
			</tr>
				
				<tr>
					<td>Exibição:</td>
	        		<td>    
                       <input type="radio" id="gender" name="classificacao" value="2D"> 2D 
                       <input type="radio" id="gender" name="classificacao" value="Imax2D"> Imax2D<br>
                       <input type="radio" id="gender" name="classificacao" value="3D"> 3D
                       <input type="radio" id="gender" name="classificacao" value="Imax3D"> IMAX 3D					
					</td>
				</tr>
				<tr>
					<td>Filme:</td>
		        		<td> 		        		
		        			<select class="select" id="filme" name="selecaoFilme">
 							<c:forEach items="${listaFilme}" var="lista">
    						<option value=${lista.titulo} name="selecaoFilme">${lista.titulo}</option>
    						</c:forEach>
    						 <option value= "" selected >Selecione um Filme</option>
  							</select>				
						</td>
				</tr>
				
				<tr>
					<td>Horário:</td>
		        		<td> 
						<select id="horario" class="titulo" name="horario"> 
							<option value= "13:00">13h00</option>
							<option value= "15:15">15h15</option>
							<option value= "17:20">17h20</option>
							<option value= "19:40">19h40</option>
							<option value= "21:50">21h50</option>
                            <option value= ""selected>Escolha o Horario</option>
						</select>
						</td>
				</tr>
				
				<tr>
					<td>Cadeira:</td>
					<td>				
						<table>
						<tr><center>[ TELA ]</center></tr>
							<tr>
							<td><input type="radio" name="opcoes" required value="A1"/>A1</td>
							<td><input type="radio" name="opcoes" value="A2"/>A2</td>
							<td><input type="radio" name="opcoes" value="A3"/>A3</td>
							<td><input type="radio" name="opcoes" value="A4"/>A4</td>
							<td><input type="radio" name="opcoes" value="A5"/>A5</td><td>| |</td>
							<td><input type="radio" name="opcoes" value="A6"/>A6</td>
							<td><input type="radio" name="opcoes" value="A7"/>A7</td>
							<td><input type="radio" name="opcoes" value="A8"/>A8</td>
							<td><input type="radio" name="opcoes" value="A9"/>A9</td>
							<td><input type="radio" name="opcoes" value="A10"/>A10</td>
							</tr>
							<tr>
							<td><input type="radio" name="opcoes" value="B1"/>B1</td>
							<td><input type="radio" name="opcoes" value="B2"/>B2</td>
							<td><input type="radio" name="opcoes" value="B3"/>B3</td>
							<td><input type="radio" name="opcoes" value="B4"/>B4</td>
							<td><input type="radio" name="opcoes" value="B5"/>B5</td><td>| |</td>
							<td><input type="radio" name="opcoes" value="B6"/>B6</td>
							<td><input type="radio" name="opcoes" value="B7"/>B7</td>
							<td><input type="radio" name="opcoes" value="B8"/>B8</td>
							<td><input type="radio" name="opcoes" value="B9"/>B9</td>
							<td><input type="radio" name="opcoes" value="B10"/>B10</td>
							</tr>
							<tr>
							<td><input type="radio" name="opcoes" value="C1"/>C1</td>
							<td><input type="radio" name="opcoes" value="C2"/>C2</td>
							<td><input type="radio" name="opcoes" value="C3"/>C3</td>
							<td><input type="radio" name="opcoes" value="C4"/>C4</td>
							<td><input type="radio" name="opcoes" value="C5"/>C5</td><td>| |</td>
							<td><input type="radio" name="opcoes" value="C6"/>C6</td>
							<td><input type="radio" name="opcoes" value="C7"/>C7</td>
							<td><input type="radio" name="opcoes" value="C8"/>C8</td>
							<td><input type="radio" name="opcoes" value="C9"/>C9</td>
							<td><input type="radio" name="opcoes" value="C10"/>C10</td>
							</tr>
							<tr>
							<td><input type="radio" name="opcoes" value="D1"/>D1</td>
							<td><input type="radio" name="opcoes" value="D2"/>D2</td>
							<td><input type="radio" name="opcoes" value="D3"/>D3</td>
							<td><input type="radio" name="opcoes" value="D4"/>D4</td>
							<td><input type="radio" name="opcoes" value="D5"/>D5</td><td>| |</td>
							<td><input type="radio" name="opcoes" value="D6"/>D6</td>
							<td><input type="radio" name="opcoes" value="D7"/>D7</td>
							<td><input type="radio" name="opcoes" value="D8"/>D8</td>
							<td><input type="radio" name="opcoes" value="D9"/>D9</td>
							<td><input type="radio" name="opcoes" value="D10"/>D10</td>
							</tr>
							<tr>
							<td><input type="radio" name="opcoes" value="F1"/>F1</td>
							<td><input type="radio" name="opcoes" value="F2"/>F2</td>
							<td><input type="radio" name="opcoes" value="F3"/>F3</td>
							<td><input type="radio" name="opcoes" value="F4"/>F4</td>
							<td><input type="radio" name="opcoes" value="F5"/>F5</td><td>| |</td>
							<td><input type="radio" name="opcoes" value="F6"/>F6</td>
							<td><input type="radio" name="opcoes" value="F7"/>F7</td>
							<td><input type="radio" name="opcoes" value="F8"/>F8</td>
							<td><input type="radio" name="opcoes" value="F9"/>F9</td>
							<td><input type="radio" name="opcoes" value="F10"/>F10</td>
							</tr>
							<tr>
							<td><input type="radio" name="opcoes" value="I1"/>I1</td>
							<td><input type="radio" name="opcoes" value="I2"/>I2</td>
							<td><input type="radio" name="opcoes" value="I3"/>I3</td>
							<td><input type="radio" name="opcoes" value="I4"/>I4</td>
							<td><input type="radio" name="opcoes" value="I5"/>I5</td><td>| |</td>
							<td><input type="radio" name="opcoes" value="I6"/>I6</td>
							<td><input type="radio" name="opcoes" value="I7"/>I7</td>
							<td><input type="radio" name="opcoes" value="I8"/>I8</td>
							<td><input type="radio" name="opcoes" value="I9"/>I9</td>
							<td><input type="radio" name="opcoes" value="I10"/>I10</td>
							</tr>
							<tr>
							<td><input type="radio" name="opcoes" value="J1"/>J1</td>
							<td><input type="radio" name="opcoes" value="J2"/>J2</td>
							<td><input type="radio" name="opcoes" value="J3"/>J3</td>
							<td><input type="radio" name="opcoes" value="J4"/>J4</td>
							<td><input type="radio" name="opcoes" value="J5"/>J5</td><td>| |</td>
							<td><input type="radio" name="opcoes" value="J6"/>J6</td>
							<td><input type="radio" name="opcoes" value="J7"/>J7</td>
							<td><input type="radio" name="opcoes" value="J8"/>J8</td>
							<td><input type="radio" name="opcoes" value="J9"/>J9</td>
							<td><input type="radio" name="opcoes" value="J10"/>J10</td>
							</tr>
						</table>
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
</section>
<%@ include file="rodape.jsp"%>