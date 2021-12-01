package LogicaNegocio;

/**
 *
 * @author i-linux
 */
public class Node<T> {
    private T object;
    private Node<T> nextNode;
    
    public Node() {
        this(null);
    }
    
    public Node(T object) {
        this(object, null);
    }
    
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
