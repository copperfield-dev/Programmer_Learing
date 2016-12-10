import java.sql.*;

/**
 * Created by copperfield on 10/12/2016.
 */
public class FindUserTables {
    public static void main(String[] args)
            throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");
    
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/bank", "root", "123456");
        System.out.println("Database connected");
    
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        ResultSet resultSet = databaseMetaData.getTables(null, null, null,
                new String[] {"TABLE"});
        System.out.println("User tables: ");
        while (resultSet.next()) {
            System.out.print(resultSet.getString("TABLE_NAME") + " ");
        }
        
        connection.close();
    }
}
