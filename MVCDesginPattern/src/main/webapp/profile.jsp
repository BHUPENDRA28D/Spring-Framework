<%@page import="com.sp.model.UserProfile"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Profile Page </title>
</head>
<body>

<% 
   UserProfile user = (UserProfile) session.getAttribute("session_user");

%>



  <h2> Welcome to User Profile </h2>  <br> <br>
   <h3> Name   :  <%= user.getName() %>  </h3> 
    <h3>Email  :  <%= user.getEmail() %>  </h3> 
     <h3>City  :  <%= user.getCity() %>  </h3> 
     
     <a href = "logout"> Logout </a>
</body>
</html>