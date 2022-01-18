package LogicaNegocio;

/**
 *
 * @author qinux
 */
public class Cliente {
    int numeroClient;
    String nombre;
    String direccion;
    int telefono;
    ProductosAlquilados<Productos> productosAlquilados = new ProductosAlquilados<>();

    public Cliente(int numeroClient, String nombre, String direccion, int telefono) {
        this.numeroClient = numeroClient;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getNumeroClient() {
        return numeroClient;
    }

    public void setNumeroClient(int numeroClient) {
        this.numeroClient = numeroClient;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
