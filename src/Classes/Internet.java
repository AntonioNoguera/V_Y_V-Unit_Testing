package Classes;

public class Internet extends Clientes{
    //Attributes
    private int idInternet;
    private float saldoInternet;
    private float velocidadIntenet;

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

    //Métodos

    //Actualizar Velocidad
    public void actualizarVelocidad(float nuevaVelocidad){
        float tarifaCambio = 20.21f;

        saldoInternet-= tarifaCambio;

    }

    // Cambios de velocidad de internet costo + actual, costo - actual,
    // Conectarse por()
    public void conexionInternet(int tiempoSegundos){
        float costoPorSegundo = 0.05f;
        float costoConexion = tiempoSegundos * costoPorSegundo;
        if(saldoInternet >= costoConexion){
            saldoInternet -=costoConexion;
        }else{
            //No posible
        }
    }

    public void descargarArchivo(float tamanoDelArchivoEnMb){
        float cuotaporMb = .01F;
        float costoDescarga = cuotaporMb*tamanoDelArchivoEnMb;
        if(saldoInternet>=costoDescarga){
            saldoInternet-=costoDescarga;
        }else{
            //No posible
        }
    }
}
