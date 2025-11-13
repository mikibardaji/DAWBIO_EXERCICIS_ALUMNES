import java.util.Scanner;
public class modular6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        int mayor;
        
        System.out.println("dame el primer valor");
        num1 = sc.nextInt();
        System.out.println("dame el segundo valor");
        num2 = sc.nextInt();

        mayor = MayMenIg(num1, num2);

        numMayor(mayor, num1, num2);

        sc.close();
    }

    public static int MayMenIg(int x, int y) {
        int resultado = 0;

        if (x > y) {
            resultado = 1;
        } else if (x < y) {
            resultado = -1;
        }
            
        return resultado;
    }

    public static int numMayor(int x, int num1, int num2) {

        if (x == 1) {
            System.out.println("el numero mayor es " + num1);
        } else if (x == -1) {
            System.out.println("el numero mayor es " + num2);
        } else {
            System.out.println("Tienen el mismo valor " + num1 );
        }
        return num1;
    }
} 
