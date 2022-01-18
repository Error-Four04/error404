package LogicaNegocio;

/**
 *
 * @author qinux
 */
public class ListaGenerica<E> {
    
    private Nodo<E> cabeza;
    private Nodo<E> cola;
    
    public ListaGenerica() {
        cabeza = cola = new Nodo();
    }
    
    public void alFinal(E objecto) {
        Nodo<E> nodo = new Nodo<>(objecto);
        cola.setSiguienteNodo(nodo);
        cola = nodo;
    }
    
    public void quitarPrimero() {
        if(estaVacio())
            return;
        Nodo<E> nodo = cabeza.getSiguienteNodo();
        cabeza.setSiguienteNodo(nodo.getSiguienteNodo());
        nodo = null;
        
        if(cola == null)
            cola = cabeza;
    }
    
    public void apilar(E objecto) {
        if(estaVacio()) {
            alFinal(objecto);
        } else {
            Nodo<E> nodo = new Nodo<>(objecto);
            nodo.setSiguienteNodo(cabeza.getSiguienteNodo());
            cabeza.setSiguienteNodo(nodo);
        }
    }
    
    public int size() {
        Nodo<E> nodo = cabeza.getSiguienteNodo();
        int size = 0;
        while(nodo != null) {
            size ++;
            nodo = nodo.getSiguienteNodo();
        }
        return size;
    }
    
    public E get(int index) {
         E objecto = getNode(index).getObjecto();
        return objecto;
    }
    
    public Nodo<E> getNode(int index) {
        int size = size();
        if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Indice :"+index+" no existe.");
        }
        
        Nodo<E> nodo = cabeza.getSiguienteNodo();
        for(int i=0; i<index; i++) {
            nodo = nodo.getSiguienteNodo();
        }
        
        return nodo;
    }
    
    public boolean estaVacio() {
        return size()==0;
    }
}