import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class JDBC {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "admin@123";

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            Connection conn = DriverManager.getConnection(url,username,password);
            Statement stm = conn.createStatement();
            String query = "select * from students";

            ResultSet rs = stm.executeQuery(query);

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                double marks = rs.getDouble("marks");

                System.out.println("id : "+id+"\n"+"name : "+name+"\n"+"age : "+age+"\n"+"marks : "+marks+"\n");
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}