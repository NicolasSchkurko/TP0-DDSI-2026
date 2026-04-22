package org.compras;

public class Pago {
    private Carrito carrito;
    private Tarjeta tarjeta;
    private Double monto;

    public Double getMonto() {
        return monto;
    }

    public Boolean verificarTarjeta() {
        return true;
    }
}
