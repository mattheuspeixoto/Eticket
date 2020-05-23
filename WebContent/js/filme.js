function validateFormFilme() {
    
	var element = document.getElementById('titulo');
	    if (element != null && element.value == '') {
		alert("Campo titulo em Branco");
	        return false;
	}

	var element = document.getElementById('diretor');
	    if (element != null && element.value == '') {
		alert("Selecione o Diretor");
	        return false;
	}

	var element = document.getElementById('elenco');
	if(document.getElementsByName('elenco')!=null && document.getElementById('elenco').checked==false){
	   alert("Selecione a Classificação Etaria");
				return false;
			}
	   

	var element = document.getElementById('genero');
	    if (element != null && (element.value == ''|| element.value==' ')) {
		alert("Campo Genero em Branco");
	        return false;
	}

	var element = document.getElementById('horas');
	    if (element != null && (element.value == ''|| element.value==' ')) {
		alert("Informe a Duração do Filme");
	        return false;
	}

	var element = document.getElementById('minutos');
	    if (element != null && (element.value == ' ' || element.value=='')) {
		alert("Informe a Duração do Filme");
	        return false;
	}

	if((document.getElementById('gender1')!=null && document.getElementById('gender1').checked==false)&&
	   (document.getElementById('gender2')!=null && document.getElementById('gender2').checked==false)&&
	   (document.getElementById('gender3')!=null && document.getElementById('gender3').checked==false)&&
	   (document.getElementById('gender4')!=null && document.getElementById('gender4').checked==false)&&
	   (document.getElementById('gender5')!=null && document.getElementById('gender5').checked==false)&&
	   (document.getElementById('gender6')!=null && document.getElementById('gender6').checked==false)){
		alert("Selecione a Classificação Etaria");
		return false;
	}

	 alert("Cadastro Realizado com Sucesso");
	 return true;	    
}
