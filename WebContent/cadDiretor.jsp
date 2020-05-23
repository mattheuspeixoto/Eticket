<%@ include file="cabecalho.jsp"%>

<section id="cadastro">
		<h2>CADASTRO DIRETOR</h2>
		<table id="tabDiretor">
		  	<form id="diretor" action="CadDiretor" method="post" onSubmit="return validateFormDiretor()">
					<tr>
						<td>
							Nome:
						</td>
		        			<td>
							<input type="text" id="di" class="titulo"  placeholder="Diretor" name="nomeDiretor">
						</td> 
					</tr>
					<tr>
		        			<td>
							País:
						</td>
						<td>
						  <input list="paises" class="titulo" id="pais" placeholder="Pais" name="listaPais">  
								<datalist id="paises">
								<option value="Brasil">
								<option value="EUA">
								<option value="China">
								<option value="Franca">
								<option value="Colombia">
								<option value="India">
								</datalist>
						</td>
					<tr>
						<td>
							Email:
						</td>
						<td>
							<input id="emailDiretor" type="text" id="email" class="titulo" type="email" placeholder="Email" name="diretorEmail">
						</td>
					</tr>
					
					<tr>
						<td>
							<input class="bt_enviar" id="btEnviar" type="submit" value="Cadastrar" name="btEnviar">
							<input class="bt_enviar" id="btLimpar" type="reset"  value="Limpar" name="btLimpar">
						</td>
					</tr>
				</form>
		</table>
</section>
<%@ include file="rodape.jsp"%>