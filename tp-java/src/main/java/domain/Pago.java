package domain;

import domain.carritos.Carrito;
import domain.tarjetas.Tarjeta;

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
