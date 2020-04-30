<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>| Administrator |</title>
<style>
body {
background-color: #ff8533;
    background-image: url("../images/finall.png");
}
</style>
</head>
<body>
<center>
<h1><b>| Administrator |</b></h1></center>
 <div align="center">
  <h2><b>|Registration|</b></h2>
  <form action="<%= request.getContextPath() %>/register" method="post">
   <table style="with: 80%">
    <tr>
     <td>First Name</td>
     <td><input type="text" name="firstName" /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="lastName" /></td>
    </tr>
    <tr>
     <td>UserName</td>
     <td><input type="text" name="username" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td style="width: 148px; "><input type="password" name="password" style="width: 145px; "/></td>
    </tr>
    <tr>
     <td>Address</td>
     <td><input type="text" name="address" /></td>
    </tr>
    <tr>
     <td>Contact No</td>
     <td><input type="text" name="contact" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
  <a href="http://localhost:8080/regg/login">OLD USER LOGIN</a>
 </br>
  <a href="http://localhost:8080/regg/front">HOME</a>
 </div>
</body>
</html>