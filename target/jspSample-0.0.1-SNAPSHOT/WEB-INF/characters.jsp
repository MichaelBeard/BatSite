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
<title>Characters</title>
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
  <div class = "container">
<div class="row align-items-end">
    <div class="col">
      <img src="<c:url value="https://avatarfiles.alphacoders.com/717/thumb-71761.jpg" class = "img-thumbnail"/>"/>
    </div>
    <div class="col">
     
      <img src="<c:url value="https://avatarfiles.alphacoders.com/123/thumb-123500.jpg" class = "img-thumbnail"/>"/>
    </div>
    <div class="col">
      
    	<img src="<c:url value="https://avatarfiles.alphacoders.com/112/11202.jpg" class = "img-thumbnail"/>"/>
    </div>
  <div class="col">
     
    <img src="<c:url value="https://avatarfiles.alphacoders.com/131/131374.jpg" class = "img-thumbnail"/>"/>
    </div>
  <div class="col">
      
    <img src="<c:url value="https://avatarfiles.alphacoders.com/435/thumb-43558.jpg" class = "img-thumbnail"/>"/>
    </div>
  
  </div>
</div>
</body>
</html>