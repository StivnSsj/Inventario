public class Inventario {

    public void InicializarInventario() {
        // CREA LAS LISTAS DE LOS PRODUCTOS, CON CANTIDAD DEFINIDA POR PROGRAMADOR
        // EN ESTE CASO 5 LISTAS DE 5 PRODUCTOS DIFERENTES
        // EJEMPLO
        ListaProducto listaPro1 = new ListaProducto(5);
        listaPro1.AgregarProducto(new Producto("Papas", 2500));

        ListaProducto listaPro2 = new ListaProducto(6);
        listaPro2.AgregarProducto(new Producto("Chocolate", 2000));

        ListaProducto listaPro3 = new ListaProducto(7);
        listaPro3.AgregarProducto(new Producto("Mani", 1400));

        ListaProducto listaPro4 = new ListaProducto(4);
        listaPro4.AgregarProducto(new Producto("Galletas", 1000));

        ListaProducto listaPro5 = new ListaProducto(8);
        listaPro5.AgregarProducto(new Producto("Popetas", 1600));

        // UNA UNICA LISTA QUE CONTIENE LAS 5 LISTAS DE PRODUCTOS
        // EJEMPLO
        ListaInventario listaInv = new ListaInventario(5);

        listaInv.AgregarInventario(listaPro1);
        listaInv.AgregarInventario(listaPro2);
        listaInv.AgregarInventario(listaPro3);
        listaInv.AgregarInventario(listaPro4);
        listaInv.AgregarInventario(listaPro5);

        listaInv.MostrarListaInventario();

        // CREA LAS COLAS DE MONEDAS, CON UNA CANTTIDAD INICIALIZADA POR EL PROGRAMADOR

        ColaMonedas cola100 = new ColaMonedas(5,100);
        ColaMonedas cola200 = new ColaMonedas(7,200);
        ColaMonedas cola500 = new ColaMonedas(10,500);
        ColaMonedas cola1000 = new ColaMonedas(8,1000);
        
        cola100.InicializarMonedas();
        cola100.mostrar();

        cola200.InicializarMonedas();
        cola200.mostrar();

        cola500.InicializarMonedas();
        cola500.mostrar();

        cola1000.InicializarMonedas();
        cola1000.mostrar();

    }
}
