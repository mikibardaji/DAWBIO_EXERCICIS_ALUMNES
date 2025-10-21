import java.util.Scanner;

public class bucles8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declaro las variables a, t y creo unbucle e el cual muestre al usuario el valor de a seguido por el balor de t 20 veces
        
        char a = 'A';
        char t = 'T';

        for (int i = 0; i <= 20; i = i + 1){

            System.out.print(a);
            System.out.print(t);
        };

        int fin = 0;
        do {
            System.out.print(a);
            System.out.print(t);
            fin = fin + 1;
        } while (fin < 20);

        






        sc.close();
    }   
}
