package domain.Productos;

import java.util.Date;
import java.util.List;

public class Producto {
    private String EAN13;
    private  String nombre;
    private List<PrecioProducto> preciosHistoricos;

    public String getEAN() {
        return EAN13;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreCorto(){
        return "hay que cortar el nombre";
    }

    public float getPrecio(Date fecha){
        for (PrecioProducto precio: preciosHistoricos) {
            if (precio.getCumpleVigencia(fecha)){
                return precio.getPrecio();
            }
        }
        return 0;
    }
}
