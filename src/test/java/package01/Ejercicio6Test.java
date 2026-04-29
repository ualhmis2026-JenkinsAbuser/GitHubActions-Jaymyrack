package package01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class Ejercicio6Test {

    @ParameterizedTest
    @CsvFileSource(resources = "/temperaturas.csv", delimiter = ';')
    void testConversion(double valor, String from, String to, String esperado) {

        Ejercicio6 c = new Ejercicio6();
        double r = c.convertTemperature(valor, from, to);

        if (esperado.equals("NaN")) {
            assertTrue(Double.isNaN(r));
        } else {
            assertEquals(Double.parseDouble(esperado), r, 0.01);
        }
    }
}
