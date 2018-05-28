<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Alexa IA</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
	<link href="https://fonts.googleapis.com/css?family=Black+Ops+One|Exo|Exo+2|Pacifico|Poppins|Amaranth:400,700" rel="stylesheet" />
	<style type="text/css">
		body{
			padding: 0;
			margin:0;
			background: url(<spring:url value="/images/fondo.jpg" />)center no-repeat ;
			height: auto;
			width: 100vw;
		}
		.navbar-brand{
			text-align: center;
			padding: 0;
			font-size: 35px;
			font-family: 'Black Ops One', cursive;
			opacity: 0.7;
			filter:alpha (opacity=70);
		}
		.container {
			margin: auto;
		}
		.navbar-expand-lg {
			margin: 15px;
			color:#FFFFFF;
		}
		button {
			font-family: 'Exo', sans-serif;
			font-size: 20px;
		}
		a {
			font-family: 'Exo', sans-serif;
			font-size: 20px;
		}
		h1, h2, h3, h4, h5, h6 {
			margin: 0px;
		}
		#dia {
			width: 100px;
			height: 100px;
			background-image: url(<spring:url value="/images/calendar.png" />);
			background-size: 100%;
		}
		h3, h5 {
			color: #FFF;
		}
		h3 {
			margin-top: 30px;
		}

	</style>
</head>
<body>
	<nav class="navbar navbar-dark fixed-top navbar-expand-lg" style="background-color: #000A1C">
 		<a class="navbar-brand" href="app/home">
		    <img src='<spring:url value="/images/alexa1.gif" />' width="50" height="50" class="d-inline-block align-top" alt="" >
		    ALEXA
	  	</a>
 		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    		<span class="navbar-toggler-icon"></span>
  		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
		    <ul class="navbar-nav mr-auto">
				<li class="nav-item ">
					<a class="nav-link" href="/app/home">Inicio <span class="sr-only"></span></a>
				</li>
				<li class="nav-item ">
					<a class="nav-link" href="/app/#">Cursos <span class="sr-only"></span></a>
				</li>
				<li class="nav-item ">
					<a class="nav-link" href="/app/perfil">Perfil<span class="sr-only"></span></a>
				</li>
				<li class="nav-item ">
					<a class="nav-link" href="/app/recordatorio">Recordatorios<span class="sr-only"></span></a>
				</li>
				<li class="nav-item ">
					<a class="nav-link" href="crear">Nuevo Recordatorio<span class="sr-only"></span></a>
				</li>
		    </ul>
  
      		<button class="btn btn-secondary my-2 my-sm-0" type="submit">Cerrar Sesi�n</button>
  		</div>
	</nav>
	
	<header style="margin-top: 120px;" >
		<div style="background: #1ABCD9; width: 300px; padding: 15px;">
			<h2>Ver Recordatorios</h2>
		</div>
	</header>
	<div id="dia" style="margin-left: 4%; display: flex; justify-content: center; align-items: center; flex-direction: column; padding-bottom: 5px;">
		<h3>27</h3> 
		<h5>Mayo</h5>
	</div>

	<div class="container">

		<table class="table" style="margin: auto; color: #FFF; text-align: center;">
		  <thead class="thead-dark">
		    <tr>
		      <th scope="col">Nombre del recordatorio</th>
		      <th scope="col">Descripcion</th>
		      <th scope="col">Fecha de creacion</th>
		      <th scope="col">Fecha a Recordar</th>
		      <th scope="col">Opciones</th>

		    </tr>
		  </thead>
		  <tbody style="background: rgba(0, 0, 0, 0.4);">
		  	<c:forEach var="evento" items="${eventos}">
		    <tr>
		      <th scope="row">${evento.titulo}</th>
		      <td>${evento.contenido}</td>
		      <td>${evento.fecha_inicio}</td>
		      <td>${evento.fecha_final}</td>
		      <td>
		      	<a class="btn btn-warning" href="listar/editar">Editar</a>
		      	<button class="btn btn-danger">Eliminar</button>
		      </td>
		    </tr>
		    </c:forEach>
		  </tbody>
		</table>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
</body>
</html>