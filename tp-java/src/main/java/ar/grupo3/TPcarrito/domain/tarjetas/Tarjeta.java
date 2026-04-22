package ar.grupo3.TPcarrito.domain.tarjetas;

public class Tarjeta {
  private String nombre;
  private MarcaTarjeta marcaTarjeta;
  private int ultimos4digitos;


  public Tarjeta(
      String nombre,
      MarcaTarjeta marcaTarjeta,
      int ultimos4digitos
  ) {
    this.nombre = nombre;
    this.marcaTarjeta = marcaTarjeta;
    this.ultimos4digitos = ultimos4digitos;
  }
}
