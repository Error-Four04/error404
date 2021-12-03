package tools;

/**
 *
 * @author i-linux
 */
public class Node<T> {
    private T object;             // contenido de el nodo a crear segun la clase
    private Node<T> nextNode;   // siguiente nodo en la lista de tipo referencia a objeto
    
    public Node() {
        this(null);
    }
    
    /**
     * 
     * @param object contenido del nodo pero sin referencia al siguiente.
     */
    public Node(T object) {
        this(object, null);
    }
    
    /**
     * 
     * @param object contenido del nodo.
     * @param nextNode referencia al siguiente nodo.
     */
    public Node(T object, Node<T> nextNode) {
        this.object = object;
        this.nextNode = nextNode;
    }
    
    public void setObject(T object) {
        this.object = object;
    }
    
    public T getObject() {
        return object;
    }
    
    public void setNext(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
    
    public Node<T> getNext() {
        return nextNode;
    }
}