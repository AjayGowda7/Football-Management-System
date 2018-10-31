import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author user
 */
public class MyConnection {
    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            // con=DriverManager.getConnection("jdbc:mysql://localhost/your project name in MySQL","root","");
            con=DriverManager.getConnection("jdbc:mysql://localhost/java_login_register1","root","");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
