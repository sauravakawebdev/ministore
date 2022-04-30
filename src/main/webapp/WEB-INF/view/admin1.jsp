<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
    <title>Admin Dashboard</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-witdh, initial-scale=1.0" />
    <link type="text/css" rel="stylesheet" href="/resources/css/style_admin.css" />
    <link type="text/css" rel="stylesheet" href="/resources/css/font-awesome.min_admin.css" />

    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap" rel="stylesheet">
   	 <link href="https://fonts.googleapis.com/css2?family=Raleway:wght@600;700&display=swap" rel="stylesheet">
    
    <style type="text/css">
    
    .scroll {
              
                overflow-x: hidden;
                overflow-y: auto;
               
            }

    
   	 
    </style>
    
   
</head>

<body>
    <section id="sidebar">
        <div class="sidebar-brand">
            <h2><i class="fa fa-desktop"></i> <div>Mobicity Admin Panel</div></h2>
        </div>
        <div class="sidebar-menu">
            <ul>
                <li><a href="#"><i class="fa fa-desktop"></i> <span>Dashboard</span></a></li>
                <li><a href="#"><i class="fa fa-users"></i> <span>Customers</span></a></li>
                <li><a href="/customerQuery"><i class="fa fa-file"></i> <span>Customer Queries</span></a></li>
                <li><a href="viewProduct"><i class="fa fa-file"></i> <span>Products</span></a></li>
				<li><a href="/admin/addproduct"><i class="fa fa-user"></i> <span>Add Product</span></a></li>
                <li><a href="#"><i class="fa fa-file-pdf-o"></i> <span>Orders</span></a></li>
                <li><a href="/addCategories"><i class="fa fa-money"></i> <span>Add Categories</span></a></li>
                <li><a href="#"><i class="fa fa-user"></i> <span>Account</span></a></li>
                <li><a href="/adminLogout"><i class="fa fa-sign-out"></i> <span>Logout</span></a></li>
            </ul>
        </div>
    </section>

    <Section id="main-content">
        <header>
            <div class="header-left">
                <h2 class="toggle-btn">
                    <i class="fa fa-bars"></i> Mobicity Dashboard </h2>
            </div>
            <div class="header-left header-serach">
                <div class="serach-par">
                    <input class="search" type="text" placeholder="Search Here...">
                    <i class="fa fa-search"></i>
                </div>
            </div>
            <div class="header-left header-profile">
                <img src="/resources/img/user.png" class="img-responsive" />
                <h3>Mobicity</h3>
                <p>Admin</p>
            </div>
            <div class="clear"></div>
        </header>
        <div class="clear"></div>
        <div class="main-content-info container">
            <div class="card">
                <h2 class="cus-num cus-h">${customerCount}</h2>
                <p>Customers</p>
            </div>
            <div class="card">
                <h2 class="cus-num cus-pro">${productCount }</h2>
                <p>Products</p>
            </div>
            <div class="card">
                <h2 class="cus-num cus-ord">${countOrder }</h2>
                <p>Order</p>
            </div>
            <!-- <div class="card">
                <h2 class="cus-num cus-inc">000</h2>
                <p>Income</p>
            </div> -->
            <div class="clear"></div>
        </div>
        <div class="content-pro-par container">
            <div class="pro-table scroll">
                <div class="recent-project">
                    <div class="rec-pro-h">
                        <h2>View Products</h2>
                    </div>
                    <!-- <div class="see-all">
                        <button>See all</button>
                    </div> -->
                    <div class="clear"></div>
                </div>
                <table style="width:100%">
                    <tr>
                        <th>Product Name</th>
                        <th>Product Image</th>
                        <th></th>
                        <th></th>
                    </tr>
                    <c:forEach items="${products }" var="prd" >
	                    
                    
                     <tr>
                     	<td>${prd.productName }</td>
                     	<td><img src=/${prd.productimage } width="100px" alt="image" /></td>
                     	<td><a href="/editProduct/${prd.pId }">Edit</a></td>
                     	<td><a href="/deleteProduct/${prd.pId }">Delete</a></td>
                     </tr>
                     </c:forEach>
                </table>
            </div>
            <div class="pro-cus">
                <div class="recent-project">
                    <div class="rec-pro-h">
                        <h2>All Customers</h2>
                    </div>
                    <div class="see-all">
                        <button>See all</button>
                    </div>
                    <div class="clear"></div>
                </div>
                <table style="width:100%">
                    <tr>
                        <th>Pic</th>
                        <th>Name</th>
                        <th>Contact</th>
                    </tr>
                    <c:forEach items="${Customer}" var="customer">
                    	<tr>
                        <td><img class="table-img" src="/resources/img/user.png"/></td>
                        <td>${customer.fullName }</td>
                        <td class="cnt-info-td"><a href="#"><i class="fa fa-phone"></i></a><a href="#"><i class="fa fa-envelope"></i></a><a href="#"><i class="fa fa-map-marker"></i></a></td>
                    </tr>
                    </c:forEach>
                    
                    
                    
                </table>
            </div>
            <div class="clear"></div>
        </div>
    </Section>
    <div class="clear"></div>




    <script type="text/javascript" src="/resources/js/jquery-3.2.1.min_admin.js"></script>
    <script type="text/javascript" src="/resources/js/external_admin.js"></script>
</body>

</html>
