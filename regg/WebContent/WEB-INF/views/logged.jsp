<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@page import="net.javaa.regg.dao.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome User</title>
<style>
body {
background-color: #66ff66;
    background-image: url("../images/finall.png");
}
</style>
</head>
<body>
<script>

function myFunction() {
alert("Book Issued!");
}
function myFunction1() {
	alert("Book Returned!");
	}
function myFunction2() {
	alert("Password Changed!");
	}
</script>
 <h1><center>Welcome!</center>
 </h1>
 <form action="<%= request.getContextPath() %>/issue" method="post">
 <div align="left">
 <h2>Issue A Book</h2>
   <table style="with: 80%">
    <tr>
     <td>Book ID</td>
     <td><input type="text" name="bid" style="width: 150px; "/></td>
    </tr>
   </table>
   <button>Issue
   <input type="submit" value="Submit" onclick="myFunction()"/>
  </button>
  </div>
  </form>
  
  <form action="<%= request.getContextPath() %>/returns" method="post">
 <div align="right">
 <h2>Return A Book</h2>
   <table style="with: 80%">
    <tr>
     <td>Book ID</td>
     <td><input type="text" name="bid" style="width: 150px; "/></td>
    </tr>
   </table>
   <button>Return
   <input type="submit" value="Submit" onclick="myFunction1()"/>
  </button>
  </div>
  </form>
  
  <form action="<%= request.getContextPath() %>/changep" method="post">
 <div align="left">
 <h2>Change Password</h2>
   <table style="with: 80%">
    <tr>
     <td>Current Password</td>
     <td><input type="password" name="username" style="width: 150px; "/></td>
    </tr>
    <tr>
     <td>New Password</td>
     <td><input type="password" name="password" style="width: 150px; "/></td>
    </tr>
   </table>
   <button>Change
   <input type="submit" value="Submit" onclick="myFunction2()"/>
  </button>
  </div>
  </form>
  
   <center>
 <a href="http://localhost:8080/regg/login">Go Back</a>
 </br>
 <a href="http://localhost:8080/regg/front">HOME PAGE</a>
</center>
</body>
</html>
