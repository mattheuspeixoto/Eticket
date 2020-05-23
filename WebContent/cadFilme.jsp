<%@ include file="cabecalho.jsp"%>

<section id="cadastro">
		<h2>CADASTRO FILME</h2>
		<table id="tabFilme">
	  	<form id="filme" action="CadFilme" method="post" onSubmit="return validateFormFilme()">
				<tr>
					<td>
						Titulo:
					</td>
	        			<td>
						<input type="text" class="titulo" value="" id="titulo"  placeholder="Titulo" name="titulo">
					</td> 
				</tr>
				
					<tr>
	        			<td>
							Diretor:
						</td>
					<td> 
 						<select class="select" id="director" name="selecaoDiretor">
 						<c:forEach items="${listaDiretor}" var="lista">
    					<option value=${lista.nome} name="selecaoDiretor">${lista.nome}</option>
    					</c:forEach>
    					<option value="" selected> Selecione o Diretor</option>
  						</select>
					</td> 
					</tr>
				
			 		<tr>
		        		<td>
							Elenco:
						</td>
						<td> 
							<c:forEach items="${listaAtor}" var="lista">
						    <input type="checkbox" name="elenco" value=${lista.nome}>${lista.nome} 
							</c:forEach>
						</td>
								
						</td> 
					</tr>
				<tr>
					<td>
						Genero:
					</td>
					<td>
						<select class="select" id="genero" name="selecaoGenero">
	                        <option value="" selected >Selecione o Genero</option>
				            <option value="Ação">Ação</option>
	  						<option value="Drama">Drama</option>
	  						<option value="Suspense">Suspense</option>
	  						<option value="Ficção">Ficção</option>
						</select> 
					</td>
				</tr>
                
                <tr>
					<td> 
						Duracao: (Horas : Minutos)
					</td>
					<td> 
						<input id="horas"   type="number" value="" step="1" min="0" max="3"  placeholder="Horas" name="duracaoHora"/>                         :
                        <input id="minutos" type="number" value="" step="1" min="0" max="59" placeholder="Minutos" name="duracaoMinuto"/>
					</td>
				</tr>
                
                                
                  <tr>
					<td>
						Classificação:
					</td>
					<td>    
                       <input type="radio" id="gender1" name="classificacao" value="Livre"> Livre 
                       <input type="radio" id="gender2" name="classificacao" value="10 Anos"> 10 Anos
                       <input type="radio" id="gender3" name="classificacao" value="12 Anos"> 12 Anos<br>
                       <input type="radio" id="gender4" name="classificacao" value="14 Anos"> 14 Anos
                       <input type="radio" id="gender5" name="classificacao" value="16 Anos"> 16 Anos
                       <input type="radio" id="gender6" name="classificacao" value="18 Anos"> 18 Anos						
				</td>
				</tr>
				<tr>
					<td id="btEnviar">
						<input class="bt_enviar" type="submit" value="Cadastrar" name="btEnviar">
						<input class="bt_enviar" type="reset" value="Limpar" name="btLimpar">
					</td>
				</tr>
			</form>
	</table>
</section>
 <%@ include file="rodape.jsp"%>