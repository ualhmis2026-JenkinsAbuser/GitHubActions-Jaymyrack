package package01;

public class Ejercicio6 {

    public double convertTemperature(double temperature, String fromUnit, String toUnit) {

        if (fromUnit == null || toUnit == null)
            return Double.NaN;

        fromUnit = fromUnit.toLowerCase();
        toUnit = toUnit.toLowerCase();

        double celsius;

        // Convertir a Celsius primero
        switch (fromUnit) {
            case "c":
                celsius = temperature;
                break;
            case "f":
                celsius = (temperature - 32) * 5 / 9;
                break;
            case "k":
                celsius = temperature - 273.15;
                break;
            default:
                return Double.NaN;
        }

        // Convertir desde Celsius a destino
        switch (toUnit) {
            case "c":
                return celsius;
            case "f":
                return celsius * 9 / 5 + 32;
            case "k":
                return celsius + 273.15;
            default:
                return Double.NaN;
        }
    }
}
