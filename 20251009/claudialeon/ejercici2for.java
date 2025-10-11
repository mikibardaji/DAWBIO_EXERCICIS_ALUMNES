import java.util.Scanner;
public class ejercici2for {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numero;
        System.out.print("Quantes dosis necessites? ");
        numero = sc.nextInt();
    for (int dosis=numero; dosis>0 ; dosis--){
        System.out.println("Dosis administrada et falten " + (dosis-1) + "...");
    }
    System.out.println("Ja estas curat!");
}
}
