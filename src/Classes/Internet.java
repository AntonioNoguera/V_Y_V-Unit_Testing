package Classes;

public class Internet extends Clientes{
    //Attributes
    private int idInternet;
    private float saldoInternet;

    //Constructor
    public Internet(int idCliente, String nombre, String direccion, float saldoTotal) {
        super(idCliente, nombre, direccion, saldoTotal);
    }

    //Getter and Setter
    public int getIdInternet() {
        return idInternet;
    }

    public void setIdInternet(int idInternet) {
        this.idInternet = idInternet;
    }

    public float getSaldoInternet() {
        return saldoInternet;
    }

    public void setSaldoInternet(float saldoInternet) {
        this.saldoInternet = saldoInternet;
    }
}
