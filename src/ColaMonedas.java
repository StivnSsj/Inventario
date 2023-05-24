import java.util.LinkedList;

public class ColaMonedas {
    Moneda moneda; 
    LinkedList<Moneda> ColaMonedas;
    int cantidad;
    int disponible;

    public ColaMonedas(int cantidad, int valor) {
        this.moneda = new Moneda(valor);
        this.ColaMonedas = new LinkedList<Moneda>();
        this.cantidad = cantidad;
        this.disponible = 0;
    }

    public void InicializarMonedas() {
        for(int i=0; i<cantidad; i++){
            ColaMonedas.addLast(moneda);
            disponible++;
        }
    }

    public void mostrar(){
        System.out.println("Disponibles "+disponible);
        for(int i=0; i<ColaMonedas.size(); i++){
            System.out.println(+moneda.getValor());
        }
    }

}
