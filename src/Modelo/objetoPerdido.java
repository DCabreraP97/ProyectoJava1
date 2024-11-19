
package Modelo;

import java.util.Date;

/**
 *
 * @author Diego Cabrera
 */
public class objetoPerdido {
    
    private int idObjeto;
    private String nombreObjeto;
    private String descObjeto;
    private String categoria;
    private String lugarEncontrado;
    private Date fechaRegistro;
    private String estadoObjeto;
    private int idUsuario;

    public objetoPerdido() {
    }

    public objetoPerdido(int idObjeto, String nombreObjeto, String descObjeto, Date fechaRegistro, String estadoObjeto, int idUsuario) {
        this.idObjeto = idObjeto;
        this.nombreObjeto = nombreObjeto;
        this.descObjeto = descObjeto;
        this.categoria = categoria;
        this.lugarEncontrado = lugarEncontrado;
        this.fechaRegistro = fechaRegistro;
        this.estadoObjeto = estadoObjeto;
        this.idUsuario = idUsuario;
    }

    public int getIdObjeto() {
        return idObjeto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLugarEncontrado() {
        return lugarEncontrado;
    }

    public void setLugarEncontrado(String lugarEncontrado) {
        this.lugarEncontrado = lugarEncontrado;
    }

    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public String getDescObjeto() {
        return descObjeto;
    }

    public void setDescObjeto(String descObjeto) {
        this.descObjeto = descObjeto;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstadoObjeto() {
        return estadoObjeto;
    }

    public void setEstadoObjeto(String estadoObjeto) {
        this.estadoObjeto = estadoObjeto;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "objetoPerdido{" + 
                   "idObjeto=" + idObjeto +
                ", nombreObjeto=" + nombreObjeto +
                ", descObjeto=" + descObjeto + 
                ", categoria=" + categoria +
                ", lugarEncontrado=" + lugarEncontrado +
                ", fechaRegistro=" + fechaRegistro +
                ", estadoObjeto=" + estadoObjeto + 
                ", idUsuario=" + idUsuario + '}';
    }
    
    
    
}
