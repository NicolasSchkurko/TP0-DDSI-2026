package ar.grupo3.TPcarrito.domain.Productos;

import java.util.Date;
import java.util.List;

public class Producto {
  private String EAN13;
  private String nombre;
  private List<PrecioProducto> preciosHistoricos;

  public Producto(
      String EAN13,
      String nombre,
      List<PrecioProducto> preciosHistoricos
  ) {
    this.EAN13 = EAN13;
    this.nombre = nombre;
    this.preciosHistoricos = preciosHistoricos;
  }

  public String getEAN() {
    return EAN13;
  }

  public String getNombre() {
    return nombre;
  }

  public String getNombreCorto() {
    return nombre.length() >= 3 ? nombre.substring(0, 3) : nombre;
  }

  public float getPrecio(Date fecha) {
    for (PrecioProducto precio : preciosHistoricos) {
      if (precio.getCumpleVigencia(fecha)) {
        return precio.getPrecio();
      }
    }
    return 0.0F;
  }
}
