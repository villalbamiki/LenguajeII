
package lenguajeii;

/**
 *
 * @author mikyv
 */

import java.util.Scanner;

public class ClasificacionPorEdad {
    public static void main(String[] args) {

        int totalMayores, totalMenores;
        int sumaMayores, sumaMenores;
        
        try (Scanner scanner = new Scanner(System.in)) {
            totalMayores = 0;
            totalMenores = 0;
            sumaMayores = 0;
            sumaMenores = 0;
            // Leer la edad de 5 personas
            for (int i = 0; i < 5; i++) {
                System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
                int edad = scanner.nextInt();
                
                // Clasificar la edad usando estructura if
                if (edad >= 18) {
                    sumaMayores += edad;
                    totalMayores++;
                } else {
                    sumaMenores += edad;
                    totalMenores++;
                }
            }
        }

        // Calcular promedio de edades para cada grupo
        double promedioMayores = (totalMayores > 0) ? (double) sumaMayores / totalMayores : 0;
        double promedioMenores = (totalMenores > 0) ? (double) sumaMenores / totalMenores : 0;
        
        // Mostrar resultados
        System.out.println("Promedio de edad de mayores de edad: " + promedioMayores);
        System.out.println("Promedio de edad de menores de edad: " + promedioMenores);
    }
}
