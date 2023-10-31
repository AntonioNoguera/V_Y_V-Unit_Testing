import com.example.Cable;
import com.example.Clientes;
import com.example.Internet;
import com.example.Telefono;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test_Cliente {

    //Prueba Base
    public void sumaTotalScenario(double saldoInternet, double saldo, double saldoCable, double saldoEsperable){
        Clientes clienteA = new Clientes(1, "Fernando Torres", "San Nicolás");
        Internet InternetClienteA = new Internet(clienteA,12,saldoInternet);
        Telefono TelefonoClienteA = new Telefono(clienteA,6641168477L,saldo);
        Cable CableClienteA = new Cable(clienteA,12,saldoCable);

        double saldoObtenido = clienteA.getSaldoTotal(InternetClienteA,TelefonoClienteA,CableClienteA);

        assertEquals(saldoEsperable,saldoObtenido,0.001);
    }

    @Test
    public void sumaTotalValido(){
        sumaTotalScenario(15.41,12.12,20.16, 15.41+12.12+20.16);
    }

    @Test
    public void sumaTotalInvalido(){
        sumaTotalScenario(11,12.12,20.16, 15.41+12.12+20.16);
    }
}
