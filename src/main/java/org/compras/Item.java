package org.compras;

import java.util.Date;

public class Item {
    private Carrito carrito;
    private Producto producto;
    private Integer cantidad;
    private Double precioUnitario;

    public Double getPrecio() {
        return this.getPrecioOficial() * (1 - this.getDescuento());
    }

    public Double getPrecioOficial() {
        return producto.getPrecio(carrito.getFechaCompra()) * cantidad;
    }

    public Double getDescuento() {
        if(carrito.getClienteEsPreferencial()) {
            return (double) (10/100);
        }
        return 0.0;
    }
}
