import java.sql.*;

/**
 * Created by copperfield on 01/12/2016.
 */
public class SimpleJdbc {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Database connected");
    
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "123456");
        System.out.println("Database connected");
    
        Statement statement = connection.createStatement();
    
        ResultSet resultSet = statement.executeQuery(
                "select * from bank.product  limit 0,1000"
        );
        
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + "\t" +
                resultSet.getString(2) + resultSet.getString(3) +
                resultSet.getString(4));
        }
        
        connection.close();
    }
}
