import java.util.LinkedList;

public class ListaProducto {
    private LinkedList<Producto> listaProductos;
    private int cantidad;
    private int disponible;

    public ListaProducto(int cantidad) {
        this.listaProductos = new LinkedList<Producto>();
        this.cantidad = cantidad;
        this.disponible = 0;
    }

    public void AgregarProducto(Producto producto) {
        for(int i=0; i<cantidad; i++){
            listaProductos.add(producto);
            disponible++;
        }
    }
    public void ExtraerProducto(){
        listaProductos.removeLast();
        disponible--;
    }
  
    public void mostrar(){
        for(int i=0; i<listaProductos.size(); i++){
            System.out.println(disponible+"dis "+listaProductos.size()+"cantidad "+listaProductos.get(i).getNombre());
        }
    }

    public LinkedList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(LinkedList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }
    
    
}
