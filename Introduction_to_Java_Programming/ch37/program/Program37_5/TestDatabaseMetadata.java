import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by copperfield on 10/12/2016.
 */
public class TestDatabaseMetadata {
    
    public static void main(String[] args)
            throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");
    
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/bank", "root", "123456");
        System.out.println("Database connected");
    
        DatabaseMetaData databaseMetaData = connection.getMetaData();
        System.out.println("database URL: " + databaseMetaData.getURL());
        System.out.println("database username: " + databaseMetaData.getUserName());
        System.out.println("database product name: " + databaseMetaData.getDatabaseProductName());
        System.out.println("database JDBC driver name: " + databaseMetaData.getDriverName());
        System.out.println("database JDBC version: " + databaseMetaData.getDriverVersion());
        System.out.println("database JDBC major version: " + databaseMetaData.getDatabaseMajorVersion());
        System.out.println("database JDBC minor version: " + databaseMetaData.getDatabaseMinorVersion());
        System.out.println("database max number of connections: " + databaseMetaData.getMaxConnections());
        System.out.println("datavase max table name length is: " + databaseMetaData.getMaxTableNameLength());
        System.out.println("database max columns in table is: " + databaseMetaData.getMaxColumnsInTable());
        
        connection.close();
    }
}
