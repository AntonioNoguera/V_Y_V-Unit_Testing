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
    //Recargar Saldo

    public void recargarSaldo(float saldo){
        this.saldoTelefono+=saldo;
    }

    //Lamada Tiempo de llamada
    public void realizarLlamada(int duracionSegundos) {
        float costoPorMinuto = 0.05f;
        float costoLlamada = costoPorMinuto * duracionSegundos;
        if (saldoTelefono >= costoLlamada) {
            saldoTelefono -= costoLlamada;
            System.out.println("Llamada a exitosa. Nuevo saldo: " + saldoTelefono);
        } else {
            System.out.println("Saldo insuficiente para realizar la llamada.");
        }
    }

    public void enviarMensaje(int longitudMensaje) {
        float costoPorCaracter = 0.05f;
        float costoMensaje = longitudMensaje * costoPorCaracter;
        if (saldoTelefono >= costoMensaje) {
            saldoTelefono -= saldoTelefono;
            System.out.println("Llamada a exitosa. Nuevo saldo: " + saldoTelefono);
        } else {
            System.out.println("Saldo insuficiente para realizar la llamada.");
        }
    }
}
