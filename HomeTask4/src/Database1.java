import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;


public class Database1 {
    public static ArrayList<Good> createConnection(String table) throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("JavaCodeArt");
        dataSource.setPassword("Java12345");
        dataSource.setServerName("62.80.189.162");
        dataSource.setDatabaseName("Shop1");


        Connection conn = dataSource.getConnection();
//        if (conn == null) {
//            System.out.println("No connection");
//        } else {
//            System.out.println("Connected");
//        }
        ArrayList<Good> goods = new ArrayList<Good>();

        if (table.equals("Notebooks")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Notebooks");

//            ResultSetMetaData rsmd = rs.getMetaData();
//            int columnsNumber = rsmd.getColumnCount();

            while (rs.next()) {
                boolean bool;
                if (rs.getString(8).equals("1")) {
                    bool = true;
                } else {
                    bool = false;
                }

                goods.add(new Notebook(rs.getString(2), Integer.parseInt(rs.getString(3)), Integer.parseInt(rs.getString(9)),
                        rs.getString(4), Integer.parseInt(rs.getString(1)), rs.getString(5), rs.getString(6), rs.getString(7),bool));

            }

            rs.close();
            stmt.close();
            conn.close();
            return goods;
        } else if (table.equals("Cellphones")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Cellphones");

//            ResultSetMetaData rsmd = rs.getMetaData();
//            int columnsNumber = rsmd.getColumnCount();
            while (rs.next()) {
                boolean bool;
                if (rs.getString(8).equals("1")) {
                    bool = true;
                } else {
                    bool = false;
                }
                goods.add(new Cellphone(rs.getString(9), Integer.parseInt(rs.getString(2)), Integer.parseInt(rs.getString(3)),
                        rs.getString(4), Integer.parseInt(rs.getString(1)), Integer.parseInt(rs.getString(5)),
                        rs.getString(6), Integer.parseInt(rs.getString(7)), bool));
            }


            rs.close();
            stmt.close();
            conn.close();
            return goods;
        } else if (table.equals("Printers")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Printers");

//            ResultSetMetaData rsmd = rs.getMetaData();
//            int columnsNumber = rsmd.getColumnCount();
            while (rs.next()) {
                goods.add(new Printer(rs.getString(2), Integer.parseInt(rs.getString(6)), Integer.parseInt(rs.getString(3)),
                        rs.getString(4), Integer.parseInt(rs.getString(1)), rs.getString(5), rs.getString(7)));
            }

            rs.close();
            stmt.close();
            conn.close();
            return goods;
        }
        return null;
    }
}