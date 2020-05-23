function validateFormContato() {
    
var element = document.getElementById('usuario');
    if (element != null && element.value == '') {
	alert("Campo Nome em Branco");
        return false;
}

var element = document.getElementById('cidade');
    if (element != null && element.value == '') {
	alert("Campo cidade em Branco");
        return false;
}

var element = document.getElementById('estado');
    if (element != null && element.value == '') {
	alert("Campo estado em Branco");
        return false;
}

var element = document.getElementById('email');
    if (element != null && element.value == '') {
	alert("Campo email em Branco");
        return false;
}

var element = document.getElementById('assunto');
    if (element != null && element.value == '') {
	alert("Selecione um Assunto");
        return false;
}

var element = document.getElementById('mensagem');
    if (element != null && (element.value == ' ' || element.value=='')) {
	alert("Campo mensagem em Branco");
        return false;
}

    alert("Obrigado por entrar em contato conosco responderemos o mais rapido possivel");
	return true;   
   
}
