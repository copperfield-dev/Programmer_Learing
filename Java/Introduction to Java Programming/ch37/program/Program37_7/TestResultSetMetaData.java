import java.sql.*;
import java.util.Stack;

/**
 * Created by copperfield on 10/12/2016.
 */
public class TestResultSetMetaData {
    public static void main(String[] args)
            throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");
    
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/bank", "root", "123456");
        System.out.println("Database connected");
    
        Statement statement = connection.createStatement();
    
        ResultSet resultSet = statement.executeQuery(
                "SELECT * FROM account"
        );
        
        /* get column name */
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
            System.out.printf("%-12s\t", resultSetMetaData.getColumnName(i));
        }
        System.out.println();
        
        while (resultSet.next()) {
            for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
                System.out.printf("%-12s\t", resultSet.getObject(i));
            }
            System.out.println();
        }
        
        connection.close();
    }
}
