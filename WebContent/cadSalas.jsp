<%@ include file="cabecalho.jsp"%>

 <section id="cadastro">
	<h2>CADASTRO SALAS</h2>
		<table id="tabSalas">
	  	<form id="salas" action="CadSalas" method="post" onSubmit="return validateFormSala()">
				<tr>
					<td>
						Nome do Filme:
					</td>
					<td> 
 						<select class="select" id="filme" name="titulo">
 						<c:forEach items="${listaFilme}" var="lista">
    					<option value="${lista.titulo}">${lista.titulo}</option>
    					</c:forEach>
    					<option value="" selected> Selecione o Filme</option>
  						</select>
					</td>
				</tr>
				<tr>
		          <td>Horario:(Horas : Minutos) </td>
		          <td>	
			    		<input id="horas"   class="t" type="number" value="" step="1" min="0" max="23" placeholder="Horas" name="duracaoHora"/>                         :
                        <input id="minutos" class="t" type="number" value="" step="1" min="0" max="59" placeholder="Minutos" name="duracaoMinuto"/>
					</td>	
				</tr> 
				<tr>
		        		<td>Capacidade:</td>
		        		<td>    
                          <input type="range" class="slider" onChange="return funcao()" id="barra" min="100" max="500" step="50" name="capacidade">
                          <input type="text" id="x" class="capacidade"> Pessoas <br>
				        </td>	
				</tr> 
				<tr>
					<td>
						<input class="bt_enviar" id="btEnviar" type="submit" value="Cadastrar" name="Cadastrar">
						<input class="bt_enviar" id="btLimpar" type="reset"  value="Limpar"    name="Limpar">
					</td>
				</tr>
			</form>
	</table>
</section>
<%@ include file="rodape.jsp"%>