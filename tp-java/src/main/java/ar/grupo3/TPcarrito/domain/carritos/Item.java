package ar.grupo3.TPcarrito.domain.carritos;

import ar.grupo3.TPcarrito.domain.Productos.Producto;
import java.util.Date;

public class Item {
  private Carrito carrito;
  private Producto producto;
  private int cantidad;
  private float precioUnitario;

  public Item(
      Carrito carrito,
      Producto producto,
      int cantidad,
      Date fecha
  ) {
    this.producto = producto;
    this.cantidad = cantidad;
    this.precioUnitario = producto.getPrecio(fecha);
  }

  public float getPrecio() {
    return precioUnitario * cantidad;
  }

  public float getPrecioOficial() {
    return producto.getPrecio(carrito.getFecha()) * cantidad;
  }

  public float getDescuento(Date fecha, int descuento) {
    return this.getPrecioOficial() - this.getPrecio();
  }

  public Producto getProducto() {
    return producto;
  }
}
