import java.util.Scanner;
public class thiago_lafora_T12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char color = sc.nextLine().charAt(0);
        System.out.println("Preguntar por color de semáforo (Rojo, Verde o Amarillo)");
        color = sc.nextLine().charAt(0);

    char R = 'R';
    char V = 'V';
    char A = 'A';

        
        
     if (color == R )
     System.out.println("Detenerse porque el semáforo está en Rojo");
     else if (color == V )
        System.out.println("Avanzar porque el semáforo está en Verde");
    else if (color == A )
        System.err.println("Precaución porque el semáforo está en Amarillo");
    else
        System.out.println("Color no válido");
    sc.close();
       
    }
}
