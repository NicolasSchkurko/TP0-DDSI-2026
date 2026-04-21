package domain.Productos;

import java.util.Date;

public class PrecioProducto {
    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;
    private float precio;

    public  Date getFechaInicioVigencia(){
        return  this.fechaInicioVigencia;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public boolean getCumpleVigencia(Date fecha){
        boolean fechaEsIgualOAnteriorAInicioVigencia = this.fechaInicioVigencia.compareTo(fecha)<=0;
        boolean fechaEsIgualOPosteriorAFinVigencia = this.fechaFinVigencia.compareTo(fecha)>=0;
        return fechaEsIgualOAnteriorAInicioVigencia && fechaEsIgualOPosteriorAFinVigencia;
    }

    public float getPrecio() {
        return precio;
    }
}
