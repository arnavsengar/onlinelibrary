package net.javaa.regg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.javaa.regg.dao.logindao;
import net.javaa.regg.model.Employee;
@WebServlet("/adminlogin")
public class adminlogin extends HttpServlet {
	int u=0;
    private static final long serialVersionUID = 1 ;
    private logindao logindao;

    public void init() {
        logindao = new logindao();
    }

    
/**
	 * @see HttpServletdoGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/admin.jsp");
		dispatcher.forward(request, response);
		
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

       
        String username = request.getParameter("username");
        String password = request.getParameter("password");
     

        Employee employee = new Employee();
        employee.setUsername(username);
        employee.setPassword(password);
        

        try {
      u=logindao.adminlogin(employee);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

if(u==2) {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/adminfront.html");
		dispatcher.forward(request, response);
}
else
{
	RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/wrongdetails.jsp");
	dispatcher.forward(request, response);
}
}
    }


