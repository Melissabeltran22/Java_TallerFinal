public class ArrayUserData {
    public static void main(String[] args) {
        String[] keys = {"ID", "Nombre", "Apellido", "Email", "Contraseña"};
        String[] userData = {"1", "Pepito", "Perez", "pepito@mail.com", "xyz123"};

        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i] + ": " + userData[i]);
        }
    }
}
