import java.util.Scanner;
public class EJ10 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int contador;
        double temperatura;

        for (contador = 0; contador < 6; contador++) {
        System.out.println("Pon tu temperatura actual");
        temperatura = sc.nextDouble();
         if (temperatura >= 36.5){
            break;
         }
    } 
    System.out.println("Se tomaron " + contador + " medidas");
    sc.close();
        
    }
}
