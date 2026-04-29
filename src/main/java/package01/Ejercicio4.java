package package01;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public static <T extends Comparable<T>> List<T> mezclar(List<T> a, List<T> b) {

        List<T> resultado = new ArrayList<>();

        int i = 0, j = 0;

        while (i < a.size() && j < b.size()) {
            T x = a.get(i);
            T y = b.get(j);

            int cmp = x.compareTo(y);

            if (cmp < 0) {
                resultado.add(x);
                i++;
            } else if (cmp > 0) {
                resultado.add(y);
                j++;
            } else {
                // duplicado → añadir solo uno
                resultado.add(x);
                i++;
                j++;
            }
        }

        // Añadir restos
        while (i < a.size()) {
            resultado.add(a.get(i++));
        }

        while (j < b.size()) {
            resultado.add(b.get(j++));
        }

        return resultado;
    }
}

