<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">
            <img class="navbar-brand" src="/resources/img/logo/lg2.png" alt="logo"></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item">
              <a class="nav-link" href="/">Home </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/aboutus">About Us</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/add-contact">Contact Us</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/customer_registration">SignUp</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="/customerlogin">Login</a>
              </li>
              <!-- <li class="nav-item">
                <a class="nav-link" href="/adminlogin">Admin Login</a>
              </li> -->
            </ul>
            
            
          <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
          </form>
        </div>
      </nav>