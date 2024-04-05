import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegoTriqui {
    public static void main(String[] args) {
        char[][] tablero = new char[3][3]; // Matriz 3x3 para el tablero
        inicializarTablero(tablero); // Inicializar el tablero con espacios en blanco

        char jugadorActual = 'X'; // Comienza el jugador 'X'
        boolean juegoEnCurso = true;
        Scanner scanner = new Scanner(System.in);

        // Ciclo principal del juego
        while (juegoEnCurso) {
            // Mostrar el estado actual del tablero
            mostrarTablero(tablero);

            // Solicitar la jugada al jugador actual
            try {
                System.out.println("Jugador " + jugadorActual + ", ingrese la fila (1-3) y columna (1-3) separadas por espacio:");
                int fila = scanner.nextInt() - 1; // Restar 1 para ajustar a índice de matriz (0-2)
                int columna = scanner.nextInt() - 1; // Restar 1 para ajustar a índice de matriz (0-2)

                // Verificar si la posición seleccionada está disponible
                if (esPosicionValida(tablero, fila, columna)) {
                    tablero[fila][columna] = jugadorActual; // Realizar el movimiento del jugador

                    // Verificar si hay un ganador o si el tablero está lleno
                    if (hayGanador(tablero, jugadorActual)) {
                        mostrarTablero(tablero);
                        System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                        juegoEnCurso = false; // Terminar el juego
                    } else if (tableroLleno(tablero)) {
                        mostrarTablero(tablero);
                        System.out.println("¡Empate! No hay ganador.");
                        juegoEnCurso = false; // Terminar el juego
                    } else {
                        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X'; // Cambiar al siguiente jugador
                    }
                } else {
                    System.out.println("Posición inválida o ocupada. Inténtelo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Debe ingresar números enteros.");
                scanner.nextLine(); // Limpiar el búfer del scanner
            }
        }

        scanner.close();
    }

    // Método para inicializar el tablero con espacios en blanco
    public static void inicializarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = ' '; // Espacio en blanco representa casilla vacía
            }
        }
    }

    // Método para mostrar el estado actual del tablero
    public static void mostrarTablero(char[][] tablero) {
        System.out.println("-------------");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Método para verificar si la posición seleccionada es válida y está disponible
    public static boolean esPosicionValida(char[][] tablero, int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ';
    }

    // Método para verificar si hay un ganador en el tablero
    public static boolean hayGanador(char[][] tablero, char jugador) {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
                    (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                return true;
            }
        }
        // Verificar diagonales
        return (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
                (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador);
    }

    // Método para verificar si el tablero está lleno (empate)
    public static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false; // Todavía hay casillas vacías
                }
            }
        }
        return true; // El tablero está lleno
    }
}

