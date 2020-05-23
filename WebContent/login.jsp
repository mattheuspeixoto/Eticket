<html>
<head>
  <meta charset="utf-8">
  <meta name="description" content="Aqui voce compra seu ingresso!">
  <title>AREA_LOGIN</title>
  <link rel="stylesheet" href="css/login.css">
</head>
<body>
  <img src="Imagens/h.png" id="imagem">
  
  <form action="login.do" method="post" class="login">
    <p>
      <label for="login">Usuario:</label>
      <input type="text" name="login" id="login" value="" placeholder="Usuario">
    </p>

    <p>
      <label for="password">Senha:</label>
      <input type="text" name="password" id="password" placeholder="Senha" value="">
    </p>

    <p class="login-submit">
    <button type="submit" class="login-button" value="logar">logar</button>
    </p>
      <h2> ${erro} </h2>
  </form>
 
  
</body>
</html>