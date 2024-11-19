
package Controlador;

import DataBase.ConexionBD;
import Modelo.objetoPerdido;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Cabrera
 */
public class objetoPerdidoControlador {
    
    //listar los objetos
    public List<objetoPerdido> obtenerListaObjetos(){
        List<objetoPerdido> listaObjetos = new ArrayList<>();
        ConexionBD conexionBD = new ConexionBD();
        Connection conexion = null;
        
        try{
            conexion = ConexionBD.obtenerConexion();
            String sql = "SELECT * FROM objetoPerdido";
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sql);
            
             while (resultado.next()) {
                objetoPerdido objeto = new objetoPerdido();
                objeto.setIdObjeto(resultado.getInt("idObjeto"));
                objeto.setNombreObjeto(resultado.getString("nombre_objeto"));
                objeto.setDescObjeto(resultado.getString("desc_objeto"));
                objeto.setCategoria(resultado.getString("categoria"));
                objeto.setLugarEncontrado(resultado.getString("lugar_encontrado"));
                objeto.setEstadoObjeto(resultado.getString("estado_objeto"));

                listaObjetos.add(objeto);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return listaObjetos;
        
        
    }
    
    
    
    
    
    
    //registro de objetos
    public boolean registrarObjeto(String nombre, String descripcion, String categoria, String lugarEncontrado, String estado){
        ConexionBD conexionBD = new ConexionBD();
        Connection conexion = null;
        
        try{
            conexion = conexionBD.obtenerConexion();
            String sql = "INSERT INTO objetoPerdido (nombre_objeto, desc_objeto, categoria, lugar_encontrado, estado_objeto) VALUES (?,?,?,?,?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setString(2, descripcion);
            statement.setString(3, categoria);
            statement.setString(4, lugarEncontrado);
            statement.setString(5, estado);
            
            int fila = statement.executeUpdate();
            return fila > 0;
        }catch (Exception e) {
             e.printStackTrace();
             return false;
    }
   }
  }