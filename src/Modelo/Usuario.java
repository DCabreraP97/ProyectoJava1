
package Modelo;

/**
 *
 * @author Diego Cabrera
 */
public class Usuario {
    
    private int idUsuario;
    private String nombreUsuario;
    private String usuario;
    private String contrasena;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String usuario, String contrasena) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + 
                                ", nombreUsuario=" + nombreUsuario + 
                                ", usuario=" + usuario + 
                                ", contrasena=" + contrasena + '}';
    }
    
    
    
}
