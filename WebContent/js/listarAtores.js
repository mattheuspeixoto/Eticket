function validateFormListAtor() {
	var element = document.getElementById('nome');
	    if (element != null && (element.value == ''|| element.value==' ')) {
		alert("Digite o Nome que Deseja Procurar");
	        return false;
	}
        return true;
}
