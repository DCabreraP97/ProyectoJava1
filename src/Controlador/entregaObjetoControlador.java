
package Controlador;

import DataBase.ConexionBD;
import Modelo.Reclamante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Cabrera
 */
public class entregaObjetoControlador {
    
    //registrar entrega
        public boolean registrarEntrega (int idObjeto, Reclamante reclamante){
            ConexionBD conexionBD = new ConexionBD();
            Connection conexion = null;
            boolean exito = false;

            try{
                conexion = ConexionBD.obtenerConexion();

                String sqlReclamante = "INSERT INTO reclamante (nombre, apellido, telefono, email, idObjeto) Values(?,?,?,?,?)";
                PreparedStatement statementReclamante = conexion.prepareStatement(sqlReclamante);
                statementReclamante.setString(1, reclamante.getNombre());
                statementReclamante.setString(2, reclamante.getApellido());
                statementReclamante.setString(3, reclamante.getTelefono());
                statementReclamante.setString(4, reclamante.getEmail());
                statementReclamante.setInt(5, idObjeto);

                int filaInsertada = statementReclamante.executeUpdate();

                if (filaInsertada > 0 ){
                    String sqlActualizarObjeto = "UPDATE objetoPerdido SET estado_objeto = 'devuelto' WHERE idObjeto = ?";
                    PreparedStatement statementActualizarObjeto = conexion.prepareStatement(sqlActualizarObjeto);
                    statementActualizarObjeto.setInt(1,idObjeto);

                    int filaActualizada = statementActualizarObjeto.executeUpdate();

                    if (filaActualizada > 0){
                        exito = true;
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
           return exito;
        }
    }



    

        



