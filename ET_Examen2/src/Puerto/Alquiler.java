package Puerto;

/**
 *
 * @author qinux
 */
public class Alquiler {
    
    String nombreCliente;
    String INE;
    String fechaInicio;
    String fechaFin;
    int diasAlquiler;
    String posicionAmarre;
    Barco barco;
    
    
    public Alquiler(String nombreCliente, String INE, String fechaInicio, String fechaFin, int diasAlquiler, String posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.INE = INE;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.diasAlquiler = diasAlquiler;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getINE() {
        return INE;
    }

    public void setINE(String INE) {
        this.INE = INE;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public int getDiasAlquiler() {
        return diasAlquiler;
    }
    
    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }
    
    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
}
