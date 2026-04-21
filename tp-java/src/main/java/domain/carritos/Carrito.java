package domain.carritos;

import domain.lugares.Direccion;
import domain.Cliente;
import domain.Pago;

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

    private void setEstado(Estado estadoActualizado){
        this.estado = estadoActualizado;
    }

    public void cerrar(){
        this.setEstado(Estado.CERRADO);
    }

    public float getMontoPagado(){
        return 1.5F;
    }

    public float getMontoCarrito(){
        return 1.5F;
    }

    public float getMontoDeuda(){
        return 1.5F;
    }

}
