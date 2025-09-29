import java.util.Scanner;
public class thiago_lafora_T7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3;

        System.out.println("Pon el primer numero");
        num1 = sc.nextDouble();
        System.out.println("Pon el segundo numero");
        num2 = sc.nextDouble();
        System.out.println("Pon el tercer numero");
        num3 = sc.nextDouble();

        if (num1 > num2 &&  num1 > num3) {
            System.out.println("El numero mayor es: " + num1);
        } 
        else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero mayor es: " + num2);
        } 
        else {
            System.out.println("El numero mayor es: " + num3);
        }
    }
}
