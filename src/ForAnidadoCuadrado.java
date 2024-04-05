import java.util.Scanner;

public class ForAnidadoCuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado (número de filas y columnas): ");
        int tamaño = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= tamaño; i++) {
            for (int j = 1; j <= tamaño; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
