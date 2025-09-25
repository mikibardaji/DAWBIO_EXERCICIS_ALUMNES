import java.util.Scanner;

public class mayor {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double num1,num2;
        System.out.print("dime el primer numero ");
        num1 =sc.nextDouble();
        System.out.print("dime el segundo numero");
        num2 =sc.nextDouble();
        if (num1>num2) {
            System.out.print("el "+num1+" es mayor que "+num2);
        }else{
            System.out.print("el "+num2+" es mayor que "+ num1);
        }
    }
}
