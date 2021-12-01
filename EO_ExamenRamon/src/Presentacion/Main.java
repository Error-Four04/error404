package Presentacion;


//My own imports from my packages
import LogicaNegocio.MyArrayList;
import LogicaNegocio.Estudiante;
import LogicaNegocio.Materia;
import LogicaNegocio.Materias;
/**
 *
 * @author i-linux
 */
public class Main {
    
    //Creamos el nuestra ArrayList
    private static MyArrayList<Estudiante> stackStudents = new MyArrayList();
    
    public static void main(String[] args) {
        //Creamos los 3 estudiantes.
        Estudiante e1 = new Estudiante("Eliot", 24);
        Estudiante e2 = new Estudiante("John", 20);
        Estudiante e3 = new Estudiante("Ringo", 18);
        
        //agregamos a cada estudiante sus materias.
        
        //Para el estudiante Elliot.
        Materia español1 = new Materia("Español", 80);
        Materia matematicas1 = new Materia("Matematicas", 100);
        e1.addCurse(español1);
        e1.addCurse(matematicas1);
        
        //Para el estudiante John.
        Materia ciberSeguridad2 = new Materia("CiberSeguridad", 100);
        e2.addCurse(ciberSeguridad2);
        
        //Para el estudiante Ringo.
        Materia derecho3 = new Materia("Derecho",90);
        Materia civismo3 = new Materia("Civismo", 50);
        e3.addCurse(derecho3);
        e3.addCurse(civismo3);
        
        //Agregamos a la pila los estudiantes.
        stackStudents.push(e1);
        stackStudents.push(e2);
        stackStudents.push(e3);
        
        //Mostramos por pantalla todos los estudiantes.
        
        for(int i=0; i<stackStudents.size(); i++) {
            String name = stackStudents.get(i).getName();
            System.out.println("Name: " + name);
            int age = stackStudents.get(i).getAge();
            System.out.println("Age: " + age);
            //Iteramos en la lista Materias.
            Estudiante e = stackStudents.get(i);
            double promedio = 0;
            for(int j=0; j<e.listaMaterias.size(); j++) {
                Materia m = e.listaMaterias.getMateria(j);
                System.out.println("-Materia: " + m.getName() + "\n-Calificacion: " + m.getNota() + "\n-estado de la materia: " + m.mensaje() + "\n");
                promedio += m.getNota();
            }
            //obtenemos el promedio.
            promedio = promedio/e.listaMaterias.size();
            System.out.println("Promedio Final: " + promedio);
        }
    }
}
