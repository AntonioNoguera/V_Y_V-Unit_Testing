package Classes;

import java.util.ArrayList;

public class Cable extends Clientes{
    //Attributes
    private int idCable;
    private float saldoCable;
    private ArrayList<String> canalesSuscritos;

    //Constructor
    public Cable(int idCliente, String nombre, String direccion, float saldoTotal, int idCable, float saldoCable) {
        super(idCliente, nombre, direccion, saldoTotal);
        this.idCable = idCable;
        this.saldoCable = saldoCable;
    }

    //Getter and Setter
    public void setIdCable(int idCable) {
        this.idCable = idCable;
    }

    public void setSaldoCable(float saldoCable) {
        this.saldoCable = saldoCable;
    }


    //Métodos

    //suscribirse a un (normal)
    public void suscripcion(String nombreDeCanal){
        int tarifaDeSuscripcion = 10;
        if(saldoCable<=tarifaDeSuscripcion){
            saldoCable -= tarifaDeSuscripcion;
            canalesSuscritos.add(nombreDeCanal);
        }
    }

    public void cancelarSucripcion(String nombreDeCanal){
        int tarifaDeSuscripcion = 10;
        if(canalesSuscritos.contains(nombreDeCanal)){
            canalesSuscritos.remove(nombreDeCanal);
            saldoCable += tarifaDeSuscripcion;
        }
    }


    public void recargarCable(float monto) {
        saldoCable += monto;
    }




    //Retornar lista de canales suscritos
    public ArrayList<String> getCanalesSuscritos(){
        return canalesSuscritos;
    }

}
