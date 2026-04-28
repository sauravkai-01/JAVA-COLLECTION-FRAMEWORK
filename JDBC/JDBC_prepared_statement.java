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

                            //Inserting Data
            String query="INSERT INTO students(name,age,marks) values(?,?,?)";
            PreparedStatement psmt= conn.prepareStatement(query);
            psmt.setString(1,"saurav");
            psmt.setInt(2,22);
            psmt.setDouble(3,78.5);

            int rowaffect = psmt.executeUpdate();
            if(rowaffect>0){
                System.out.println("Inserted successfully");
            }
            else{
                System.out.println("Not Inserted successfully");
            }

                        //Retrieve Data

            String query1="SELECT marks FROM students WHERE id=?";
            PreparedStatement pstm1= conn.prepareStatement(query1);
            pstm1.setInt(1,164);

            ResultSet rst=pstm1.executeQuery();

            if(rst.next()){
                double marks = rst.getDouble("marks");
                System.out.println("marks : "+marks);
            }else {
                System.out.println("Not found !!");
            }

                        //Updating
            String query2="UPDATE students SET marks=? WHERE id = ?";
            PreparedStatement pstm2= conn.prepareStatement(query2);
            pstm2.setDouble(1,99.99);
            pstm2.setInt(2,163);
            int rowaffect1= pstm2.executeUpdate();
            if(rowaffect1>0){
                System.out.println("updated successfully");
            }else{
                System.out.println("not updated yet !!");
            }

                        //Deletion
            String query3="DELETE FROM students WHERE id=?";
            PreparedStatement pstm3= conn.prepareStatement(query3);
            pstm3.setInt(1,167);
            int rowaffect2=pstm3.executeUpdate();
            if(rowaffect2>0)
            {
                System.out.println("Deleted successfully");
            }else{
                System.out.println("Not deleted !!");
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}