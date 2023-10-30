package Classes;


public class Telefono extends Clientes{
    //Attributes
    private long numTelefono;
    private float saldoTelefono;


    //Constructor
    public Telefono(int idCliente, String nombre, String direccion, float saldoTotal,long numTelefono, float saldoTelefono) {
        super(idCliente, nombre, direccion, saldoTotal);
        this.numTelefono=numTelefono;
        this.saldoTelefono=saldoTelefono;
    }

    //Getter and Setter
    public long getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(long numTelefono) {
        this.numTelefono = numTelefono;
    }

    public float getSaldoTelefono() {
        return saldoTelefono;
    }

    public void setSaldoTelefono(float saldoTelefono) {
        this.saldoTelefono = saldoTelefono;
    }

    //Metodos propuestos
    //Get lada.

    //Tiempo de llamada
}
