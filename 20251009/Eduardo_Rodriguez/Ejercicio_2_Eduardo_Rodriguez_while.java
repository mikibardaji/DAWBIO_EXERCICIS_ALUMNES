import java.util.Scanner;

public class Ejercicio_2_Eduardo_Rodriguez_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dosis;

        System.out.println("Cuantas son las dosis que necesitas? ");
        dosis= sc.nextInt();


        while (dosis!=1);{
            
        System.out.println("te administramos una dosis, estas son las que te faltan: "+ (dosis-1));
        dosis = dosis - 1;
        }
        System.out.println("Se acabo la medicacion");
        
    }
}

