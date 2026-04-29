package package01;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class Ejercicio7Test {

    private int[] parse(String s) {
        return Arrays.stream(s.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/arrays.csv")
    void testFisherYates(String datos) {
        int[] original = parse(datos);
        int[] mezclado = Ejercicio7.fisherYates(original);

        assertEquals(original.length, mezclado.length);

        if (original.length > 1) {
            assertFalse(Arrays.equals(original, mezclado));
        } else {
            assertTrue(Arrays.equals(original, mezclado));
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/arrays.csv")
    void testAlternativo(String datos) {
        int[] original = parse(datos);
        int[] mezclado = Ejercicio7.alternativo(original);

        assertEquals(original.length, mezclado.length);

        if (original.length > 1) {
            assertFalse(Arrays.equals(original, mezclado));
        } else {
            assertTrue(Arrays.equals(original, mezclado));
        }
    }
}