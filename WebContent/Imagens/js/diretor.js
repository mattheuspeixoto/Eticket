function validateFormDiretor() {

 var element = document.getElementById('di');
    if (element != null && element.value == '') {
	alert("Campo Nome em Branco");
        return false;
}

var element = document.getElementById('pais');
    if (element != null && element.value == '') {
	alert("Campo Pais em Branco");
        return false;
}

var element = document.getElementById('email');
    if (element != null && element.value == '') {
	alert("Campo Email em Branco");
        return false;
}

    alert("Cadastro Realizado com Sucesso");
    return true;
}
