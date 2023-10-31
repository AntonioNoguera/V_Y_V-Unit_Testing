import com.example.Clientes;
import com.example.Internet;
import com.example.Telefono;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Test_Internet {

    //Base de Prueba Navegación
    public void testNavegacionScenario(double saldoInicial, double cantidadDeMinutos, double costoEsperado) {
        Clientes cliente = new Clientes(1, "Fernando Torres", "San Nicolás");
        Internet CableCliente = new Internet(cliente, 12, saldoInicial);

        double resultado = CableCliente.navegarSitio(cantidadDeMinutos);
        assertEquals(costoEsperado, resultado, 0.1);
    }

    //Base de Descarga
    public void descargarScenario(double saldoIncial, double archivoSize, double esperado){
        Clientes clienteA = new Clientes(1, "Fernando Torres", "San Nicolás");
        Internet CableClienteA = new Internet(clienteA,12,121.12);

        double resultado = CableClienteA.descargarArchivo(12321);

        assertEquals(esperado,resultado,0.1);
    }


    //Caso Valido - Navegación
    @Test
    public void pruebaNavegacionValida() {
        testNavegacionScenario(15.41, 25.32, 15.41 - (25.32 * 0.1));
    }

    //Caso Invalido - Navegación
    @Test
    public void pruebaNavegacionInvalida() {
        testNavegacionScenario(3, 25.32, 2 - (25.32 * 0.1));
    }

    //Caso Valido - Descarga
    @Test
    public void descargarValido(){
        descargarScenario( 121.12, 12321,121.12- (12321*0.0001));
    }

    //Caso Invalido - Descarga
    @Test
    public void descargarInvalido(){
        descargarScenario( 111.12, 1232123421,111.12- (1232123421*0.0001));
    }
}
