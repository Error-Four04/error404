package LogicaNegocio;

/**
 *
 * @author i-linux
 */
public class Materia {
    private String name;
    private double nota;
    
    public Materia(String name, double nota) {
        this.name = name;
        this.nota = nota;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public double getNota() {
        return nota;
    }
}
