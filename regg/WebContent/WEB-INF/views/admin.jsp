<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>| Administrator |</title>
</head>
<body background="../images/finall.png">
<center>
<h1><b>| Administrator Login |</b></h1></center>
 <div align="center">
  <h3><b>Login</b></h3>
  <form action="<%= request.getContextPath() %>/adminlogin" method="post">
   <table style="with: 80%">
    <tr>
     <td>UserName</td>
     <td><input type="text" name="username" style="width: 150px; "/></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" style="width: 151px; "/></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </br></br>
 </br>

  <a href="http://localhost:8080/regg/front">HOME</a>
 </div>
</body>
</html>