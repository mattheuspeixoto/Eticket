function validateForm8() {
    
	// Validacao campo Atraçao
var element = document.getElementById('atracao');
    if (element != null && element.value == '') {
	alert("Escolha a Atração ");
        return false;
}
    // Validacao campo Data
var element = document.getElementById('data');
    if (element != null && element.value == '') {
	alert("Escolha a Data");
        return false;
}

     // Validacao Campo Area
if((document.getElementById('AV')!=null && document.getElementById('AV').checked==false)&&
   (document.getElementById('LO')!=null && document.getElementById('LO').checked==false)&&
   (document.getElementById('CA')!=null && document.getElementById('CA').checked==false)&&
   (document.getElementById('FS')!=null && document.getElementById('FS').checked==false)&&
   (document.getElementById('PI')!=null && document.getElementById('PI').checked==false)){
	alert("Selecione a Area que Deseja Ficar");
	return false;
}

  alert("Obrigado por nos Escolher... Tenha um Bom Show");
  return true;
   
} 
