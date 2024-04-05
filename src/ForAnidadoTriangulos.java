import java.util.Scanner;
public class ForAnidadoTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del triángulo (número de filas): ");
        int tamaño = scanner.nextInt();
        scanner.close();


        for (int i = 1; i <= tamaño; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
