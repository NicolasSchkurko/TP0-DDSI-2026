package domain;
import domain.carritos.Carrito;
import domain.tarjetas.Tarjeta;

public class Pago {
    private Carrito carrito;
    private Tarjeta tarjeta;
    private float monto;

    public boolean verificarTarjeta(){
        return true;
    }
}
