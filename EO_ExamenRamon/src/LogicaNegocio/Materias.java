package LogicaNegocio;

/**
 *
 * @author i-linux
 */
// Clase lista para las materias
public class Materias {
    private Node<Materia> head;
    private Node<Materia> tail;
    
    public Materias() {
        head = tail = new Node();
    }
    
    public void add(Materia m) {
        Node<Materia> materia = new Node(m);
        tail.setNext(materia);
        tail = materia;
    }
    
    public Materia getMateria(int index) {
        Materia materia = getNode(index).getObject();
        return materia;
    }
    
    public Node<Materia> getNode(int index) {
        int size = size();
        if(index >= size || index < 0) {
            return null;
        }
        
        Node<Materia> returnNode = head.getNext();
        for(int i=0; i<index; i++) {
            returnNode = returnNode.getNext();
        }
        
        return returnNode;
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }
    
    public int size() {
        Node<Materia> auxNode = head.getNext();
        int size = 0;
        while(auxNode != null) {
            size++;
            auxNode = auxNode.getNext();
        }
        
        return size;
    }
}
