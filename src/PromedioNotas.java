import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        final int NUMERO_NOTAS = 5; // Número de notas que se deben ingresar

        System.out.println("Ingrese exactamente " + NUMERO_NOTAS + " notas:");

        // Ciclo para ingresar las 5 notas
        for (int i = 1; i <= NUMERO_NOTAS; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota); // Agregar la nota a la lista
        }

        // Calcular el promedio de las notas
        double sumaNotas = 0;
        for (double nota : notas) {
            sumaNotas += nota;
        }
        double promedio = sumaNotas / NUMERO_NOTAS;

        // Mostrar las notas ingresadas y el promedio
        System.out.println("\nResumen de notas:");
        for (int i = 0; i < NUMERO_NOTAS; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas.get(i));
        }
        System.out.println("Promedio: " + promedio);

        scanner.close();
    }
}
