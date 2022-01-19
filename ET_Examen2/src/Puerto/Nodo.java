package Puerto;

/**
 *
 * @author qinux
 */
public class Nodo<T> {
    private T objecto;
    private Nodo<T> siguienteNodo;
    
    public Nodo() {
        this(null);
    }
    
    public Nodo(T objecto) {
        this(objecto, null);
    }
    
    public Nodo(T objecto, Nodo<T> siguienteNodo) {
        this.objecto = objecto;
        this.siguienteNodo = siguienteNodo;
    }

    public T getObjecto() {
        return objecto;
    }

    public void setObjecto(T objecto) {
        this.objecto = objecto;
    }

    public Nodo<T> getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(Nodo<T> siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }
}
