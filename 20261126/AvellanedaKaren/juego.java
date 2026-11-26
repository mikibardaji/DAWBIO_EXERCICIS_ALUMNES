import java.util.Scanner;

public class Avellaneda {

    public static String PrimeraPregunta() {
        Scanner teclat = new Scanner(System.in);

        System.out.println("Quin país té París com a capital, coneguda per la moda?");
        System.out.println("A. Italia");
        System.out.println("B. França");
        System.out.println("C. Espanya");
        System.out.println("D. Alemanya");

        System.out.print("Escriu la resposta completa: ");

        return teclat.nextLine().toUpperCase();
    }

    public static int respostaPrimera(String resposta) {

        resposta = resposta.trim();

        if (resposta.equalsIgnoreCase("França") ||
            resposta.equalsIgnoreCase("Franca")) {
            System.out.println("Correcte! Ets una estrella de la moda!");
            return 1;

        } else if (resposta.equalsIgnoreCase("Italia") ||
                   resposta.equalsIgnoreCase("Itàlia")) {
            System.out.println("Ui! Has anat de compres a Milà!");

        } else if (resposta.equalsIgnoreCase("Espanya")) {
            System.out.println("Ui! T'has quedat a Barcelona!");

        } else if (resposta.equalsIgnoreCase("Alemanya")) {
            System.out.println("Ui! La passarel·la no és a Berlín!");

        } else {
            System.out.println("Resposta no vàlida!");
        }

        return 0;
    }

    public static void main(String[] args) {

        String resposta = PrimeraPregunta();
        int punts = respostaPrimera(resposta);

        System.out.println("Puntuació: " + punts);
    }
}