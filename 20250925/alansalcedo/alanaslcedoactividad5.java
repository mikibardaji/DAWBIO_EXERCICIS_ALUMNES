import java.util.Scanner;

public class alanaslcedoactividad5 {
    public static void main(String[] args) {
        //hacer que dos numeros se pongan de manera acendente 
        //poner variables
        //hacer escoger la variables
        //hacer que se ordenen de manera acendente
        // fin de la practica
        int variable1,variable2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("escoger el primer numero:");
        variable1 = scanner.nextInt();
        System.out.print("escoger el segundo numero:");
        variable2 = scanner.nextInt();
        if (variable1 < variable2) {
            System.out.println("Orden ascendente: " + variable1 + "," + variable2);
        } else if (variable1 > variable2) {
            System.out.println("Orden ascendente: " + variable2 + "," + variable1);
        } else {
            System.out.println("Los dos números son iguales: " + variable1);
        }

    }
}
