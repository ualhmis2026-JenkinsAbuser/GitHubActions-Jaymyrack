package package01;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;



class Ejercicio4Test {
	private final Ejercicio4 ejercicio4 = new Ejercicio4();

    private List<Integer> parseList(String s) {
        if (s == null || s.isBlank()) return new ArrayList<>();
        List<Integer> lista = new ArrayList<>();
        for (String x : s.split(",")) {
            if (!x.isBlank())
                lista.add(Integer.parseInt(x.trim()));
        }
        return lista;
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/mezcla.csv", numLinesToSkip = 0, delimiter = ';')
    void testMezcla(String listaA, String listaB, String esperado) {

        List<Integer> a = parseList(listaA);
        List<Integer> b = parseList(listaB);
        List<Integer> rEsperado = parseList(esperado);

        List<Integer> resultado = Ejercicio4.mezclar(a, b);

        assertEquals(rEsperado, resultado);
    }
}