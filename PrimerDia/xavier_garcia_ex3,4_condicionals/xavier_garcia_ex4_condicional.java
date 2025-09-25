import java.util.Scanner;

public class xavier_garcia_ex4_condicional {
    //variable num
    //preguntar num
    //si num es negativo mostrar es negativo
    //si num es positivo mostrar es positivo
    //si num es 0 mostrar es 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("introduce un numero");
        num = sc.nextInt();
        if (num < 0) {
            System.out.println(num + " es negativo");
        } else if (num > 0) {
            System.out.println(num + " es positivo");
        } else {
            System.out.println("es 0");
        }

    }
}
