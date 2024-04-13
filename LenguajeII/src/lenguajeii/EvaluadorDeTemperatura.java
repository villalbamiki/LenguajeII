
package lenguajeii;

/**
 *
 * @author mikyv
 */

import java.util.Scanner;

public class EvaluadorDeTemperatura {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el momento del día (mañana, tarde, noche): ");
            String momento = scanner.nextLine().toLowerCase();
            System.out.print("Ingrese la temperatura actual del tanque de combustible: ");
            double temperatura = scanner.nextDouble();

            // Validación del momento del día
            if (!momento.equals("mañana") && !momento.equals("tarde") && !momento.equals("noche")) {
                System.out.println("Error: Momento del día no válido.");
                return;
            }

            String evaluacion = evaluarTemperatura(momento, temperatura);
            System.out.println("La evaluación de la temperatura es: " + evaluacion);

        } catch (Exception e) {
            System.out.println("Error: Entrada no válida.");
        }
    }

    public static String evaluarTemperatura(String momento, double temperatura) {
        // Valores predeterminados de temperatura
        double muyBuena = 0, normalMin = 0, normalMax = 0, peligrosa = 0;

        // Asignación de valores según el momento del día
        switch (momento) {
            case "mañana":
                muyBuena = 10;
                normalMin = 10;
                normalMax = 25;
                peligrosa = 25;
                break;
            case "tarde":
                muyBuena = 15;
                normalMin = 15;
                normalMax = 30;
                peligrosa = 30;
                break;
            case "noche":
                muyBuena = 5;
                normalMin = 5;
                normalMax = 20;
                peligrosa = 20;
                break;
        }

        // Evaluación de la temperatura
        if (temperatura < muyBuena) {
            return "Muy Buena";
        } else if (temperatura >= normalMin && temperatura <= normalMax) {
            return "Normal";
        } else if (temperatura > peligrosa) {
            return "Peligrosa";
        }

        return "Indeterminada"; // En caso de no cumplir ninguna condición
    }
}

