package Classes;

public class Cable extends Clientes{
    //Attributes
    private int idCable;
    private float saldoCable;

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

    //suscribirse a un (normal)


    //Retornar lista de canales suscritos


}
