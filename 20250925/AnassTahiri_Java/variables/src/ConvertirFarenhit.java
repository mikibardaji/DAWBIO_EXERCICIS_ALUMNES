import java.util.Scanner;

public class ConvertirFarenhit {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        double Fahrenheit ,Celsius;

        System.out.println("Cual es la temperatura Farenhit " );
         Fahrenheit  = sc.nextDouble();

         Celsius = (5.0/9.0) * (Fahrenheit  - 32);
        System.out.println("La temperatura en grados es : " + Celsius);




   
        
    }
}
 