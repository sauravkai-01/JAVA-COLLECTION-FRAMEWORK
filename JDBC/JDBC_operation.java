import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class JDBC_operation {
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

                            //Insertion

            String query = String.format("INSERT INTO students(name, age, marks) values('%s',%o,%f)","Rahul",18,95.8);
            int rowsaffected = stm.executeUpdate(query);
            if(rowsaffected>0){
                System.out.println("data inserted successfully");
            }else {
                System.err.println("failed not inserted");
            }


                            //update
            String query1 = String.format("UPDATE students SET marks=%f WHERE id=%d",99.5,164);
            int rowsaffected1 = stm.executeUpdate(query1);
            if(rowsaffected1>0){
                System.out.println("data updated successfully");
            }else {
                System.err.println("failed to update");
            }

                            //Deleted
            String query2="DELETE FROM students WHERE id = 166";
            int rowsaffected2 = stm.executeUpdate(query2);
            if(rowsaffected1>0){
                System.out.println("data deleted successfully");
            }else {
                System.err.println("failed to deleted");
            }


        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}