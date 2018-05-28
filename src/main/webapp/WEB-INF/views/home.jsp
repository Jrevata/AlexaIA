<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
	<meta charset="utf-8">
	<link href="https://fonts.googleapis.com/css?family=Amaranth:400,700" rel="stylesheet">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<link href="https://fonts.googleapis.com/css?family=Black+Ops+One|Exo|Exo+2|Pacifico|Poppins" rel="stylesheet">
	
	<title>Alexa IA</title>
	<style type="text/css">
		.navbar-brand{
			text-align: center;
			padding: 0;
			font-size: 35px;
			font-family: 'Black Ops One', cursive;
			opacity: 0.7;
			filter:alpha (opacity=70);
		}
		a { text-decoration: none; }
		body{
			display: flex;
			align-items: center;
			justify-content: center;
			padding: 0;
			margin:0;
			width: 100vw;
			background: url(<spring:url value="/images/fondo.jpg" />)center no-repeat ;
			height: 100vh;
		}
		.jumbotron{
			width: 80%
			height: auto;
			text-align: center;
			background-color: rgba(0, 10, 28, 0.7); 
			border-radius: 4px;
			color: white;
		}
		.card { background: none; }
		.options {
			width: 50%;
			margin: auto;
		}
		.tar {
			background-image: url(<spring:url value="/images/bac1.jpg" />);
			background-size: 100%;
			opacity: .5;
			background-repeat: no-repeat;
			padding: 40px 0 ;
			border-radius: 10px;
		}
		.tar1 {
			background-image: url(<spring:url value="/images/bac.jpg" />);
			background-size: 100%;
			opacity: .5;
			background-repeat: no-repeat;
			padding: 40px 0 ;
			border-radius: 10px;
		}
		.tar2 {
			background-image: url(<spring:url value="/images/bac6.png" />);
			background-size: 100%;
			opacity: .5;
			background-repeat: no-repeat;
			padding: 40px 0 ;
			border-radius: 10px;
		}
		.tar:hover { opacity: 1; }
		.tar1:hover { opacity: 1; }
		.tar2:hover { opacity: 1; }
		.tarjeta:hover{
			text-decoration: none;
		    -webkit-transform: scale(1.1);
		    -moz-transform: scale(1.1);
		    -o-transform: scale(1.1);
		    -ms-transform: scale(1.1);
		    transform: scale(1.1)
		    opacity: 1;
    		filter: alpha(opacity=100);
		}
		p {
			margin-top: 15px;
			color: #FFF;
			font-size: 30px;
			font-family: 'Amaranth', sans-serif;
			text-decoration-style: bold; 
		}
	</style>
</head>
<body>
	
	<nav class="navbar navbar-dark fixed-top" style="background-color: #000A1C">
	  <a class="navbar-brand" href="home"  >
	    <img src='<spring:url value="/images/alexa1.gif" />' width="50" height="50" class="d-inline-block align-top" alt="" />
	    ALEXA
	  </a>
	</nav>
	<div class="jumbotron">
	  	<div class="container">
		  	<div class="row">
		  		<div class="col-md-4" >
		  			<a href="recordatorio">
						<div class="card tarjeta tar">
						  <img class="card-img-top options" src='<spring:url value="/images/reminder.png" />' alt="Card image cap">
						  <div class="card-body">
						    <p class="card-text">
						    	Recordatorios
							</p>
						  </div>
						</div>
		  			</a>
		  		</div>
		  		<div class="col-md-4" >
		  			<a href="#">
			  			<div class="card tarjeta tar1" >
						  	<img class="card-img-top options" src='<spring:url value="/images/courses.png" />' alt="Card image cap">
						  	<div class="card-body">
						    	<p class="card-text">
						    		Cursos
								</p>
						  	</div>	
						</div>
					</a>
		  		</div>
		  		<div class="col-md-4">
		  			<a href="perfil">
			  			<div class="card tarjeta tar2">
						  	<img class="card-img-top options" src='<spring:url value="/images/configuration.png" />' alt="Card image cap">
						  	<div class="card-body">
						    	<p class="card-text">
						    		Personal
								</p>
						  	</div>
						</div>
		  			</a>
		  		</div>
		  	</div>
	  	</div>
	</div>

	<!-- <p> The time on the server is ${serverTime}.</p> -->
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/3.1.1/jquery.min.js"></script>
	<script defer src="https://use.fontawesome.com/releases/v5.0.9/js/all.js" integrity="sha384-8iPTk2s/jMVj81dnzb/iFR2sdA7u06vHJyyLlAd4snFpCl/SnyUjRrbdJsw1pGIl" crossorigin="anonymous"></script>	
	
</body>
</html>