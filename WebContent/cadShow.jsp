<%@ include file="cabecalho.jsp"%>

<section id="cadastro">
	<h2>CADASTRO SHOWS</h2>
		<table id="tabShow">
	  	<form id="shows" action="ServletShows" method="post" onSubmit="return validateFormShow()">
				<tr>
					<td>
						Titulo:
					</td>
	        			<td>
						<input id="titulo" class="titulo" type="text"  placeholder="Atração" name="titulo">
					</td>
				</tr>
                <tr>
					<td>
						Local:
					</td>
					<td>
						<input id="local" class="titulo" type="text"  placeholder="Local" name="local">
				</td>
				</tr>
				
				
				<tr>
					<td> Data:</td>
					<td> 
                      <input type="date" id="data"  pattern="\d{2}\/\d{2}\/\d{2}" title="xx/xx/xx" name="dataEvento" class="titulo" value="" placeholder="Data do Show"> 
                      </td>
				</tr>				
				

                   <tr>
					<td>
						Horario:
					</td>
					<td>
						<input id="hora" name="hora"   class="t" type="number" step="1" min="0" max="23"  placeholder="Hora" >:
						<input id="hora" name="minuto" class="t" type="number" step="1" min="0" max="59"  placeholder="Minuto" >
					</td>
				</tr>

				<tr>
					<td>
						Classificação:
					</td>
					<td>
						<select class="select" id="class" name="classificacao">
                        <option value="Livre">Livre</option>
  						<option value="10 Anos">10 Anos</option>
  						<option value="12 Anos">12 Anos </option>
  						<option value="14 Anos">14 Anos</option>
						<option value="16 Anos">16 Anos</option>
						<option value="18 Anos">18 Anos</option>
                        <option value="" selected> Classificação Etária</option>
						</select> 
					</td>
				</tr>

                                 
				
				<tr>
					<td>
						<input id="btEnviar" class="bt_enviar" type="submit" value="Cadastrar" name="btEnviar">
						<input id="btLimpar" class="bt_enviar" type="reset"  value="Limpar" name="btEnviar">
					</td>
				</tr>
			</form>
	</table>
	</section>
 <%@ include file="rodape.jsp"%>