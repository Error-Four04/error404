package LogicaNegocio;

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

    @Override
    public String toString() {
        return "Doble{" + "precio=" + precio + '}';
    }
    
}
