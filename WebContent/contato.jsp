<%@ include file="cabecalho.jsp"%>

<section id="cadastro">
	<h2>CONTATO</h2>
		<table id="tabContato">
	  	<form id="contato"  action="CadContato" method="post" onSubmit="return validateFormContato()">
				<tr>
					<td>
						Nome do Usuario:
					</td>
	        			<td>
						<input type="text" class="titulo" value="" id="usuario" placeholder="Nome" name="nomeContato">
					</td> </tr>
					
				<tr>
					<td>
						Cidade:
					</td>
	        		<td> <input type="text" class="titulo" value="" id="cidade"   placeholder="Cidade" name="cidade">
					</td> </tr>

				<tr>
					<td>
						Estado
					</td>
	        			<td><input list="estados" id="estado" class="titulo"  placeholder="Estado" name="estado">
						<datalist id="estados">
						<option value="AM">
						<option value="BA">
						<option value="CE">
						</datalist>
					
					</td> </tr>
	        		
				<tr>
					<td>
						Email:
					</td>
					<td>
						<input id="email" class="titulo" type="email"  placeholder="Email" name="emailContato">
					</td>
     			</tr>

                <tr>
					<td>
						Assunto:
					</td>
					<td>
						<select class="select" id="assunto" name="assunto">
	                        <option value="" selected >Selecione o Assunto</option>
			  	            <option value="Filmes">Filmes</option>
	  						<option value="Shows">Shows</option>
	  						<option value="Ingressos">Ingressos</option>
	  						<option value="Critica">Critica</option>
	                        <option value="Sugestao">Sugestão</option>
						</select> 
					</td>
				</tr>      
                <tr>
					<td>
						Mensagem: </td>
					<td>
                           <textarea id="mensagem" class="msg" placeholder="Deixe aqui a sua mensagem" name="mensagem"> </textarea>
				    </td>
				</tr>
				<tr>
					<td>
					<input id="btEnviar" class="bt_enviar" type="submit" value="Enviar" >
					<input class="bt_enviar" type="reset" value="Limpar" name="btLimpar">
					</td>
				</tr>
			</form>
	</table>
</section>
	
 <%@ include file="rodape.jsp"%>