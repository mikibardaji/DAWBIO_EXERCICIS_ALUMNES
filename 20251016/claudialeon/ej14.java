package bucles;
import java.util.Random;
import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
    //Programa on l'usuari pensa un numero y el programa intenta adivinarlo
    //Quan fa l'intent le de dir mes gran o mes petit
    Scanner sc= new Scanner(System.in);
    Random rd = new Random();
    int acum_intent=0;
    int min=1;
    int max=100;
    int nummaq, numusuari, estimacio;
    int estimaciogran=0;
    int estimaciopetit=0;
    System.out.print("Di un numero de 1 al 100: ");
        numusuari= sc.nextInt();
    do{
       nummaq= rd.nextInt(max-min+1)+min;
       System.out.println("Penso que es el numero: " + nummaq);
       acum_intent++;
       if(nummaq==numusuari){
        System.out.println("He adivinat el numero!");
        break;
       }
       System.out.println("Donam una pista, 1 mes petit o 2 mes gran");
       estimacio= sc.nextInt();
       if (estimacio == 1){
        max= nummaq-1;
        System.out.println("El numero es més petit");
        estimaciopetit++;
       }
       else if (estimacio==2){
        System.out.println("El numero es més gran");
        min= nummaq+1;
        estimaciogran++;
       }
    }while (nummaq!=numusuari);
    
    System.out.println("El numero de intents han sigut: " + acum_intent);
    System.out.println("He dit un numero més gran: " + estimaciopetit + " vegades.");
    System.out.println("He dit un numero més petit: " + estimaciogran + " vegades.");
    System.out.println("S'ha acabat el joc");
}
}
