
package Controlador;

import DataBase.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Invitado1
 */
public class eliminarDato {
    
    //borrar algun objeto
    public boolean eliminarObjeto(int idObjeto){
        String query = "DELETE FROM objetoPerdido WHERE idObjeto = ?";

        try (Connection conexion = ConexionBD.obtenerConexion();
              PreparedStatement stmt = conexion.prepareStatement(query)){

            stmt.setInt(1, idObjeto);
            return stmt.executeUpdate() > 0;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
    
    
}
