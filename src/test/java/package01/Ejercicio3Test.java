package package01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio3Test {

    private final Ejercicio3 ejercicio = new Ejercicio3();

    @Test
    void testEnmascararNull() {
        // Intenta instanciarlo dentro por si acaso
        Ejercicio3 ej = new Ejercicio3(); 
        assertThrows(IllegalArgumentException.class, () -> ej.enmascarar(null));
    }

    @ParameterizedTest(name = "{index} => password con longitud {0}, esperado: {1}")
    @CsvSource({
        
        "'1234', 'password demasiado corto'",
        "'', 'password demasiado corto'",
        
        
        "'12345', '********'",   
        "'12345678', '********'", 
        
        
        "'123456789', '************'", 
        "'1234567890123456789012345678901234567890', '************'", 
        
        
        "'12345678901234567890123456789012345678901', 'password demasiado largo'"
    })
    void testEnmascararRamas(String password, String esperado) {
        
        assertEquals(esperado, ejercicio.enmascarar(password));
    }
}
