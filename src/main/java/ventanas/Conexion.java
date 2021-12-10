
package ventanas;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
     Connection cn = null;
	
	public static Connection conector() {
		try {
			Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://db4free.net:3306/usuarios13","darlinski", "01091114");
			return cn;
                        
		} catch (SQLException e) {
			System.out.print(e);
                        return null;
		}
                
    }
    public static void main(String args[]){
         Connection cn = conector();
         System.out.print(cn);
    }
}
