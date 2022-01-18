package LogicaNegocio;

/**
 *
 * @author qinux
 */
public class ProductosAlquilados<Productos> {
    private Productos producto;
    Nodo<Productos> cabeza;
    Nodo<Productos> cola;
    
    public ProductosAlquilados() {
        cola = cabeza = new Nodo<>();
    }
    
     public void apilar(Productos producto) {
        if(estaVacio()) {
            Nodo<Productos> nodoa = new Nodo<>(producto);
            cola.setSiguienteNodo(nodoa);
            cola = nodoa;
        } else {
            Nodo<Productos> nodo = new Nodo<>(producto);
            nodo.setSiguienteNodo(cabeza.getSiguienteNodo());
            cabeza.setSiguienteNodo(nodo);
        }
    }
    
    public boolean estaVacio() {
        return size()==0;
    }
    
    public int size() {
        Nodo<Productos> nodo = cabeza.getSiguienteNodo();
        int size = 0;
        while(nodo != null) {
            size ++;
            nodo = nodo.getSiguienteNodo();
        }
        return size;
    }
}
