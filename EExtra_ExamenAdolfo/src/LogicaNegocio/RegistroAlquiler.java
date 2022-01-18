package LogicaNegocio;

/**
 *
 * @author qinux
 */
public class RegistroAlquiler {
    Cliente cliente;
    Productos producto;
    String fechaAlquiler;
    String fechaDevolucion;
    double importe;

    public RegistroAlquiler(Cliente cliente, Productos producto, String fechaAlquiler, String fechaDevolucion, double importe) {
        this.cliente = cliente;
        this.producto = producto;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.importe = importe;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    
}
