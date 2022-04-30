<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" type="image/x-icon" href="img/logo/favicon.ico">
    <title>Mobicity</title>
    
    

    <link rel="stylesheet" href="/resources/css/bootstrap.css">
    <link rel="stylesheet" href="/resources/css/style.css">
    <script src="/resources/js/jquery-3.6.0.js"></script>

<script src="js/bootstrap.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

   <!---<link rel="stylesheet" href="css/bootstrap.min.css">--> 
</head>
<body>
    
      
     <jsp:include page="template/header.jsp" />
     
      
      
      <!-------Slider-->
      
      <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img class="d-block w-100" src="/resources/img/slider//slider4.png" alt="First slide">
                 
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="/resources/img/slider/slider1.jpeg" alt="Second slide">
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="/resources/img/slider/slider2.jpeg" alt="Third slide">
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
<!------------------------------------------------------------------------------------------------------>

<!---------------------------Main Category -->
<p class="text-center"><h2>Mega Sale</h2></p>

<div class="container-flued">

    <div class="row">
        <div class="col-sm-6" style="background-color:lavenderblush;">
        
        <a href="#"><img src="/resources/img/Product/mobb.png" alt="" class="img-responsive" width="100%" height="200px" alt="Cinque Terre"></a>
        
        </div>
        <div class="col-sm-6" style="background-color:lavenderblush;">
            <a href="#"><img src="/resources/img/Product/comp.png" alt=""  class="img-responsive"width="100%" height="200px" alt="Cinque Terre"></a>
        </div>
      </div>
</div>



<!-----Products-->
<div class="container">
    <div class="row">
    	<!-- <h3>Mobile</h3> -->
       <c:forEach var="product" items="${products}">
    
        <div class="col-md-4">
            <div class="item">
                <h1>${product.productName}</h1>	
                <p class="text-primary">${product.price }</p><img src=/${product.productimage } alt="camera" class="img-fluid">
           <div class="overlay d-flex align-items-center justify-content-center"><a href="productdetails/${product.pId}" class="btn btn-unique" data-abc="true">View Details</a></div>
            </div>
           
        </div>
        </c:forEach> 
       <%--  <br/>
        <h3>Laptop</h3>
        <c:forEach var="productLaptop" items="${productsLaptop}">
    
        <div class="col-md-4">
            <div class="item">
                <h1>${productLaptop.productName}</h1>	
                <p class="text-primary">${productLaptop.price }</p><img src=/${productLaptop.productimage } alt="camera" class="img-fluid">
           <div class="overlay d-flex align-items-center justify-content-center"><a href="productdetails/${productLaptop.pId}" class="btn btn-unique" data-abc="true">View Details</a></div>
            </div>
           
        </div>
        </c:forEach> --%>
<!--         <div class="col-md-4">
            <div class="item">
                <h4>DELL Laptop with 500GB HDD 8GB RAM</h4>
                <p class="text-primary">3599</p><img src="https://res.cloudinary.com/dxfq3iotg/image/upload/v1571751108/Ecommerce/laptop-dell-xps-15-computer-monitors-laptops.jpg" alt="camera" class="img-fluid">
                <div class="overlay d-flex align-items-center justify-content-center"><a href="detail.html" class="btn btn-unique" data-abc="true">View Details</a></div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="item">
                <h4>Asus Laptop with 1TB HDD 8GB RAM</h4>
                <p class="text-primary">6699</p><img src="https://res.cloudinary.com/dxfq3iotg/image/upload/v1571750722/Ecommerce/acer-v-17-nitro-realsense.jpg" alt="camera" class="img-fluid">
                <div class="overlay d-flex align-items-center justify-content-center"><a href="detail.html" class="btn btn-unique" data-abc="true">View Details</a></div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="item">
                <h4>HP Laptop with 250GB HDD 4GB RAM</h4>
                <p class="text-primary">76399</p><img src="https://res.cloudinary.com/dxfq3iotg/image/upload/v1571750391/Ecommerce/hp-17-x061nr-white-background.jpg" alt="camera" class="img-fluid">
                <div class="overlay d-flex align-items-center justify-content-center"><a href="detail.html" class="btn btn-unique" data-abc="true">View Details</a></div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="item">
                <h4>Asus Laptop with 500GB HDD 16GB RAM</h4>
                <p class="text-primary">2699</p><img src="https://res.cloudinary.com/dxfq3iotg/image/upload/v1571750338/Ecommerce/Laptop-3.jpg" alt="camera" class="img-fluid">
                <div class="overlay d-flex align-items-center justify-content-center"><a href="detail.html" class="btn btn-unique" data-abc="true">View Details</a></div>
            </div>
        </div>
        <div class="col-md-4">
            <div class="item">
                <h4>DELL XPS with 500GB HDD 8GB RAM</h4>
                <p class="text-primary">4799</p><img src="https://res.cloudinary.com/dxfq3iotg/image/upload/v1571751108/Ecommerce/laptop-dell-xps-15-computer-monitors-laptops.jpg" alt="camera" class="img-fluid">
                <div class="overlay d-flex align-items-center justify-content-center"><a href="detail.html" class="btn btn-unique" data-abc="true">View Details</a></div>
            </div>
        </div> -->
    </div>
</div>





<!-------Footer------------------------------->
<jsp:include page="template/footer.jsp" />
</body>
</html>