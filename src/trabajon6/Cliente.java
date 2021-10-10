
package trabajon6;


public class Cliente {
    
    private int dni;
     
    private String nombre,apellido,ciudad,direccion;

    public Cliente() {
    }

    public Cliente(int dni, String direccion, String nombre, String apellido, String ciudad) {
        this.dni = dni;
        this.direccion = direccion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", direccion=" + direccion + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad + '}';
    }

    public long getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
   