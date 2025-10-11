import java.util.Scanner;
public class ejercicibucle2do {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
     int numero;
     System.out.print("Quantes dosis necessites? ");
     numero = sc.nextInt();
     do{
        System.out.println("Dosis administrada et falten " + (numero-1) + "...");
        numero--;
     }while (numero!=0);
     System.out.println("Ja estas curat!");
}        
}
