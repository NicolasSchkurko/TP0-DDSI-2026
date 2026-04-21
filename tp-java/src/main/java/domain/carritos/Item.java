package domain.carritos;

import domain.Productos.Producto;

public class Item {
    private Carrito carrito;
    private Producto producto;
    private int cantidad;
    private  float precioUnitario;

    public float getPrecio(){
        return 0;
    }

    public float getPrecioOficial(){
        return 0;
    }

    public float getDescuento(){
        return  0;
    }
}
