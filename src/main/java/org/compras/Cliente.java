package org.compras;

import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private String email;
    private List<Direccion> direcciones;
    private List<Carrito> carritos;
    private List<Tarjeta> tarjetas;
    private Boolean esPreferencial;

    public Double getMontoDeuda() {
        return carritos.stream()
                .mapToDouble(carrito -> carrito.getMontoDeuda())
                .sum();
    }

    public Boolean getEsPreferencial() {
        return esPreferencial;
    }

    public Boolean estaHabilitado() {
        return true;
    }
}
