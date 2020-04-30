package net.javaa.regg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.javaa.regg.dao.issuedao;
import net.javaa.regg.model.Employee;



@WebServlet("/returns")
public class returnservlet extends HttpServlet {
    private static final long serialVersionUID = 1 ;
    private issuedao issuedao;
    int u=0;

    public void init() {
        issuedao = new issuedao();
    }

    
/**
	 * @see HttpServletdoGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/logged.jsp");
		dispatcher.forward(request, response);
		
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String firstName = request.getParameter("bid"); 
       

        Employee employee = new Employee();
        employee.setFirstName(firstName);


        try {
           u=issuedao.returnbook(employee);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
if(u==1) {
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/wrongdetails.jsp");
	dispatcher.forward(request, response);
}
else {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/logged.jsp");
		dispatcher.forward(request, response);
}
    }
}

