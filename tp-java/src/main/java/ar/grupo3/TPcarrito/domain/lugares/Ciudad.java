package ar.grupo3.TPcarrito.domain.lugares;


public class Ciudad {
  private String nombre;
  private Provincia provincia;

  public Ciudad(
      String nombre,
      Provincia provincia
  ) {
    this.nombre = nombre;
    this.provincia = provincia;
  }

  public String getDireccion() {
    return String.format("%s, %s",
        nombre,
        provincia.getDireccion()
    );
  }

}
