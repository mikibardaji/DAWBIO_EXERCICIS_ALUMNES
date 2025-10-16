// Ejercicio 8: Mostrar cadena de 20 letras alternando A y T
public class Ejercicio8 {
    public static void main(String[] args) {
        StringBuilder cadena = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                cadena.append("A");
            } else {
                cadena.append("T");
            }
        }
        System.out.println(cadena.toString());
    }
}
