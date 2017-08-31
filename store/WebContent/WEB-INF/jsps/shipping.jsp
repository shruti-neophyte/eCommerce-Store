<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Carousel Template for Bootstrap</title>



<!-- Bootstrap core CSS -->
<link href="<c:url value="/static/css/bootstrap.min.css" />"
	rel="stylesheet" type="text/css">


</head>
<!-- NAVBAR
================================================== -->
<body>
	<div class="navbar-wrapper">
		<div class="container">

			<nav class="navbar navbar-inverse navbar-static-top">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar" aria-expanded="false"
						aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">Project name</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li class="active"><a href="#">Home</a></li>
						<li><a href="#about">About</a></li>
						<li><a href="#contact">Contact</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">Dropdown <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">Action</a></li>
								<li><a href="#">Another action</a></li>
								<li><a href="#">Something else here</a></li>
								<li role="separator" class="divider"></li>
								<li class="dropdown-header">Nav header</li>
								<li><a href="#">Separated link</a></li>
								<li><a href="#">One more separated link</a></li>
							</ul></li>
					</ul>
				</div>
			</div>
			</nav>

		</div>
	</div>




	<div class="container-wrapper">

		<div class="container"></div>
		<div class="page-header">
			<h1>Shipping</h1>
			<p class="lead">Shipping Details</p>
		</div>
		User:${fromUser}
		<form method="post" commandName="message" class="form-horizontal">
			
			<input type="hidden" name="_flowExecutionKey"
				value="${flowExecutionKey}" /> 
				
				<input type="hidden" name="_eventId"
				value="send" />

			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">Street
					Name</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="street"
						path="streetname" value="${fromStreet}">
				</div>
			</div>
			<div class="form-group">
				<label for="inputPassword3" class="col-sm-2 control-label">Aptno</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="aptno" path="aptno"
						value="${fromApt}">
				</div>
			</div>
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">City</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="city" path="city"
						value="${fromCity}">
				</div>
			</div>
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">Country</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="country" path="country"
						value="${fromCountry}">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Next</button>
				</div>
			</div>
		</form>










		<!-- FOOTER -->
		<footer>
		<p class="pull-right">
			<a href="#">Back to top</a>
		</p>
		<p>
			&copy; 2016 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a
				href="#">Terms</a>
		</p>
		</footer>

	</div>
	<!-- /.container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

	<script>
		window.jQuery
				|| document
						.write('<script src="<c:url value="/static/js/jquery.min.js" />"><\/script>')
	</script>

	<script src="<c:url value="/static/js/bootstrap.min.js" />"></script>
</body>
</html>