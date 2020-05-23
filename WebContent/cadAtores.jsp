<%@ include file="cabecalho.jsp"%>

<section id="cadastro">
	<h2>CADASTRO ATORES</h2>
		<table id="tabAtor">
		  	<form id="atores" action="CadAtores" onSubmit="return validateFormAtor()" method="post">
					<tr>
						<td>
							Nome:
						</td>
		        			<td>
							<input type="text" class="titulo" value="" id="nomeAtor" name="nomeAtor" placeholder="Nome do Ator" name="nomeAtor">
						</td>
					</tr>
					<tr>
						<td>
							País:
						</td>
						<td>
							<input list="paises" id="pais" class="titulo" placeholder="Pais" name="listaPais">
								<datalist id="paises">
								<option value="Brasil">
								<option value="EUA">
								<option value="China">
								<option value="Franca">
								<option value="Colombia">
								<option value="India">
								</datalist>
						</td>
					</tr>
					<tr>
						<td>
							Email:
						</td>
						<td>
							<input id="email" class="titulo" type="email"  name="emailAtor" placeholder="Email">
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