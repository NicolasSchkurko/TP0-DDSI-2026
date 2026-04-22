package ar.grupo3.TPcarrito.domain.lugares;


public class Provincia {
  private String nombre;
  private Pais pais;

  public Provincia(
      String nombre,
      Pais pais
  ) {
    this.nombre = nombre;
    this.pais = pais;
  }

  public String getDireccion() {
    return String.format("%s, %s",
        nombre,
        pais.getNombre()
    );
  }

}
