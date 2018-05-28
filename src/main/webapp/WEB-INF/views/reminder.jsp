<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>AlexaIA - Recordartorio</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
	<link href="https://fonts.googleapis.com/css?family=Black+Ops+One|Exo|Exo+2|Pacifico|Poppins|Amaranth:400,700" rel="stylesheet" />
	<style type="text/css">
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
		.navbar-brand{
			text-align: center;
			padding: 0;
			font-size: 35px;
			font-family: 'Black Ops One', cursive;
			opacity: 0.7;
			filter:alpha (opacity=70);
		}
		.container {
			margin: 0px;
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
 		<a class="navbar-brand" href="home">
		    <img src='<spring:url value="/images/alexa1.gif" />' width="50" height="50" class="d-inline-block align-top" alt="" >
		    ALEXA
	  	</a>
 		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    		<span class="navbar-toggler-icon"></span>
  		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
		    <ul class="navbar-nav mr-auto">
				<li class="nav-item ">
					<a class="nav-link" href="home">Inicio <span class="sr-only"></span></a>
				</li>
				<li class="nav-item ">
					<a class="nav-link" href="#">Cursos <span class="sr-only"></span></a>
				</li>
				<li class="nav-item ">
					<a class="nav-link" href="perfil">Perfil<span class="sr-only"></span></a>
				</li>
				<li class="nav-item ">
					<a class="nav-link" href="recordatorio/listar">Ver recordatorios<span class="sr-only"></span></a>
				</li>
				<li class="nav-item ">
					<a class="nav-link" href="recordatorio/crear">Nuevo Recordatorio<span class="sr-only"></span></a>
				</li>
		    </ul>
  
      		<button class="btn btn-secondary my-2 my-sm-0" type="submit">Cerrar Sesión</button>
  		</div>
	</nav>
	
	<header class="fixed-top" style="margin-top: 120px;" >
		<div style="background: #1ABCD9; width: 240px; padding: 15px;">
			<h2>Recordatorios</h2>
		</div>
	</header>
	<div id="dia" class="fixed-top" style="margin-top: 175px; margin-left: 4%; display: flex; justify-content: center; align-items: center; flex-direction: column; padding-bottom: 5px;">
		<h3>27</h3> 
		<h5>Mayo</h5>
	</div>

	<div class="container" style="margin-top: 200px;">
		<div class="row">
			<section class="col-md-9">	
				<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel" data-interval="6000">
					<ol class="carousel-indicators">
						<li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
					    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
					    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
					</ol>
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img class="d-block w-100" src='<spring:url value="/images/coursel1.jpg" />' alt="First slide">
							<div class="carousel-caption d-none d-md-block">
								<h5>Recordatorio 1</h5>
							</div>
						</div>
						<div class="carousel-item">
							<img class="d-block w-100" src='<spring:url value="/images/coursel1.jpg" />' alt="First slide">
							<div class="carousel-caption d-none d-md-block">
								<h5>Recordatorio 2</h5>
							</div>
						</div>
						<div class="carousel-item">
							<img class="d-block w-100" src='<spring:url value="/images/coursel1.jpg" />' alt="First slide">
							<div class="carousel-caption d-none d-md-block">
								<h5>Recordatorio 3</h5>
							</div>
						</div>
					</div>
					<a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
						<span class="carousel-control-prev-icon" aria-hidden="true"></span>
						<span class="sr-only">Previous</span>
					</a>
					<a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
						<span class="carousel-control-next-icon" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>
				</div>
			</section>		
			<aside class="col-md-3">
				<div style="margin-bottom: 15px;">
					<h3 style="display: inline-block;">Mañana</h3>
					<h3 style="display: inline-block; float: right;">28 Mayo</h3>
				</div>
				<div style="max-height: 20rem; overflow: auto; padding: 15px;">
					<div class="card text-white bg-warning mb-3" style="max-width: 18rem; margin-bottom: 5px; margin: auto;">
						<div class="card-body" style="text-align: center;">
							<h5 class="card-title" style="margin: 0px;">Redatorio</h5>
						</div>
					</div>
					<div class="card text-white bg-warning mb-3" style="max-width: 18rem; margin-bottom: 5px; margin: auto;">
						<div class="card-body" style="text-align: center;">
							<h5 class="card-title" style="margin: 0px;">Redatorio</h5>
						</div>
					</div>
					<div class="card text-white bg-warning mb-3" style="max-width: 18rem; margin-bottom: 5px; margin: auto;">
						<div class="card-body" style="text-align: center;">
							<h5 class="card-title" style="margin: 0px;">Redatorio</h5>
						</div>
					</div>
				</div>
			</aside>
		</div>
	</div>
	


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
	
	
</body>
</html>