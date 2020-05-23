function validateFormLogin() {

 var element = document.getElementById('UsuarioLogin');
    if (element != null && (element.value == ''|| element.value==' ')) {
	alert("Campo Nome em Branco");
        return false;
}

var element = document.getElementById('SenhaLogin');
    if (element != null && (element.value == ''|| element.value==' ')) {
	alert("Campo Senha em Branco");
        return false;
}

    return true;
    
}
