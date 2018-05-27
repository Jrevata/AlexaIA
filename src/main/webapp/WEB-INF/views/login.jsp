<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Inicio de Sesion</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="/estilos.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
	<style type="text/css">
		.navbar-brand{
			text-align: center;
			padding: 0;
			font-size: 35px;
			font-family: 'Black Ops One', cursive;
			opacity: 0.7;
			filter:alpha (opacity=70);
		}
		body{
			padding: 0;
			margin:0;
			width: 100%;
    		background-image: url('<spring:url value="/images/fondo.jpg" />');
    		background-size: cover;
		}
		.container-fluid{
			

		}
		.form{
			width: 500px;
			height: 500px;
			text-align: center;
			margin: 0 auto;
			background-color: rgba(0, 10, 28, 0.7); 
			margin-top: 150px;
			border-radius: 4px;
		}
		.form img{
			margin-top: -60px;
			margin-bottom: -30px;
			border-radius: 50%;
			width: 300px;	
		}
		input{
			height: 45px;
			width: 300px;
			font-family: 'Poppins', sans-serif;
			font-size: 18px;
			margin-bottom: 20px;
			background-color: #fff;
			padding-left: 30px;
		}
		h1{
			font-family: 'Poppins', sans-serif;
			background: white;
		}
		i{
			size: 20px;
		}
		.btn-login{
			background-color: #000A1C;
			font-style: white;
			border:none;
			color: #fff;
			border-radius: 4px;
		}
		.fixed-top {
			color:#FFFFFF;
		}	

	</style>
	
</head>
<body>
	
	
	<!-- <form method = "post" action="login">
		<input type="text"  name="usuario"/><br>
		<input type="password" name="clave" /> <br>
		
		<input type="submit" value="Log In We" />
	
	</form>
	 -->
	
	<div class="container-fluid">
		<nav class="navbar navbar-dark fixed-top" style="background-color: #000A1C">
		  <a class="navbar-brand" >
		    <img src='<spring:url value="/images/alexa1.gif" />' width="50" height="50" class="d-inline-block align-top" alt="" >
		    ALEXA
		  </a>
		</nav>
		<div class="form">
			<img alt="alexa.gif" src='<spring:url value="/images/alexalogo.png" />' />
			<h1>Sesión</h1>
			<br>
			<!--
			<form method = "post" action="login">
				<input type="text"  name="usuario"/><br>
				<input type="password" name="clave" /> <br>	
				<input type="submit" value="Log In We" />
			</form>
			-->
			
			<form method = "post" action="login">
				<div class="form-input">
					<input type="text" name="usuario" placeholder="Usuario">
				</div>
				<div class="form-input">
					<input type="password" name="clave" placeholder="Contraseña">
				</div>
				<input type="submit" name="submit" value="Iniciar Sesión" class="btn-login">
				<br />
				<i class="fab fa-google-plus-square fa-3x" aria-hidden="true"></i> </a>
			</form>
			
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/3.1.1/jquery.min.js"></script>
	<link href="https://fonts.googleapis.com/css?family=Black+Ops+One|Exo|Exo+2|Pacifico|Poppins" rel="stylesheet">
	<script defer src="https://use.fontawesome.com/releases/v5.0.9/js/all.js" integrity="sha384-8iPTk2s/jMVj81dnzb/iFR2sdA7u06vHJyyLlAd4snFpCl/SnyUjRrbdJsw1pGIl" crossorigin="anonymous"></script>
	
	
</body>
</html>