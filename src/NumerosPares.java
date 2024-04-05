public class NumerosPares {
    public static void main(String[] args) {
        int numero = 0;


        while (numero <= 100) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
