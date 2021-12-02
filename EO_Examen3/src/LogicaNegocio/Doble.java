package LogicaNegocio;

/**
 *
 * @author i-linux
 */
public class Doble extends Habitacion{
    private double precio;
    
    public Doble(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }
    
    @Override
    public double getPrecio() {
        return precio;
    }
}
