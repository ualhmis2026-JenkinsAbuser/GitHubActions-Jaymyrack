package package01;



public class Ejercicio3 {

    public String enmascarar(String password) {
        if (password == null) {
            throw new IllegalArgumentException("password no puede ser null");
        }

        int len = password.length();

        if (len < 5) {
            return "password demasiado corto";
        } else if (len <= 8) {
            return "********"; // 8 asteriscos
        } else if (len <= 40) {
            return "************"; // 12 asteriscos
        } else {
            return "password demasiado largo";
        }
    }
}
