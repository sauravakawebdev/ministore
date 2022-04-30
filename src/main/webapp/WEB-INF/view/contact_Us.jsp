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
    margin-top: 5%;
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
    padding:10%;
}
.contact-form form .row{
    margin-bottom: -10%;
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
<!------ Include the above in your HEAD tag ---------->
</head>
<body>
 <jsp:include page="template/header.jsp" />
<div class="container contact-form">
            <div class="img-rounded">
                <img src="/resources/img/logo/lg2.png" alt="rocket_contact" height="200px"/>
            </div>
              
            <form  action="ContactUsMessage" method="post" modelAttribute="Contacts">
              <h3>Drop Us a Message</h3>
               <div class="row">
                    <div class="col-md-6">
                        <div class="form-group">
                            <input type="text" name="first_name" class="form-control" placeholder="Enter Your first Name *" value="" />
                        </div>
                        <div class="form-group">
                            <input type="text" name="last_name" class="form-control" placeholder="Enter Your Last Name *" value="" />
                        </div>
                        <div class="form-group">
                            <input type="text" name="contactno" class="form-control" placeholder="Your Phone Number *" value="" />
                        </div>
                     
                        <div class="form-group">
                            <input type="submit" name="btnSubmit" class="btnContact" value="Send Message" />
                        </div>
                 
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <textarea name="issue" class="form-control" placeholder="Your Message *" style="width: 100%; height: 150px;"></textarea>
                        </div>
                    </div>
                </div>
            </form>
</div>
<jsp:include page="template/footer.jsp" />
</body>
</html>