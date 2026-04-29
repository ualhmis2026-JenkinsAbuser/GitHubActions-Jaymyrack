package package01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    private final Ejercicio1 ejercicio = new Ejercicio1();

    @Test
    public void testDivisiblePorDos() {
        // Cubre el primer 'if'. 8 -> 4 -> 2 -> 1
        assertEquals(1, ejercicio.transformar(8));
    }

    @Test
    public void testDivisiblePorTres() {
        // Cubre el segundo 'else if'. 9 -> 3 -> 1
        // (Usamos 9 porque no es divisible por 2)
        assertEquals(1, ejercicio.transformar(9));
    }

    @Test
    public void testDivisiblePorCinco() {
        
        assertEquals(1, ejercicio.transformar(25));
    }

    @Test
    public void testCasoBase() {
        
        assertEquals(7, ejercicio.transformar(7));
    }

    @Test
    public void testCombinado() {
        
        assertEquals(1, ejercicio.transformar(30));
    }
}
