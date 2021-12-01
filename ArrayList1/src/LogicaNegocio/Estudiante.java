package LogicaNegocio;

public class Estudiante {
    
    private String name;
    private int age;
    public Materias listaMaterias = new Materias();
    
    public Estudiante(String name, int age) {
        this.age = age;
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    //Metodos extra para operaciones de alumno
    
    public double promedio() {
        double promedio = 0;
        if(listaMaterias.isEmpty())
            return promedio;
        for(int i=0; i<listaMaterias.size(); i++) {
            promedio += listaMaterias.getMateria(i).getNota();
        }
        return promedio;
    }
    
    //Agregar materia al estudiante
    public void addCurse(Materia curse) {
        listaMaterias.add(curse);
    }
}
