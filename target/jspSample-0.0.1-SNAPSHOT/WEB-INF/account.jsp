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
<title>Account Page</title>
</head>
<% SavedComics comics = (SavedComics) session.getAttribute("comic");  %>
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
  <label> Saved Comics </label>
<form action=""></form>
<table>
<tr>
<th>Comic Issue </th>
<th>Comic Name </th>
<th>Comic Price </th>
</tr>

<%
SavedComicsDAO savedcomicsDAO = new SavedComicsDAO();
	List<SavedComics> listOfSavedComics = new ArrayList<SavedComics> ();
	listOfSavedComics = savedcomicsDAO.getallComics();
for(SavedComics c : listOfSavedComics){
	out.write("<tr>");
	out.write("<td>"+c.getComicIssue() +"</td>");
	out.write("<td>"+c.getComicName() +"</td>");
	out.write("<td>"+c.getComicPrice() +"</td>");
	out.print("</tr>");
}
%>
</table>
</body>
</html>