import com.example.Telefono;
import com.example.Clientes;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test_Telefono {
    //Prueba Base - Llamar
    public void baseLlamarScenario(double saldoInicial, double minutosLlamada, double esperado){
        Clientes clienteA = new Clientes(1, "Fernando Torres", "San Nicolás");
        Telefono CableClienteA = new Telefono(clienteA,6641168477L,saldoInicial);

        double resultado = CableClienteA.realizarLlamada(minutosLlamada);

        assertEquals(esperado,resultado,0.1);
    }

    //Prueba Base - Mensaje
    public void enviarMensajeScenario(double saldo,String mensaje, double esperado){
        Clientes clienteA = new Clientes(1, "Fernando Torres", "San Nicolás");
        Telefono CableClienteA = new Telefono(clienteA,6641168477L,saldo);
        int messageLength = "Buenos dias como se encuentra usted".length();
        double resultado = CableClienteA.enviarMensaje(mensaje);
        assertEquals(esperado,resultado,0.1);
    }

    //Caso Valido
    public void llamarScenarioValido(){
        baseLlamarScenario(10.21,12,10.21 - 12 * 0.1);
    }

    //Caso Invalido
    public void llamarScenarioInvalida(){
        baseLlamarScenario(1,12,10.21 - 12 * 0.1);
    }


    //Caso Valido
    @Test
    public void enviarMensajeValido(){
        String mensaje = "Buenos dias como se encuentra usted";
        enviarMensajeScenario(10.21,mensaje,10.21-(mensaje.length()*0.01));
    }

    //Caso Valido
    @Test
    public void enviarMensajeInvalido(){
        String mensaje = "";
        enviarMensajeScenario(10.21,mensaje,10.21-(mensaje.length()*0.01));
    }
}
