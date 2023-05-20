public class InventarioMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //CREA LAS LISTAS DE LOS PRODUCTOS, CON CANTIDAD DEFINIDA POR USUARIO
        //EN ESTE CASO 5 LISTAS DE 5 PRODUCTOS DIFERENTES
        //EJEMPLO
        ListaProducto listaPro1 = new ListaProducto(5);
        listaPro1.AgregarProducto(new Producto("Papas", 2500));
        
        ListaProducto listaPro2 = new ListaProducto(6);
        listaPro2.AgregarProducto(new Producto("Chocolate" , 2000));
        
        ListaProducto listaPro3 = new ListaProducto(7);
        listaPro3.AgregarProducto(new Producto("Mani", 1400));
        
        ListaProducto listaPro4 = new ListaProducto(4);
        listaPro4.AgregarProducto(new Producto("Galletas", 1000));
        
        ListaProducto listaPro5 = new ListaProducto(8);
        listaPro5.AgregarProducto(new Producto("Popetas", 1600));
        
        //UNA UNICA LISTA QUE CONTIENE LAS 5 LISTAS DE PRODUCTOS
        //EJEMPLO
        ListaInventario listaInv = new ListaInventario(5);
        
        listaInv.AgregarInventario(listaPro1);
        listaInv.AgregarInventario(listaPro2);
        listaInv.AgregarInventario(listaPro3);
        listaInv.AgregarInventario(listaPro4);
        listaInv.AgregarInventario(listaPro5);
        
        listaInv.MostrarListaInventario();
             
    }
}


