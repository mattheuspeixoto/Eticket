//Funcao para colocar o valor da barra 
function funcao(){  
	      var get = document.getElementById("barra").value;
	      document.getElementById("x").value = get;}
		  
		  
		function validateFormSala() {
		// Validação Campo Filme
     var element = document.getElementById('filme');
     if (element != null && element.value == '') {
	     alert("Escolha o Filme");
         return false;}
		 
     var element = document.getElementById('horas');
     if (element != null && element.value == '') {
	     alert("Escolha o Horario");
         return false;}	
     
     var element = document.getElementById('minutos');
     if (element != null && element.value == '') {
	     alert("Escolha o Horario");
         return false;}	
		 
     var element = document.getElementById('x');
     if (element != null && element.value == '') {
	     alert("Selecione a Capacidade da Sala");
         return false;}	 	 	 

      alert("Cadastro Realizado com Sucesso");
      return true;
}
