import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class MyConnection {
    public static java.sql.Connection getConnection() throws SQLException {
        String userName = "root";
        String password = "java";
        String dbms = "mysql";
        String serverName = "localhost/java";
        String portNumber = "3306";

        java.sql.Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", userName);
        connectionProps.put("password", password);


        conn = DriverManager.getConnection(
                "jdbc:" + dbms + "://" +
                        serverName,
                connectionProps
        );
        return conn;
    }
}

