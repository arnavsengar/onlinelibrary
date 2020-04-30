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

1.Create MySQL Database on port 3333 name employee with password and username both root. 

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
 
![](images2/dataflow.png)

2.Activity Diagrams

•	Login Process:
 
 ![](images2/loginproccess.png)
 
•	Registration Process:
 
 ![](images2/regproccess.png)
 
•	Login Activity:
 
 ![](images2/loginactivity.png)
 
•	Admin Login Activity:

![](images2/loginactivityadmin.png)
 
OUTPUT SCREENS

Welcome Page
 
 ![](images2/Front.png)

Menu For Options when you hover on Menu 

![](images2/Menu.png)

When you Click on About Us in Menu About Us Page shows up
 
 ![](images2/AboutUs.png)

When you Click on Contact Us in Menu Contact Us section shows up
 
 ![](images2/ContactUs.png)

When you Click on BOOKS in Menu Books table from database shows up 

![](images2/BooksShow.png)

When You Click on Administrator in Menu Admin Login Page comes

![](images2/AdminLogin.png)
 
When You Fill wrong username or Password and submit
 
 ![](images2/WrongDetailsAdmin.png)
 
When You Fill correct username & Password and submit
 
![](images2/Adminfrontwithmenu.png)

When You Click on View Users in Admin Menu

![](images2/ViewUsers.png)
 
When You Click on Add Books in Admin Menu
 
![](images2/AddBook.png)

Enter Details
Click on Submit And You Added a Book
 
 ![](images2/AddedBook.png)
 
When You Click on Delete Books in Admin Menu
 
![](images2/RemoveBook.png)

Enter Book ID
Click on Submit And You Deleted a Book 

![](images2/RemoveddBook.png)

When You Click on Logout in Admin Menu You will be back in HomePage
 
![](images2/Menu.png)

When you Click on Library Member in Menu Member Login Page shows up
 
 ![](images2/librarymemberlogin.png)

When you Click on NEW USER REGISTRATION in Login Page Registration page opens up

![](images2/NewRegistration.png)
 
Fill the Details and Click on Submit

![](images2/Successful.png)
 
On Login Page Fill The Wrong Details Ans Hit Submit

![](images2/WrongDetailsAdmin.png)
 
When You Enter the Correct details and login
 
 ![](images2/logged.png)

Enter the Book Id and click on Issue Submit 

![](images2/issuedabookalert.png)

When you enter A book ID which is Already is been Issued or any other id
 
 ![](images2/WrongDetailsAdmin.png)
 
Enter the Book Id and click on Return Submit
 
![](images2/returnabookalert.png)

Enter Your Current Password and The new password you want to keep And hit the change Password
 
![](images2/changepassword.png)

When you enter incorrect password

![](images2/WrongDetailsAdmin.png)

 </b>
