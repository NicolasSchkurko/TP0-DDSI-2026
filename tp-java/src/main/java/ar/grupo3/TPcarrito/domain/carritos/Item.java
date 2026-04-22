package ar.grupo3.TPcarrito.domain.carritos;

import ar.grupo3.TPcarrito.domain.Productos.Producto;
import java.util.Date;

public class Item {
  private Producto producto;
  private int cantidad;
  private float precioUnitario;

  public Item(
      Producto producto,
      int cantidad,
      Date fecha
  ) {
    this.producto = producto;
    this.cantidad = cantidad;
    this.precioUnitario = producto.getPrecio(fecha);
  }

  public float getPrecio(Date fecha) {
    return precioUnitario * cantidad;
  }

  public float getPrecioOficial(Date fecha) {
    return precioUnitario * cantidad;
  }

  public float getDescuento(Date fecha, int descuento) {
    return (precioUnitario * cantidad) * (descuento / 100.0f);
  }

  public Producto getProducto() {
    return producto;
  }
}
