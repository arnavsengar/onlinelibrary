package net.javaa.regg.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import net.javaa.regg.model.Employee;


public class logindao {

    public int loginuser(Employee employee) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "select username,password from employee.libusers ";
        String U="";String P="";String user=employee.getUsername();String pass=employee.getPassword();
        String aU="admin";String aP="admin";
        
        
        Statement statement = null;
        int result = 0;int o=0;
        ResultSet resultSet = null;
        Class.forName("com.mysql.jdbc.Driver");

        try {
        	Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3333/employee?useSSL=false", "root", "root");
        	statement=connection.createStatement();
        		resultSet = statement.executeQuery(INSERT_USERS_SQL);
        		while(resultSet.next()){
        			U=resultSet.getString("username");
        			P=resultSet.getString("password");
        			if(U.equals(user)) {
        				if(P.equals(pass))
        					o=1;
        				}
        			}
        			
            
        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
     
		return o;
		}
    
    
    public int adminlogin(Employee employee) throws ClassNotFoundException {
       String user=employee.getUsername();String pass=employee.getPassword();
        String aU="admin";String aP="admin";int o=0;
        
        if(aU.equals(user)) {
			if(aP.equals(pass))
				o=2;
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