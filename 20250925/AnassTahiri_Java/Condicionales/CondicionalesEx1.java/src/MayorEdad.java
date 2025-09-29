import java.util.Scanner;

public class MayorEdad {
    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
        int edad;
      
        System.out.println("Que edad  tienes? ");
        edad = sc.nextInt();

        
        System.out.println("Puedes entrar");
        
        if (edad >= 21){
            System.out.println("Puedes entrar a la Fiesta");
        }
        else{
            System.out.println("No puedes");
        }

    }
}
