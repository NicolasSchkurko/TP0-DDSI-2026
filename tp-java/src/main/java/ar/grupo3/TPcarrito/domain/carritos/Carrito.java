package ar.grupo3.TPcarrito.domain.carritos;

import ar.grupo3.TPcarrito.domain.lugares.Direccion;
import ar.grupo3.TPcarrito.domain.Cliente;
import ar.grupo3.TPcarrito.domain.Pago;

import java.util.Date;
import java.util.List;

public class Carrito {
  private List<Item> items;
  private Date fechaCompra;
  private Cliente cliente;
  private Direccion direccionEnvio;
  private Direccion direccionCobro;
  private List<Pago> pagos;
  private Estado estado;

  public Carrito(
      List<Item> items,
      Date fechaCompra,
      Cliente cliente,
      Direccion direccionEnvio,
      Direccion direccionCobro,
      List<Pago> pagos
  ) {
    this.items = items;
    this.fechaCompra = fechaCompra;
    this.cliente = cliente;
    this.direccionEnvio = direccionEnvio;
    this.direccionCobro = direccionCobro;
    this.pagos = pagos;
    this.estado = Estado.EN_PROCESO;
  }

  public void cerrar() {
    this.setEstado(Estado.CERRADO);
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public void removeItem(Item item) {
    items.remove(item);
  }

  public float getMontoPagado() {
    float total = 0.0f;
    for (Pago pago : pagos) {
      total += pago.getMonto();
    }
    return total;
  }

  public float getMontoCarrito() {
    float total = 0.0f;
    for (Item item : items) {
      total += item.getPrecio();
    }
    if (cliente != null && cliente.isEsPreferencial()) {
      total *= 0.9f;  // 10% discount
    }
    return total;
  }

  public float getMontoDeuda() {
    return getMontoCarrito() - getMontoPagado();
  }

  private void setEstado(Estado estadoActualizado) {
    this.estado = estadoActualizado;
  }

  public Date getFecha () {
    return this.fechaCompra;
  }

}
