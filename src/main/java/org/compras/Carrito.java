package org.compras;

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

    private void setEstado(Estado newEstado) {
        this.estado = newEstado;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public Boolean getClienteEsPreferencial() {
        return cliente.getEsPreferencial();
    }

    public void cerrar() {
        this.setEstado(Estado.CERRADO);
    }

    public Double getMontoCarrito() {
        if (cliente.getEsPreferencial()) {
            return items.stream()
                    .mapToDouble(item -> item.getPrecio())
                    .sum();
        }
        return items.stream()
                .mapToDouble(item -> item.getPrecio())
                .sum();
    }

    public Double getMontoPagado() {
        return pagos.stream()
                .mapToDouble(pago -> pago.getMonto())
                .sum();
    }

    public Double getMontoDeuda() {
        return this.getMontoCarrito() - this.getMontoPagado();
    }
}
