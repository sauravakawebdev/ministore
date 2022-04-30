<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ContactUS</title>
<style>

body{
    background: -webkit-linear-gradient(left, #555254, #555254);
}
.contact-form{
    background: white;
    margin-top: 10%;
    margin-bottom: 5%;
    width: 70%;
}
.contact-form .form-control{
    border-radius:1rem;
}
.contact-image{
    text-align: center;
}
.contact-image img{
    border-radius: 6rem;
    width: 11%;
    margin-top: -3%;
    transform: rotate(29deg);
}
.contact-form form{
    padding: 14%;
}
.contact-form form .row{
    margin-bottom: -7%;
}
.contact-form h3{
    margin-bottom: 8%;
    margin-top: -10%;
    text-align: center;
    color: #0062cc;
}
.contact-form .btnContact {
    width: 50%;
    border: none;
    border-radius: 1rem;
    padding: 1.5%;
    background: #dc3545;
    font-weight: 600;
    color: #fff;
    cursor: pointer;
}
.btnContactSubmit
{
    width: 50%;
    border-radius: 1rem;
    padding: 1.5%;
    color: #fff;
    background-color: #0062cc;
    border: none;
    cursor: pointer;
}
</style>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="/resources/css/bootstrap.css">
    <link rel="stylesheet" href="/resources/css/style.css">
    <script src="/resources/js/jquery-3.6.0.js"></script>

<script src="js/bootstrap.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<!------ Include the above in your HEAD tag ---------->
</head>
<body>
<jsp:include page="template/header.jsp" />

<div class="container contact-form">
            <div class="img-rounded"">
                <img src="/resources/img/logo/lg2.png" alt="rocket_contact" height="200px"/>
            </div>
       
                <h3>About Us</h3>
               <p> Welcome to <b>mobicity portal</b>, your number one source for all things <b>Mobile and Laptop</b>. We're dedicated to giving you the very best of products, with a focus on three characteristics, ie: <b>dependability, customer service and uniqueness.</b>
					Founded in Jan 2022 by <b>Mobicity Portal Team</b>. Reputed Brands has come a long way from its beginnings in a starting location online.We are really feels very glad to deliver you dream products on your home. We hope you enjoy our products as much as we enjoy offering them to you. If you have any questions or comments, please don't hesitate to <b>contact us.</b>
				<div>
<pre>


Sincerely,
Mobicity Team, 


</pre>
		<h4>Happy To Serving You....!</h4>
				</p>
				</div>
            
</div>
<!-------Footer------------------------------->
<jsp:include page="template/footer.jsp" />
		
	</body>	
</html>








