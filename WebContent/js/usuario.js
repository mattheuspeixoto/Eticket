function validateFormUsuario() {

var element = document.getElementById('usu');
    if (element != null && (element.value == ''|| element.value==' ')) {
	alert("Campo Nome em Branco");
        return false;
}

var element = document.getElementById('cpf');
    if (element != null && (element.value == ''|| element.value==' ')) {
	alert("Campo CPF em Branco");
        return false;
}

var element = document.getElementById('endereço');
    if (element != null && (element.value == ''|| element.value==' ')) {
	alert("Campo Endereço em Branco");
        return false;
}


var element = document.getElementById('bairro');
    if (element != null && (element.value == ''|| element.value==' ')) {
	alert("Campo Bairro em Branco");
        return false;
}

var element = document.getElementById('cidade');
    if (element != null && (element.value == ''|| element.value==' ')) {
	alert("Campo Cidade em Branco");
        return false;
}

var element = document.getElementById('email');
    if (element != null && (element.value == ''|| element.value==' ')){
	alert("Campo E-mail em Branco");
        return false;
}

var element = document.getElementById('nascimento');
    if (element != null && (element.value == ''|| element.value==' ')) {
	alert("Campo Data de Nascimento em Branco");
        return false;
}

var element = document.getElementById('numero');
    if (element != null && (element.value == ''|| element.value==' ')) {
	alert("Campo Numero em Branco");
        return false;
}

var element = document.getElementById('CEP');
    if (element != null && (element.value == ''|| element.value==' ')) {
	alert("Campo CEP em Branco");
        return false;
}

var element = document.getElementById('estado');
    if (element != null && (element.value == ''|| element.value==' ')) {
	alert("Campo Estado em Branco");
        return false;
}

 alert("Cadastro Realizado com Sucesso");
 return true;
}
