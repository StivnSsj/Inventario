import java.util.LinkedList;

public class ListaInventario {
    private LinkedList<ListaProducto> listaInventario;
    private int maxItems;
    
    public ListaInventario(int msxItems){
        this.listaInventario = new LinkedList<ListaProducto>();
        this.maxItems = msxItems;
    }
    
    public void AgregarInventario(ListaProducto listaProducto) {
        listaInventario.add(listaProducto);
    }
    
    public void MostrarListaInventario(){
        for(int i=0; i<listaInventario.size(); i++){
            System.out.println("Disponibles  "+listaInventario.get(i).getCantidad()+"   "+listaInventario.get(i).getListaProductos().get(i).getNombre());
        }
    }

    public LinkedList<ListaProducto> getListaInventario() {
        return listaInventario;
    }

    public void setListaInventario(LinkedList<ListaProducto> listaInventario) {
        this.listaInventario = listaInventario;
    }

    public int getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(int maxItems) {
        this.maxItems = maxItems;
    }
    
    
}