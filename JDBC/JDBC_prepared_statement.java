import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class JDBC_prepared_statement {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "admin@123";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            //changing to prepare statement from statement





        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}