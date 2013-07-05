<!DOCTYPE html>
<html>
  <head>
    <title>Bootstrap 101 Template</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/web-resources/css/estilos-home.css"/>
    <link href="${pageContext.request.contextPath}/web-resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="${pageContext.request.contextPath}/web-resources/bootstrap/css/bootstrap-responsive.css" rel="stylesheet">     
    <script src="${pageContext.request.contextPath}/web-resources/js/jquery-1.8.3.js"></script>
    <script src="${pageContext.request.contextPath}/web-resources/bootstrap/js/bootstrap.min.js"></script> 
  </head>
<body>
  <header>
      <h2>Generador de encuestas</h2>
      
  </header>

  <div id= "contenedor-login" class="container">
  <form class="form-horizontal">
      <div class="control-group">
        <label class="control-label" for="inputEmail">Email</label>
        <div class="controls">
            <input type="text" id="inputEmail" placeholder="Email">
        </div>
      </div>
      <div class="control-group">
        <label class="control-label" for="inputPassword">Contraseña</label>
        <div class="controls">
            <input type="password" id="inputPassword" placeholder="Contraseña">
        </div>
      </div>
      <div class="control-group">
        <div class="controls">
            <label class="checkbox">
            <input  type="checkbox"> Mantner la sesión iniciada.
            </label> </br></br>
            <button type="submit" class="btn">Iniciar Sesión</button>
        </div>
      </div>
  </form>
</div>
<footer>
    <p>SANCHEZ lEVARIO Esmeralda</p>
</footer>
</body>
</html>