package DataBase;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Diego Cabrera
 */
public class ConexionBD {
    
    public static Connection obtenerConexion(){
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/objetos_perdidos","root","root");
            System.out.println("Conexion exitosa!!");
            
        } catch (Exception e){
            System.out.println("Error de conexion!!");
        }
        return conexion;
    }
}
