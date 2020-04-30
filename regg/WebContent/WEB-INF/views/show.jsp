<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3333/";
String dbName = "employee";
String userId = "root";
String password = "root";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center" background="../images/finall.png"><font><strong>| BOOKS SECTION |</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#A52A2A">
<td><b>ID</b></td>
<td><b>Title</b></td>
<td><b>Author</b></td>
<td><b>Genre</b></td>
<td><b>Issued</b></td>

</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM books";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#DEB887">

<td><%=resultSet.getString("Id") %></td>
<td><%=resultSet.getString("Title") %></td>
<td><%=resultSet.getString("Author") %></td>
<td><%=resultSet.getString("Genre") %></td>
<td><%=resultSet.getString("Issued") %></td>
</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
<center>
<a href="http://localhost:8080/regg/front">HOME PAGE</a>
</center>