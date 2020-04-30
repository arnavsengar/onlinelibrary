package net.javaa.regg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.javaa.regg.dao.addbookdao;
import net.javaa.regg.model.Employee;



@WebServlet("/registerbook")
public class addbookservlet extends HttpServlet {
    private static final long serialVersionUID = 1 ;
    private addbookdao addbookdao;

    public void init() {
        addbookdao = new addbookdao();
    }

    
/**
	 * @see HttpServletdoGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/addbook.jsp");
		dispatcher.forward(request, response);
		
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String firstName = request.getParameter("firstName"); 
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
      
       

        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setUsername(username);
        employee.setPassword(password);
        employee.setAddress(address);

        try {
             addbookdao.registerbook(employee);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/addbook.jsp");
		dispatcher.forward(request, response);
		
    }
}

