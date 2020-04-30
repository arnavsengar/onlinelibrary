package net.javaa.regg.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

import net.javaa.regg.model.Employee;


public class deletebookdao {

    public int deletebook(Employee employee) throws ClassNotFoundException {
    	String h=employee.getFirstName();
        String INSERT_USERS_SQL = "delete from books where Id="+h+";";
        Statement statement = null;
        int result = 0;
       
        int j=0;
        

        Class.forName("com.mysql.jdbc.Driver");

        try {Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3333/employee?useSSL=false", "root", "root");
            	statement=connection.createStatement();
            		j = statement.executeUpdate(INSERT_USERS_SQL);

        }
        
        catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }

    private static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}