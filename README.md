<b>Tools to be used</b>
1.	Use any IDE to develop the project. It may be Eclipse.
2.	Mysql for the database.
3.	Server: Apache Tomcat

<b>Front End and Back End</b>
1.	Front End: JSP, JDBC, Javascript, AJAX, Html
2.	Back End: MySQL

<b>Software Requirement to run this project</b>
1.	You need to install an IDE Eclipse .
2.	MySQL database. Here, we are using root for the username and root for the password.

<b>How to run this project</b>

1.Create MySQL Database name employee with password and username both root. 

2.Execute these 2 queries for making table:

•	CREATE TABLE `libusers` (`first_name` varchar(20) DEFAULT NULL,`last_name` varchar(20) DEFAULT NULL,`username` varchar(250) DEFAULT NULL,`password` varchar(20) DEFAULT NULL,`address` varchar(45) DEFAULT NULL,`contact` varchar(45) DEFAULT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

•	CREATE TABLE `books` (`id` int(3) NOT NULL AUTO_INCREMENT,`Title` varchar(20) DEFAULT NULL,`Author` varchar(20) DEFAULT NULL,`Genre` varchar(250) DEFAULT NULL,`Issued` varchar(20)DEFAULT NULL,PRIMARY KEY (`Id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

3.Import the project on the IDE and run it on Apache Tomcat Server.

4.Open  regg\WebContent\WEB-INF\views\front.html  file .That’s it.

<b>Objective/ Vision</b>

A online library management software built on JSP and Servlet where Admin can add/delete books and view Users and their information, and Users can register, login, issue/return books and change their password and while anyone can view Books.


<b>Users of the System</b>

Admin  Use “admin” for both Username and Password for Login

1.	Can add/view/delete books
2.	Can view Users information
3.	Can logout

User

1.	Can view books
2.	Can issue books
3.	Return Books
4.	Change Password
5.	Can logout



<b>Diagrams</b>
  
  
1.Data Flow Diagram
 


2.Activity Diagrams

•	Login Process
 
•	Registration Process :
 
•	Login Activity
 
•	Admin Login Activity
 
OUTPUT SCREENS

Welcome Page
 

Menu For Options when you hover on Menu 

When you Click on About Us in Menu About Us Page shows up
 

When you Click on Contact Us in Menu Contact Us section shows up
 

When you Click on BOOKS in Menu Books table from database shows up 
When You Click on Administrator in Menu Admin Login Page comes
 
When You Fill wrong username or Password and submit
 
When You Fill correct username & Password and submit
 

When You Click on View Users in Admin Menu
 
When You Click on Add Books in Admin Menu
 

Enter Details
Click on Submit And You Added a Book
 
When You Click on Delete Books in Admin Menu
 

Enter Book ID
Click on Submit And You Deleted a Book 
When You Click on Logout in Admin Menu You will be back in HomePage
 

When you Click on Library Member in Menu Member Login Page shows up
 

When you Click on NEW USER REGISTRATION in Login Page Registration page opens up
 
Fill the Details and Click on Submit
 
On Login Page Fill The Wrong Details Ans Hit Submit
 
When You Enter the Correct details and login
 

Enter the Book Id and click on Issue Submit 

When you enter A book ID which is Already is been Issued or any other id
 
Enter the Book Id and click on Return Submit
 

Enter Your Current Password and The new password you want to keep And hit the change Password
 





When you enter incorrect password
 </b>


