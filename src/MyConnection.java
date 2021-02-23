
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class MyConnection {
     private static Connection instance;

    public static Connection getInstance() {
        try {
            instance = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "1234");
            System.out.println(":::Connected:::");
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return instance;
    }
}
