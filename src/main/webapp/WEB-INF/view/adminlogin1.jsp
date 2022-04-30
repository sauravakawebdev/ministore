<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADMIN</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<link rel="stylesheet" href="./resources/css/login.css">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: black;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
h1
{
	color: red;
}
</style>
</head>
<body onload="document.getElementById('id01').style.display='block' " style="width:auto;">
	<!-- <h1 class="text-center">ADMIN</h1> -->


<!-- <button onclick="document.getElementById('id01').style.display='block' " style="width:auto;">Login</button> -->
	<div id="id01" class="modal">
		
		<form class="modal-content animate" action="/admin" method="post">
		 <div class="imgcontainer">
   
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
     <!--  <img src="img_avatar2.png" alt="Avatar" class="avatar"> -->
    </div>
		
			  <div class="container">
			    <label for="user_name" class="form-label">User Name</label>
			    <input type="text" class="form-control" id="userName" name="userName" aria-describedby="emailHelp">
			    <!-- <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div> -->
			
			    <label for="password" class="form-label">Password</label>
			    <input type="password" class="form-control" id="pass" name="pass">
			 </div>
			 <!--  <div class="mb-3 form-check">
			    <input type="checkbox" class="form-check-input" id="exampleCheck1">
			    <label class="form-check-label" for="exampleCheck1">Check me out</label>
			  </div> -->
			  <button type="submit">Login</button>
      		<label>
        	<input type="checkbox" checked="checked" name="remember"> Remember me
     		 </label>
			  <div class="container" style="background-color:green">
      			<button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
      			<span class="psw">Forgot <a href="#">password?</a></span>
    			</div>
		</form>
		<h1 >${message }</h1>
	</div>
	
	<h1 >${message }</h1>
</body>
</html>