package org.compras;

import java.util.Date;

public class PrecioProducto {
    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;
    private Double precio;

    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public Double getPrecio() {
        return precio;
    }

    public Boolean getCumpleVigencia(Date fecha) {
        return fecha.after(fechaInicioVigencia) && fecha.before(fechaFinVigencia);
    }
}
