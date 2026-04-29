package package01;

import java.util.Random;

public class Ejercicio7 {

    // Fisher-Yates
    private static void aleatorizarArrayFY(int[] array) {
        Random r = new Random(0); // semilla fija para reproducibilidad
        for (int i = array.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    // Alternativa simple
    private static void aleatorizarArray(int[] array) {
    	Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int j = r.nextInt(array.length);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    // Métodos públicos para test
    public static int[] fisherYates(int[] a) {
        int[] copia = a.clone();
        aleatorizarArrayFY(copia);
        return copia;
    }

    public static int[] alternativo(int[] a) {
        int[] copia = a.clone();
        aleatorizarArray(copia);
        return copia;
    }
}
