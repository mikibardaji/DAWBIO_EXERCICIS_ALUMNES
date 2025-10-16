import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int contador;
        double temperatura;

        for (contador = 0; contador < 6; contador++) {
        System.out.println("Pon la temperatura actual");
        temperatura = sc.nextDouble();
         if (temperatura >= 36.5){
            break;
         }
    } 
    System.out.println("Se han tomado " + contador + " medidas");
    sc.close();
    }
}