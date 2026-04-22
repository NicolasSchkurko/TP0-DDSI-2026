package org.compras;

import java.util.ArrayList;
import java.util.List;

public class Direccion {
    private String calle1;
    private String calle2;
    private Integer altura;
    private Boolean sinAltura;
    private Integer piso;
    private Integer cuerpo;
    private String departamento;
    private Ciudad ciudad;

    private double latitud;
    private double longitud;

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public String getCalle1() {
        return calle1;
    }
    public String getCalle2() {
        return calle2;
    }
    public String getAltura() {
        return altura.toString();
    }
    public String getPiso() {
        return piso.toString();
    }
    public String getCuerpo() {
        return cuerpo.toString();
    }
    public String getDepartamento() {
        return departamento;
    }
    public String getCiudad() {
        return ciudad.obtenerTextoCiudad();
    }

    public String getDireccion() {
        List<String> lista = new ArrayList<>();
        lista.add(calle1);
        lista.add(calle2);
        lista.add(altura.toString());
        lista.add(piso.toString());
        lista.add(cuerpo.toString());
        lista.add(departamento);
        lista.add(ciudad.obtenerTextoCiudad());

        return lista.stream()
                .reduce(", ",
                        (acum, elem) -> acum + elem);
    }

    public Boolean estaHabilitadaEnvio() {
        return true; // en base a qué habilito el envio?
    }
}
