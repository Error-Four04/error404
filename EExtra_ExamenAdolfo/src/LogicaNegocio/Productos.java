package LogicaNegocio;

/**
 *
 * @author qinux
 */
public abstract class Productos {
    
    protected String titulo;
    protected double precioAlquiler;
    protected int plazoAlquilar;
    protected boolean alquilado;
    
    public Productos(String titulo, double precioAlquiler, int plazoAlquilar, boolean alquilado) {
        this.titulo = titulo;
        this.precioAlquiler = precioAlquiler;
        this.plazoAlquilar = plazoAlquilar;
        this.alquilado = alquilado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public int getPlazoAlquilar() {
        return plazoAlquilar;
    }

    public void setPlazoAlquilar(int plazoAlquilar) {
        this.plazoAlquilar = plazoAlquilar;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
    
    
}
