package LogicaNegocio;

/**
 *
 * @author qinux
 */
public class VideoJuego extends Productos{
    
    String estilo;
    String plataforma;
    
    public VideoJuego(String titulo, double precioAlquiler, int plazoAlquilar, boolean alquilado, String estilo, String plataforma) {
        super(titulo, precioAlquiler, plazoAlquilar, alquilado);
        this.estilo = estilo;
        this.plataforma = plataforma;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    
}
