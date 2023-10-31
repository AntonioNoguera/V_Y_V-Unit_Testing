import com.example.Cable;
import com.example.Clientes;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test_Cable {

    //Caso Base - Ver Canel
    public void verCanalScenario(double saldo, int tiempo, double esperado){
        Clientes clienteA = new Clientes(1, "Fernando Torres", "San Nicolás");
        Cable CableclienteA = new Cable(clienteA,1,saldo);

        double resultado = CableclienteA.verCanal(tiempo);
        assertEquals(esperado,resultado,0.01);
    }

    //Caso Base - Contratar
    public void contratarCanalScenario(double saldo, String Canal, double esperado){
        Clientes clienteA = new Clientes(1, "Fernando Torres", "San Nicolás");
        Cable CableclienteA = new Cable(clienteA,1,saldo);

        double obtenido = CableclienteA.contratarCanal(Canal);

        assertEquals(esperado,obtenido,0.001);
    }

    //Caso - Valido
    @Test
    public void verCanalValido(){
        verCanalScenario(10.21,16,10.21-(16*0.2));
    }
    //Caso - Invalido
    @Test
    public void verCanalInvalido(){
        verCanalScenario(10.21,-10,10.21-(-10*0.2));
    }

    //Caso - Valido
    @Test
    public void contratarCanalValido(){
        contratarCanalScenario(7.12,"Azteca 7",7.12-5);
    }
    //Caso - Invalido
    @Test
    public void contratarCanalInvalido(){
        contratarCanalScenario(7.12,"",7.12-5);
    }
}
