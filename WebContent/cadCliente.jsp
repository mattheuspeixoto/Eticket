<%@ include file="cabecalho.jsp"%>

<section id="cadastro">
	<h2>CADASTRO CLIENTE</h2>
		<table id="tabUsuario">
	  	<form id="usuario" action="CadUsuario" onSubmit="return validateFormUsuario()" method="post">
				<tr>
					<td>
						Nome do Usuário:
					</td>
	        			<td>
						<input type="text" class="titulo" value="" id="usu"  placeholder="Nome" name="usuName">
					</td>
					<td>
						Data de Nascimento:
					</td>
		        		<td>
						<input type="text" id="dataNascimento" class="titulo" pattern="\d{2}\/\d{2}\/\d{2}" title="xx/xx/xx" placeholder="dataNascimento" name="dataNascimento">
					</td> 
				</tr>
				<tr>
					<td>
						CPF:
					</td>
		        	<td>
				         <input type="text" id="cpf" class="titulo" pattern="\d{3}\.\d{3}\.\d{3}-\d{2}" title="Digite um CPF no formato: xxx.xxx.xxx-xx" placeholder="CPF" name="cpf">
					</td> 
				</tr>
				<tr>
					<td>
						End.:
					</td>
	        		<td>
	        			<input type="text" value="" class="titulo" id="endereço" placeholder="Endereço" name="endereco">
				</td>
					<td align="right">
						nº:
					</td>
	        			<td>
						<input type="text" value="" class="titulo" id="numero" placeholder="Numero" name="numeroEndereco">
					</td>
				</tr>
				<tr>
					<td>
						Bairro:
					</td>
	        		<td>
						<input type="text" value="" class="titulo" id="bairro" placeholder="Bairro" name="bairro">
					</td>
					<td align="right">
						CEP:
					</td>
	        		<td>
						<input id="CEP" class="titulo" pattern="\d{5}\-\d{3}"  title="Digite o CEP no formato: xxxxx-xxx" placeholder="CEP" name="cep">
					</td>
				</tr>
				<tr>
					<td>
						Cidade:
					</td>
	        		<td>
						<input type="text" value="" class="titulo" id="cidade"  placeholder="Cidade" name="nomeCidade">
					</td>
					<td align="right">
						Estado:
					</td>
	        		<td>
						<input list="estados" id="estado" class="titulo" placeholder="Estado" name="nomeEstado">
							<datalist id="estados">
							<option value="AM">
							<option value="BA">
							<option value="CE">
							</datalist>
					</td>
				</tr>
				<tr>
					<td>
						Email:
					</td>
					<td>
						<input id="email" class="titulo" type="email"  placeholder="Email" name="usuEmail">
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