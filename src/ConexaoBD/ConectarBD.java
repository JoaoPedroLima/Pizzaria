
package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarBD {
         public static void main( String args[] ) throws ClassNotFoundException, SQLException {
      Connection conexaoBanco = null;  
     
       Class.forName("com.mysql.jdbc.Driver");
       conexaoBanco = DriverManager.getConnection("jdbc:mysql://localhost", "root","123");
      System.out.println("Acessou o banco!!!");
  
}
}