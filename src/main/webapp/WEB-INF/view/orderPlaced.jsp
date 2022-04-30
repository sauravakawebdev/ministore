<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ORDER PLACED</title>
<link href="https://fonts.googleapis.com/css?family=Nunito+Sans:400,400i,700,900&display=swap" rel="stylesheet">
 <!-- <link type="text/css" rel="stylesheet" href="/resources/css/style_admin.css" /> -->
    <link type="text/css" rel="stylesheet" href="/resources/css/font-awesome.min_admin.css" />
 <style>
      body {
        text-align: center;
        padding: 40px 0;
        background: #EBF0F5;
      }
        h1 {
          color: #88B04B;
          font-family: "Nunito Sans", "Helvetica Neue", sans-serif;
          font-weight: 900;
          font-size: 40px;
          margin-bottom: 10px;
        }
        p {
          color: #404F5E;
          font-family: "Nunito Sans", "Helvetica Neue", sans-serif;
          font-size:20px;
          margin: 0;
        }
      i {
        color: #9ABC66;
        font-size: 100px;
        line-height: 200px;
        margin-left:-15px;
      }
      .card {
        background: white;
        padding: 60px;
        border-radius: 4px;
        box-shadow: 0 2px 3px #C8D0D8;
        display: inline-block;
        margin: 0 auto;
      }
    </style>
</head>
<body>
	<div class="card">
      <div style="border-radius:200px; height:200px; width:200px; background: #F8FAF5; margin:0 auto;">
        <!-- <i class="fa-solid fa-check"></i> -->
      </div>
        <h1>Success</h1> 
        <p>We received your purchase request;<br/> we'll be in touch shortly!</p>
        <p>One Item will be delivered at</p><br/>
	 <p>${billingAddress.fullName }</p><br/>
	<p>${billingAddress.address }</p><br/>
	<p>${billingAddress.city }</p><br/>
	<p>${billingAddress.state }</p><br/>
	<p>${billingAddress.pincode }</p><br/>
      </div>
	<%-- <h1>Order Placed</h1><br/>
	<h2>One Item will be delivered at</h2><br/>
	${billingAddress.fullName }<br/>
	${billingAddress.address }<br/>
	${billingAddress.city }<br/>
	${billingAddress.state }<br/>
	${billingAddress.pincode }<br/> --%>
</body>
</html>