package org.compras;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Producto {
    private String ean13;
    private String nombre;
    private List<PrecioProducto> preciosHistoricos;

    public String getEan13() {
        return ean13;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreCorto() {
        return nombre.substring(0, 10);
    }

    public Double getPrecio(Date fechaVigencia) {
        Optional<PrecioProducto> precioProducto = preciosHistoricos.stream()
                .filter(precio -> precio.getCumpleVigencia(fechaVigencia))
                .findFirst();

        return precioProducto.get().getPrecio();
    }
}
