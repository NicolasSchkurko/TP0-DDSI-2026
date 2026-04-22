package ar.grupo3.TPcarrito.domain;

import ar.grupo3.TPcarrito.domain.carritos.Carrito;
import ar.grupo3.TPcarrito.domain.tarjetas.Tarjeta;

public class Pago {
  private Carrito carrito;
  private Tarjeta tarjeta;
  private float monto;

  public Pago(
      Carrito carrito,
      Tarjeta tarjeta,
      float monto
  ) {
    this.carrito = carrito;
    this.tarjeta = tarjeta;
    this.monto = monto;
  }

  public boolean verificarTarjeta() {
    return true;
  }

  public float getMonto() {
    return monto;
  }
}
