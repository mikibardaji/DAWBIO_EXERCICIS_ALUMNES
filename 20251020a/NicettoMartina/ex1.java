import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
       double  resultado= respuesta();
        System.out.println("El producto es " + resultado);

    }

    private static double respuesta()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero ");
        double num1=sc.nextDouble();
        System.out.println("Dime un numero ");
        double num2=sc.nextDouble();

       double producto=num1*num2;
       return producto;

    }
      

}
