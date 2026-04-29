package package01;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio2Test {

    private final Ejercicio2 ejercicio = new Ejercicio2();

    @ParameterizedTest(name = "{index} => user={0}, pass={1}, esperado={2}")
    @CsvSource({
        // Casos de valores nulos (Cobertura de la primera rama if)
        ", pass, false",           // username null
        "user, , false",           // password null
        ", , false",               // ambos null

        // Casos de longitud >= 30 (Cobertura de la segunda rama if)
        "usernameMuyLargoQueSuperaLosTreintaCaracteres, pass, false", 
        "user, passwordMuyLargoQueSuperaLosTreintaCaracteres, false",

        // Casos que llegan a la "BD" (compruebaLoginEnBD)
        "user, pass, true",        // Login correcto
        "user, incorrecto, false", // Password incorrecto
        "error, pass, false",      // Username incorrecto
        "'', '', false"            // Strings vacíos (longitud < 30 pero no coinciden con mock)
    })
    void testLogin(String username, String password, boolean esperado) {
        assertEquals(esperado, ejercicio.login(username, password));
    }

    @ParameterizedTest
    @CsvSource({
        "user, pass, true",
        "admin, admin, false"
    })
    void testCompruebaLoginEnBD(String username, String password, boolean esperado) {
        // Prueba directa al método de base de datos para asegurar cobertura total
        assertEquals(esperado, ejercicio.compruebaLoginEnBD(username, password));
    }
}
