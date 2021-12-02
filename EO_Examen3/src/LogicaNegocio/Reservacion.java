package LogicaNegocio;

/**
 *
 * @author i-linux
 */
public class Reservacion {
    
    private Cliente datos_cliente;
    private Habitacion datos_habitacion;
    private String fecha_hospedaje;
    private int dias_hospedaje;
    
    public Reservacion(Cliente datos_cliente, Habitacion datos_habitacion, String fecha_hospedaje, int dias_hospedaje) {
        this.datos_cliente = datos_cliente;
        this.datos_habitacion = datos_habitacion;
        this.fecha_hospedaje = fecha_hospedaje;
        this.dias_hospedaje = dias_hospedaje;
    }

    public Cliente getDatos_cliente() {
        return datos_cliente;
    }

    public void setDatos_cliente(Cliente datos_cliente) {
        this.datos_cliente = datos_cliente;
    }

    public Habitacion getDatos_habitacion() {
        return datos_habitacion;
    }

    public void setDatos_habitacion(Habitacion datos_habitacion) {
        this.datos_habitacion = datos_habitacion;
    }

    public String getFecha_hospedaje() {
        return fecha_hospedaje;
    }

    public void setFecha_hospedaje(String fecha_hospedaje) {
        this.fecha_hospedaje = fecha_hospedaje;
    }

    public int getDias_hospedaje() {
        return dias_hospedaje;
    }

    public void setDias_hospedaje(int dias_hospedaje) {
        this.dias_hospedaje = dias_hospedaje;
    }
    
    
}
