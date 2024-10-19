
package proyectop2;

/**
 *
 * @author Beykel
 */
public abstract class Usuario {
    protected String nombre;
    private String email;
    private String contrasena;

    public Usuario(String nombre, String email, String contrasena) {
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    
    public void login() {
        System.out.println(nombre + " ha iniciado sesión.");
    }

    public void logout() {
        System.out.println(nombre + " ha cerrado sesión.");
    }
    
    public abstract void mostrarRol();
}
