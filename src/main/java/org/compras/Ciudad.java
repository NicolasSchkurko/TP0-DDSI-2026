package org.compras;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ciudad {
    private String nombre;
    private Provincia provincia;

    public String obtenerTextoCiudad() {
        return nombre + ", " + provincia.obtenerTextoPrvncia();
    }
}
