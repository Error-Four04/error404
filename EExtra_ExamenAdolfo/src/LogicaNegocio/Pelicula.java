package LogicaNegocio;

/**
 *
 * @author qinux
 */
public class Pelicula extends Productos{
    
    String genero;
    int año;
    String director;
    String interpretes;
    
    public Pelicula(String titulo, double precioAlquiler, int plazoAlquilar, boolean alquilado, String genero, int año, String director, String interpretes) {
        super(titulo, precioAlquiler, plazoAlquilar, alquilado);
        this.genero = genero;
        this.año = año;
        this.director = director;
        this.interpretes = interpretes;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getInterpretes() {
        return interpretes;
    }

    public void setInterpretes(String interpretes) {
        this.interpretes = interpretes;
    }
    
    
}
