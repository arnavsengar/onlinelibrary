package net.javaa.regg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.javaa.regg.dao.deletebookdao;
import net.javaa.regg.model.Employee;



@WebServlet("/deletebooks")
public class deletebookservlet extends HttpServlet {
    private static final long serialVersionUID = 1 ;
    private deletebookdao deletebookdao;

    public void init() {
        deletebookdao = new deletebookdao();
    }

    
/**
	 * @see HttpServletdoGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/delbooks.jsp");
		dispatcher.forward(request, response);
		
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String firstName = request.getParameter("firstName"); 

      
       

        Employee employee = new Employee();
        employee.setFirstName(firstName);
     
        try {
             deletebookdao.deletebook(employee);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/delbooks.jsp");
		dispatcher.forward(request, response);
		
    }
}

