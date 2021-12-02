package LogicaNegocio;

/**
 *
 * @author i-linux
 */
public class Sencilla extends Habitacion {
    private double precio;
    
    public Sencilla(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }
    
    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Sencilla{" + "precio=" + precio + '}';
    }
    
    
}
