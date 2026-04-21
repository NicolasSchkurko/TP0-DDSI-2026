package domain;
import domain.lugares.Direccion;
import domain.carritos.Carrito;
import domain.tarjetas.Tarjeta;

import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private String email;
    private List<Direccion> direcciones;
    private List<Carrito> carritos;
    private List<Tarjeta> tarjeta;
    private boolean esPreferencial;

    public float getMontoDeuda(){
        return 0.0F;
    }

    public boolean estaHabilitado(){
        return true;
    }
}
