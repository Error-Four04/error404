package Presentacion;
import LogicaNegocio.*;

/**
 *
 * @author i-linux
 */
public class Main {
    
    private static ListaGenerica<Reservacion> listaReservacion = new ListaGenerica();
    
    public static void main(String[] args) {
        //Creamos los clientes.
        
        Cliente c1 = new Cliente(01,"Jose Francisco", "Av. los fresnos", "Orizaba");
        Cliente c2 = new Cliente(02, "Miguel Benitez", "Av. 7 de Mayo", "Fortin");
        Cliente c3 = new Cliente(03, "Angelica Villalba", "Oriente 4", "Orizaba");
        
        //Creamos las habitaciones.
        
        Sencilla s1 = new Sencilla(7, 900);
        Sencilla s2 = new Sencilla(23, 850);
        Doble d1 = new Doble(90, 2600);
        
        //Creamos las Reservaciones.
        
        Reservacion r1 = new Reservacion(c1, s1, "02-Nov-2021", 8);
        Reservacion r2 = new Reservacion(c2, s2, "05-Nov-2021", 4);
        Reservacion r3 = new Reservacion(c3, d1, "10-Nov-2021", 15);
        
        //Agregamos a la lista las reservaciones en modo cola.
        listaReservacion.enQueue(r1);
        listaReservacion.enQueue(r2);
        listaReservacion.enQueue(r3);
        
        for(int i=0; i<listaReservacion.size(); i++) {
            Reservacion raux = listaReservacion.get(i);
            Habitacion haux = raux.getDatos_habitacion();
            Cliente caux = raux.getDatos_cliente();
            System.out.println("\nDatos Cliente:\n"+caux.toString());
            System.out.println("\nDatos de la habitacion:\n"+haux.toString());
            System.out.println("\nDatos de la reservacion:\nFecha de hospedaje: "+raux.getFecha_hospedaje()+"\nDias Hospedaje: "+raux.getDias_hospedaje());
        }
    }
}
