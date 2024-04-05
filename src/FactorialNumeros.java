public class FactorialNumeros {
    public static void main(String[] args) {
        // Para calcular y mostrar el factorial de los números del 1 al 10:
        for (int i = 1; i <= 10; i++) {
            long factorial = calcularFactorial(i); // Para calcular el factorial de i
            System.out.println("Factorial de " + i + " = " + factorial);
        }
    }

    // Método para calcular el factorial de un número dado
    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // El factorial de 0 y 1 es 1
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Multiplicar el factorial actual por i
        }
        return factorial;
    }
}
