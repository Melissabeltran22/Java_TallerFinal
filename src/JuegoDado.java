import java.util.Random;
import java.util.Scanner;

public class JuegoDado {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego del dado!");

        // Bucle do while para permitir múltiples lanzamientos del dado
        do {
            // Generar un número aleatorio entre 1 y 6 (ambos inclusive)
            int numeroDado = random.nextInt(6) + 1;

            System.out.println("Has lanzado el dado y ha salido: " + numeroDado);

            // Preguntar al jugador si desea lanzar el dado de nuevo
            System.out.println("¿Quieres lanzar el dado de nuevo? (s/n)");
            String respuesta = scanner.nextLine().trim().toLowerCase();

            // Salir del bucle si la respuesta es negativa
            if (!respuesta.equals("s")) {
                break;
            }

            // Esperar un poco antes del próximo lanzamiento (opcional)
            System.out.println("Lanzando el dado de nuevo...");
            System.out.println();

        } while (true); // El bucle se ejecutará hasta que se rompa con una respuesta negativa

        System.out.println("¡Gracias por jugar!");
        scanner.close();
    }
}
