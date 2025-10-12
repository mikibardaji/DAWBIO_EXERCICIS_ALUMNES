import java.util.Scanner;

public class GuerreroMateoEx2 {
    public static void main(String[] args) {

        int dosis;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas dosis necesitas?");
        dosis = sc.nextInt();
        sc.close();

        for (; dosis>1; --dosis){
            System.out.println("Te quedan " + (dosis -1));
        }
        
        System.out.println("Ya estás curado!");
        
        
        
        

    } 
}
