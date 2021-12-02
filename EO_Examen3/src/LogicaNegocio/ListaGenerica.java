package LogicaNegocio;

public class ListaGenerica<E> {
    private Node<E> head;
    private Node<E> tail;
    
    /**
     * constructor sin parametros, ubica a @head y @tail en la misma ubicacion de memoria.
     */
    public ListaGenerica() {
        head = tail = new Node<>();
    }
    
    /**
     * 
     * @param object 
     */
    public void cola(E object) {
        Node<E> addNode = new Node<>(object);
        tail.setNext(addNode);
        tail = addNode;
    }
   
    
    public int size() {
        Node<E> auxNode = head.getNext();
        int size = 0;
        while(auxNode != null) {
            size++;
            auxNode = auxNode.getNext();
        }
        return size;
    }
    
    public E get(int index) {
        E object = getNode(index).getObject();
        return object;
    }
    
    public Node<E> getNode(int index) {
        int size = size();
        if(index >= size || index < 0) {
            return null;
        }
        
        Node<E> returnNode = head.getNext();
        for(int i=0; i<index; i++) {
            returnNode = returnNode.getNext();
        }
        
        return returnNode;
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }
}
