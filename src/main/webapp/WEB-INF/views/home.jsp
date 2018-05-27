<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
	<title>Home</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<link rel="stylesheet" src="jquery.datetimepicker.min.css"></link>
	<link rel="stylesheet" href="style/index_style.css">
	<link href="https://fonts.googleapis.com/css?family=Black+Ops+One|Exo|Exo+2|Pacifico|Poppins" rel="stylesheet">
	<style type="text/css">
		.navbar-brand{
			text-align: center;
			padding: 0;
			font-size: 35px;
			font-family: 'Black Ops One', cursive;
			opacity: 0.7;
		}
		body{
			background: url('<spring:url value="/images/fondo.jpg" />');
			width: 100%;
			height: 100%;
			position: absolute;
			padding: 15px;
			margin:0px;
		}
		
		.row{
			color: white;
			background-color: rgba(0, 10, 28, 0.5); 
			border-radius: 10px;
			width: 700px;
			height: 300px;
		}
	
	
		a{
			font-family: 'Exo', sans-serif;
			font-size: 20px;
		}
		button{
			font-family: 'Exo', sans-serif;
			font-size: 20px;
		}
		.navbar-expand-lg {
			color:#FFFFFF;
		}		
		
	</style>
	
</head>
<body>

	<div class="container-fluid">
	
	
		<nav class="navbar navbar-dark navbar-expand-lg" style="background-color: #000A1C">
	 		<a class="navbar-brand" >
			    <img src='<spring:url value="/images/alexa1.gif" />' width="50" height="50" class="d-inline-block align-top" alt="" >
			    ALEXA
		  	</a>
	 		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	    		<span class="navbar-toggler-icon"></span>
	  		</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
			    <ul class="navbar-nav mr-auto">
				<li class="nav-item ">
				<a class="nav-link" href="alexa.html">Inicio <span class="sr-only"></span></a>
				</li>
				<li class="nav-item ">
				<a class="nav-link" href="cursos.html">Cursos <span class="sr-only"></span></a>
				</li>
				<li class="nav-item ">
				<a class="nav-link" href="horario.html">Horario<span class="sr-only"></span></a>
				</li>
				<li class="nav-item ">
				<a class="nav-link" href="laboratorios.html">Laboratorios<span class="sr-only"></span></a>
				</li>
				<li class="nav-item ">
				<a class="nav-link" href="evaluaciones.html">Evaluaciones<span class="sr-only"></span></a>
				</li>
			
			    </ul>
	  
	      		<button class="btn btn-secondary my-2 my-sm-0" type="submit">Cerrar Sesión</button>
	  		</div>
		</nav>
	</div>


	
	
	<p> The time on the server is ${serverTime}.</p>
	
	<script src="jquery.js"></script>
	<script src="jquery.datetimepicker.full.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/3.1.1/jquery.min.js"></script>
	<script defer src="https://use.fontawesome.com/releases/v5.0.9/js/all.js" integrity="sha384-8iPTk2s/jMVj81dnzb/iFR2sdA7u06vHJyyLlAd4snFpCl/SnyUjRrbdJsw1pGIl" crossorigin="anonymous"></script>
	
	
</body>
</html>