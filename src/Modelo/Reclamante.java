
package Modelo;

/**
 *
 * @author Diego Cabrera
 */
public class Reclamante {
    
    private int idReclamante;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private int idObjeto;

    public Reclamante() {
    }

    public Reclamante(int idReclamante, String nombre, String apellido, String telefono, String email, int idObjeto) {
        this.idReclamante = idReclamante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.idObjeto = idObjeto;
    }

    public int getIdReclamante() {
        return idReclamante;
    }

    public void setIdReclamante(int idReclamante) {
        this.idReclamante = idReclamante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdObjeto() {
        return idObjeto;
    }

    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    @Override
    public String toString() {
        return "Reclamante{" + 
                "idReclamante=" + idReclamante + 
                ", nombre=" + nombre + 
                ", apellido=" + apellido + 
                ", telefono=" + telefono + 
                ", email=" + email + 
                ", idObjeto=" + idObjeto + '}';
    }
    
    
    
    
}
