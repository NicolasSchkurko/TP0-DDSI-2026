package org.compras;

public class Provincia {
    private String nombre;
    private Pais pais;

    public String obtenerTextoPrvncia() {
        return nombre + ", " + pais.getPais();
    }
}
