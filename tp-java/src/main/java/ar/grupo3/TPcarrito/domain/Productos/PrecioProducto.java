package ar.grupo3.TPcarrito.domain.Productos;

import java.util.Date;

public class PrecioProducto {
  private Date fechaInicioVigencia;
  private Date fechaFinVigencia;
  private float precio;

  public PrecioProducto(
      Date fechaInicioVigencia,
      Date fechaFinVigencia,
      float precio
  ) {
    this.fechaInicioVigencia = fechaInicioVigencia;
    this.fechaFinVigencia = fechaFinVigencia;
    this.precio = precio;
  }

  public Date getFechaInicioVigencia() {
    return this.fechaInicioVigencia;
  }

  public Date getFechaFinVigencia() {
    return this.fechaFinVigencia;
  }

  public boolean getCumpleVigencia(Date fecha) {
    return fecha.after(fechaInicioVigencia) && fecha.before(fechaFinVigencia);

  }

  public float getPrecio() {
    return precio;
  }
}
