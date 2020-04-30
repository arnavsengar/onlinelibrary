package net.javaa.regg.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import net.javaa.regg.model.Employee;


public class issuedao {

    public int issuebook(Employee employee) throws ClassNotFoundException {
    	String h=employee.getFirstName();
        String INSERT_USERS_SQL = "update books set Issued='Yes' where Id="+h;
        String INSERT_USERS_SQLL = "select Issued from books where Id="+h;
String I="";String i="Yes";
        Statement statement = null;
        int result = 0;int o=0;
        ResultSet resultSet = null;
        int j=0;
        Class.forName("com.mysql.jdbc.Driver");

        try {
        	Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3333/employee?useSSL=false", "root", "root");
        	statement=connection.createStatement();
        	resultSet = statement.executeQuery(INSERT_USERS_SQLL);
    		while(resultSet.next()){
    				I=resultSet.getString("Issued");
    				
    					if(I.equals(i)) {
    						o=1;
    					}
    					else {
    						j = statement.executeUpdate(INSERT_USERS_SQL);
    					}
    				}
        		
     
        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
     
		return o;
		}
    
    public int returnbook(Employee employee) throws ClassNotFoundException {
    	String h=employee.getFirstName();
        String INSERT_USERS_SQL = "update books set Issued='No' where Id="+h;
        String INSERT_USERS_SQLL = "select Issued from books where Id="+h;
       
        Statement statement = null;
        int result = 0;int o=0;
        ResultSet resultSet = null;
        int j=0; String I="";String i="No";
        Class.forName("com.mysql.jdbc.Driver");

        try {
        	Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3333/employee?useSSL=false", "root", "root");
        	statement=connection.createStatement();
        	resultSet = statement.executeQuery(INSERT_USERS_SQLL);
    		while(resultSet.next()){
    				I=resultSet.getString("Issued");
    				
    					if(I.equals(i)) {
    						o=1;
    					}
    					else {
    						j = statement.executeUpdate(INSERT_USERS_SQL);
    					}
    				}
        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
     
		return o;
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