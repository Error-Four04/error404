package LogicaNegocio;

/**
 *
 * @author qinux
 */
public class Main {
    
    public static ListaGenerica<RegistroAlquiler> listaRegistros = new ListaGenerica<>();
    
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("Avengers", 150, 7, false, "heroes", 2018, "Joseph N. James", "Varios");
        Pelicula p2 = new Pelicula("Death", 89, 10, false, "Accion", 2000, "Varios", "Varios");
        Pelicula p3 = new Pelicula("hook", 120, 2, false, "Desconocido", 1998, "James Bond", "Varios");
        Pelicula p4 = new Pelicula("Agent 007", 90, 8, false, "Accion", 1999, "Oswald R. Paht", "Varios");
        Pelicula p5 = new Pelicula("Locura", 90, 5, false, "Terror", 2000, "Desconocido", "Varios");
        
        VideoJuego v1 = new VideoJuego("GT5", 170, 9, false, "Arcade", "Xbox");
        VideoJuego v2 = new VideoJuego("GT5", 130, 4, false, "Arcade", "PS5");
        VideoJuego v3 = new VideoJuego("Hackers", 110, 19, false, "Estrategia", "Xbox");
        
        Cliente c1 = new Cliente(1, "Jose pancho villa", "New Mexico", 99863552);
        Cliente c2 = new Cliente(2, "Gloria trevi", "Rusia", 3983232);
        
        c1.productosAlquilados.apilar(p5);
        c1.productosAlquilados.apilar(p2);
        c2.productosAlquilados.apilar(p1);
        c2.productosAlquilados.apilar(p3);
        c2.productosAlquilados.apilar(v1);
        c1.productosAlquilados.apilar(v3);
        
        RegistroAlquiler r1  = new RegistroAlquiler(c2, p5, "20/02/2005", "23/02/2005", 120);
        
        
        listaRegistros.alFinal(r1);
        
    }
}
