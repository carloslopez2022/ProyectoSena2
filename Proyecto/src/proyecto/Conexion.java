
package proyecto;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;


/**
 *
 * @author Club Correcaminos
 */
public class Conexion {
    Connection con;
    public Conexion (){
        try{ 
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","");
            JOptionPane.showMessageDialog(null,"Conexion exitosa","Conexion",JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Sin Conexion" +e,"Conexion",JOptionPane.ERROR_MESSAGE);
            
        }
        
    }

    public Connection getConnection() {
        
        return con;
//To change body of generated methods, choose Tools | Templates.
    }

    void con() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
