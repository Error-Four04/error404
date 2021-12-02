package LogicaNegocio;

public class Cliente {
    private int clave;
    private String nombre;
    private String direccion;
    private String ciudad;
    
    public Cliente(int clave, String nombre, String direccion, String ciudad) {
        this.clave = clave;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "clave=" + clave + ", nombre=" + nombre + ", direccion=" + direccion + ", ciudad=" + ciudad + '}';
    }
    
    
    
}
