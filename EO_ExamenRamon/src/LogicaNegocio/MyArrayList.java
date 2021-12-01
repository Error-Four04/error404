package LogicaNegocio;

/**
 *
 * @author i-linux
 */
public class MyArrayList<E> {
    private Node<E> head;
    private Node<E> tail;
    
    /**
     * constructor sin parametros, ubica a @head y @tail en la misma ubicacion de memoria.
     */
    public MyArrayList() {
        head = tail = new Node<>();
    }
    
    /**
     * 
     * @param object 
     */
    public void enQueue(E object) {
        Node<E> addNode = new Node<>(object);
        tail.setNext(addNode);
        tail = addNode;
    }
    
    public void deQueue() {
        if(isEmpty())
            return;
        Node<E> delNode = head.getNext();
        head.setNext(delNode.getNext());
        delNode = null;
        
        if(tail == null)
            tail = head;
    }
    
    public void push(E object) {
        if(isEmpty()) {
            enQueue(object);
        } else {
            Node<E> addNode = new Node<>(object);
            addNode.setNext(head.getNext());
            head.setNext(addNode);
        }
    }
    
    public void addIndex(E element, int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException("addIndex: el indice: " + index + " esta fuera de rango");
        }

        if (index == 0) {
            push(element);
        } else if (index == size()-1) {
            enQueue(element);
        } else {
            Node<E> newNode = new Node<>(element);
            Node<E> previousNode = getNode(index - 1);
            newNode.setNext(previousNode.getNext());
            previousNode.setNext(newNode);
        }
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
            throw new IndexOutOfBoundsException("Indice :"+index+" no existe.");
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
    
    public int find(E object) {
        for(int i=0; i<size(); i++) {
            if(object.equals(get(i))) {
                return i;
            }
        }
        
        return -1;
    }
}
