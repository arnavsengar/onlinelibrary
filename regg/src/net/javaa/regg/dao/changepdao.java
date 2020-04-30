package net.javaa.regg.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import net.javaa.regg.model.Employee;


public class changepdao {
	

    public int changepass(Employee employee) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "select * from employee.libusers ";
        String O="";String P="";String oldpass=employee.getUsername();String newpass=employee.getPassword();
      
        
        
        Statement statement = null;
        int result = 0;int o=0;int t=0;
        ResultSet resultSet = null;
        ResultSet resultSett = null;
        
        Class.forName("com.mysql.jdbc.Driver");

        try {
        	Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3333/employee?useSSL=false", "root", "root");
        	statement=connection.createStatement();
        		resultSet = statement.executeQuery(INSERT_USERS_SQL);
        		while(resultSet.next()){
        			
        			P=resultSet.getString("password");
        			 
        				if(P.equals(oldpass)) {
        					String INSERT_USERS_SQLL = "update libusers set password='"+newpass+"' where password='"+oldpass+"';";
        					t = statement.executeUpdate(INSERT_USERS_SQLL);
        					o=1;
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