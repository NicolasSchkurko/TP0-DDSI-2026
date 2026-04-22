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
    return this.fechaAnteriorAVigencia(fecha) && this.fechaPosteriorAVigencia(fecha);
  }

  public float getPrecio() {
    return precio;
  }

  private boolean fechaAnteriorAVigencia(Date fecha) {
    return this.fechaInicioVigencia.compareTo(fecha) < 0;
  }

  private boolean fechaPosteriorAVigencia(Date fecha) {
    return this.fechaFinVigencia.compareTo(fecha) >= 0;
  }
}
