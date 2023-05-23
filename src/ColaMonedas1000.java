import java.util.LinkedList;

public class ColaMonedas1000 {
    Moneda moneda; 
    LinkedList<Moneda> ColaMonedas100;
    int cantidad;
    int disponible;

    public ColaMonedas1000(int cantidad) {
        this.moneda = new Moneda(1000);
        this.ColaMonedas100 = new LinkedList<Moneda>();
        this.cantidad = cantidad;
        this.disponible = 0;
    }

    public void InicializarMonedas() {
        for(int i=0; i<cantidad; i++){
            ColaMonedas100.addLast(moneda);
            disponible++;
        }
    }

    public void mostrar(){
        System.out.println("Disponibles "+disponible);
        for(int i=0; i<ColaMonedas100.size(); i++){
            System.out.println(+moneda.getValor());
        }
    }

}
