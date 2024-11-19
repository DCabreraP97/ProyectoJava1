
package Controlador;
import DataBase.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Invitado1
 */
public class LoginControlador {
    
    public boolean validarCredenciales(String usuario, String contrasena){
        ConexionBD conexionBD = new ConexionBD();
        Connection conexion = null;
        
        try{
            conexion = conexionBD.obtenerConexion();
            String sql = "SELECT * FROM usuarios WHERE usuario = ? AND contrasena = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, usuario);
            statement.setString(2, contrasena);
            
            ResultSet resultado = statement.executeQuery();
            
            return resultado.next();
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
        
        
        
    }
    
}
