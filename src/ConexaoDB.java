import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.SQLException;
 import java.lang.ClassNotFoundException;
public class ConexaoDB {
    public static void main(String... x) {
       try {
          Connection connection = DriverManager.
                getConnection("jbc:mysql://localhost:3306/byte_bank?user=root&password=123456789");

           System.out.println("Recuperei a conexão");
           connection.close();
    } catch (SQLException e) {
           System.out.println(e);
       }
    }
}
