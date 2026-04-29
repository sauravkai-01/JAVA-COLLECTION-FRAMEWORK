import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class Transaction_Handling {
    private static final String url = "jdbc:mysql://localhost:3306/lenden";
    private static final String username = "root";
    private static final String password = "admin@123";

    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        try{
            Connection cons= DriverManager.getConnection(url,username,password);

            String debit_query="UPDATE accounts SET balance=balance-? WHERE account_number=?";
            String credit_query="UPDATE accounts SET balance=balance+? WHERE account_number=?";

            PreparedStatement dpstm=cons.prepareStatement(debit_query);
            PreparedStatement cpstm=cons.prepareStatement(credit_query);

            dpstm.setDouble(1,500.50);
            dpstm.setInt(2,101);

            cpstm.setDouble(1,500.50);
            cpstm.setInt(2,102);

            int affectrow_debit=dpstm.executeUpdate();
            int affectrow_credit=cpstm.executeUpdate();

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
