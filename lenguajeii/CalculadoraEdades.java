
package lenguajeii;

/**
 *
 * @author mikyv
 */

public class CalculadoraEdades {
    private final int[] edades;

    // Constructor que recibe un arreglo de edades
    public CalculadoraEdades(int[] edades) {
        this.edades = edades;
    }

    // Método que calcula y devuelve el promedio de las edades
    public double calcularPromedio() {
        if (edades == null || edades.length == 0) {
            return 0; // Retorna 0 si el arreglo es nulo o está vacío
        }
        
        int suma = 0;
        for (int edad : edades) {
            suma += edad;
        }
        return (double) suma / edades.length; // Calcula el promedio
    }

    public static void main(String[] args) {
        // Define un arreglo de enteros con edades predefinidas
        int[] edades = {18, 22, 33, 44, 25};

        // Crea una instancia de CalculadoraEdades
        CalculadoraEdades calculadora = new CalculadoraEdades(edades);

        // Calcula el promedio de las edades y lo almacena
        double promedio = calculadora.calcularPromedio();

        // Muestra el promedio calculado por consola
        System.out.println("El promedio de las edades es: " + promedio);
    }
}
