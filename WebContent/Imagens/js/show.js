function validateFormShow() {
    
var element = document.getElementById('TituloShow');
    if (element != null && element.value == '') {
	alert("Campo Titulo em Branco");
        return false;
}

var element = document.getElementById('local');
    if (element != null && element.value == '') {
	alert("Campo Local em Branco");
        return false;
}

var element = document.getElementById('hora');
    if (element != null && element.value == '') {
	alert("Campo Horario em Branco");
        return false;
}

var element = document.getElementById('class');
    if (element != null && element.value == '') {
	alert("Campo Classificação em Branco");
        return false;
}

alert("Cadastro Realizado com Sucesso");
return true;
}

