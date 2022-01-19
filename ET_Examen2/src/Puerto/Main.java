package Puerto;

/**
 *
 * @author qinux
 */
public class Main {
    
    
    private static ListaGenerica<Alquiler> RegistroAlquiler = new ListaGenerica<>();
    
    public static void main(String[] args) {
        
        // Creamos los barcos.
        Barco b1 = new Barco("A456T", 12, 1999);
        Barco b3 = new DeportivosAMotor("G98O4", 6, 2010, 0, 25);
        Barco b4 = new YatesDeLujo("HY87Y", 15, 2020, 03, 45, 3);
        
        // Creamos los alquileres.
        Alquiler a1 = new Alquiler("Ruben Jimenez", "RUJU7352H", "25-mar-2020", "28-mar-2020", 4, "Estribor", b1);
        Alquiler a2 = new Alquiler("Elliot Smith", "ELS982T", "19-jul-2020", "25-jul-2020", 7, "Babor", b4);
        Alquiler a3 = new Alquiler("Sam Sepiol", "SAS4383U", "09-ene-2020", "11-ene-2020", 3, "Babor", b3);
        
        //Agregamos a la lista los registros de alquileres.
        RegistroAlquiler.alFinal(a1);
        RegistroAlquiler.alFinal(a2);
        RegistroAlquiler.alFinal(a3);
        
        // Recorremos la lista para calcular el alquiler.
        for(int i=0; i<RegistroAlquiler.size(); i++) {
            Alquiler a = RegistroAlquiler.get(i);
            int alquiler;
            Barco b = a.getBarco();
            System.out.println("\nNombre: "+a.getNombreCliente()+"\nINE: "+a.getINE()+"\nFecha Inicio: "+a.getFechaInicio()+"\nFecha Fin: "+a.getFechaFin()+"\nColocacion de Amarre: "+a.getPosicionAmarre());
            System.out.println("\nBarco:\n\tMatricula: "+a.getBarco().getMatricula()+"\n\tEslora: "+a.getBarco().getEslora()+"\n\tAño: "+a.getBarco().getAñoFabricacion());
            if(b instanceof DeportivosAMotor) {
                DeportivosAMotor e = (DeportivosAMotor) a.getBarco();
                System.out.println("\tMastiles para Veleros: "+e.getMastilesVeleros()+"\n\tPotencia en CV: "+e.getPotencia());
                alquiler = a.getDiasAlquiler() * e.moduloFuncion() * 2;
            }else if(b instanceof YatesDeLujo) {
                YatesDeLujo y = (YatesDeLujo) a.getBarco();
                System.out.println("\tMastiles para Veleros: "+y.getMastilesVeleros()+"\n\tPotencia en CV: "+y.getPotencia()+"\n\tCamarotes: "+y.getCamarotes());
                alquiler = a.getDiasAlquiler() * y.moduloFuncion() * 2;
            }else {
                alquiler = a.getDiasAlquiler() * a.getBarco().moduloFuncion() *2;
            }
            System.out.println("Alquiler: $"+alquiler+"\n");
        }
    }
}
