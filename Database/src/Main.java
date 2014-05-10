import com.mysql.jdbc.*;

import javax.sql.rowset.serial.SerialArray;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Main {


    public static void main(String[] args) throws SQLException {

        Connection u = Main.getConnection();
        User i = new User("artututututututr", "menchenko", 22, 1200);
        ArrayList<User> arr = new ArrayList<>();
        arr.add(i);
        saveUsers(arr, u);


    }


    public static Connection getConnection() throws SQLException {
        String userName = "root";
        String password = "java";
        String dbms = "mysql";
        String serverName = "localhost/java";
        String portNumber = "3306";

        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", userName);
        connectionProps.put("password", password);


        conn = DriverManager.getConnection(
                "jdbc:" + dbms + "://" +
                        serverName,
                connectionProps
        );

//        System.out.println("Connected to database");
        return conn;
    }

    public static ArrayList<User> getUsers(Connection u) throws SQLException {
        ArrayList<String> arr = new ArrayList();
        if (u == null) {
            System.out.println("ouch");
        } else {
            System.out.println("connected");
            Statement statement = u.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users ");
            while (resultSet.next()) {
                String user = resultSet.getString(1) + ":" +
                        resultSet.getString(2) + ":" +
                        resultSet.getString(3) + ":" +
                        resultSet.getString(4);
                System.out.println(resultSet.getString(1) + " " +
                                resultSet.getString(2) + " " +
                                resultSet.getString(3) + " " +
                                resultSet.getString(4)
                );

                arr.add(user);
            }

            System.out.println(arr.size());
            u.close();
        }
        ArrayList<User> users = new ArrayList<>();
        for (String s : arr) {
            String[] strs = s.split(":");
            User u11 = new User(strs[0], strs[1], Integer.parseInt(strs[2]), Integer.parseInt(strs[3]));
            users.add(u11);
        }
        System.out.println(users.size());
        return users;
    }

    public static void saveUsers(List<User> user, Connection u) throws SQLException {
//        for (User us : user) {
//            String userText = "'" + us.getName() + "'" + "," + "'" + us.getLname() + "'"
//                    + "," + us.getAge() + "," + us.getSalary();
//            if (u == null) {
//                System.out.println("ouch");
//            } else {
//                System.out.println("connected");
//                Statement statement = u.createStatement();
//
//                String sql = "INSERT INTO users values (" + userText + ")";
//                System.out.println(sql);
//                statement.execute(sql);
//            statement.executeQuery(sql);
                PreparedStatement st = null;
                String insertUser =
                        "INSERT INTO users values " +
                                "(?,?,?,?)";


                u.setAutoCommit(false);
                st = u.prepareStatement(insertUser);

                for (User e : user) {
                    st.setString(1, e.getName());
                    st.setString(2, e.getLname());
                    st.setInt(3, e.getAge());
                    st.setInt(4, e.getSalary());
                    st.executeUpdate();

                    u.commit();


                }

            }



    }

    class User {
        private String name;
        private String lname;
        private int age;
        private int salary;

        User(String name, String lname, int age, int salary) {
            this.name = name;
            this.lname = lname;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLname() {
            return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
    }