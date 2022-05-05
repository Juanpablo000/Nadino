package codigo;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion {
   public static Connection getConnection(){
        String url = "jdbc:sqlserver://localhost:1433;"
                + "database=NadinoDB;"
                + "user=juan;"
                + "password=l33tsupah4x0r;"
                + "encrypt=true;"
                + "trustServerCertificate=true;";
                try{
                    Connection con = DriverManager.getConnection(url);
                    return con;
          
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Error: " + ex.toString());
                    return null;
                }
        }
}