<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "springwork.model.*" %>
     <%@ page import = "springwork.dao.*" %>
     <%@ page import = "java.util.List" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "javax.servlet.http.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light" style="background-color:#3a486f;">
    <a class="navbar-brand" href="#">
    <img src="https://avatarfiles.alphacoders.com/717/71761.jpg" width="40" height="30" alt="">
  </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Account</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Comics</a>
          
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Characters</a>
        </li>
      </ul>
    </div>
  </nav>
  <br>
  <div class = "jumbotron">
  <div class="media">
  <img class="align-self-start mr-3 img-thumbnail" src="https://images-na.ssl-images-amazon.com/images/S/cmx-images-prod/Item/3946/DEC058055B._SX360_QL80_TTD_.jpg" height="20" alt="Generic placeholder image">
    
  <div class="media-body">
    <h1>Featured Comic</h1>
    <h5 class="mt-0">Batman: The Dark Knight Returns #2</h5>
    <p>The iconic series continues as a new Robin debuts and a gang of violent mutants stakes a claim on the streets of Gotham City. Unfortunately for them, The Dark Knight is about to prove that these streets are his, and he has a battle tank of a Batmobile to back him up!</p>
    <a class = "buyButton" href="https://www.comixology.com/Batman-The-Dark-Knight-Returns-2/digital-comic/3946"<button type="button" class="btn">Buy Here</button>>
  </div>
</div>
  </div>
    <!-- Media top -->
<ul class="list-unstyled">
  <li class="media">
    <img class="mr-3" src="https://images-na.ssl-images-amazon.com/images/S/cmx-images-prod/Item/3947/DEC058055C._SX360_QL80_TTD_.jpg" alt="Generic placeholder image">
    <div class="media-body">
      <h5 class="mt-0 mb-1">List-based media object</h5>
      Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.
    </div>
  </li>
  <li class="media my-4">
    <img class="mr-3" src="https://images-na.ssl-images-amazon.com/images/S/cmx-images-prod/Item/3948/DEC058055D._SX312_QL80_TTD_.jpg" alt="Generic placeholder image">
    <div class="media-body">
      <h5 class="mt-0 mb-1">List-based media object</h5>
      Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.
    </div>
  </li>
  <li class="media">
    <img class="mr-3" src="https://images-na.ssl-images-amazon.com/images/S/cmx-images-prod/Item/3945/DEC058055A._SX360_QL80_TTD_.jpg" alt="Generic placeholder image">
    <div class="media-body">
      <h5 class="mt-0 mb-1">List-based media object</h5>
      Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.
    </div>
  </li>
</ul>
</body>

</html>