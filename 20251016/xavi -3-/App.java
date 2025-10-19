import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        int respuesta=0;
        int respuestaia=0;
        int min=1;
        int max=100;
        int pista;

        System.out.println("dime el numero q adivinar la ia pendeja 0-100: ");
        respuesta = scanner.nextInt();
        do{ 
            respuestaia = rnd.nextInt(min,max);
            System.out.println("la ia pendeja a dicho: " + respuestaia);
            System.err.println("mas alto o mas bajo? 1-mas alto 2-mas bajo");
            pista = scanner.nextInt();
            if (pista == 1) {
                min = respuestaia + 1;
                
            }else if (pista == 2) {
                max = respuestaia - 1;
                
            }
        }while(respuestaia != respuesta);

        System.out.println("la ia pendeja a adivinado tu numero: " + respuestaia);
        System.out.println("la ia pendeja es la mejor");
        System.err.println("ayuda la ia se esta haciendo una automamada yo no puse eso");
       
    }
}
