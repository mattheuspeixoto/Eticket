function validateForm7() {
    
	// Validacao Campo Sala
var element = document.getElementById('sala');
    if (element != null && element.value == '') {
	alert("Escolha a Sala ");
        return false;
}

// Validacao Campo Exibição
if((document.getElementById('e1')!=null && document.getElementById('e1').checked==false)&&
   (document.getElementById('e2')!=null && document.getElementById('e2').checked==false)&&
   (document.getElementById('e3')!=null && document.getElementById('e3').checked==false)&&
   (document.getElementById('e4')!=null && document.getElementById('e4').checked==false)){
	alert("Selecione o Modelo de Exibição");
	return false;
}
  
  // Validação Campo Filme
var element = document.getElementById('filme');
    if (element != null && element.value == '') {
	alert("Escolha o Filme");
        return false;
}

// Validaçao Campo Horario
var element = document.getElementById('horario');
    if (element != null && element.value == '') {
	alert("Escolha o Horario ");
        return false;
}
 //Validaçao Campo Cadeira 
var element = document.getElementById('cadeira');
    if (element != null && element.value == '') {
	alert("Escolha uma Cadeira ");
        return false;
}
   alert("Obrigado por nos Escolher.. Tenha um Bom Filme ");
	return true; 
}
