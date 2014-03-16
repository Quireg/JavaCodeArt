import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;


public class Database1 {
    public static void createConnection(String query) throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("JavaCodeArt");
        dataSource.setPassword("Java12345");
        dataSource.setServerName("62.80.189.162");
        dataSource.setDatabaseName("Shop1");


        Connection conn = dataSource.getConnection();
        if (conn == null) {
            System.out.println("No connection");
        } else {
            System.out.println("Connected");
        }
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= columnsNumber; i++) {
                String str = rs.getString(i);
                System.out.print(str + " ");

            }
            System.out.println();
        }

        rs.close();
        stmt.close();
        conn.close();
    }
}