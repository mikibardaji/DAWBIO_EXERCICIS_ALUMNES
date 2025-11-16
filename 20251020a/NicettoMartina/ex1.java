import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        double num1, num2;
        num1=pidenum(1);
        num2=pidenum(2);

        double prodotto=prodotto(num1, num2);

        System.out.println("Il prodotto è " + prodotto);
        
    }
    public static double pidenum(double x){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        x=sc.nextDouble();
        return x;
    }
    public static double prodotto(double x, double y)
    {
     double prodotto;
     prodotto=x*y;
     return prodotto;   
    }
     
}
