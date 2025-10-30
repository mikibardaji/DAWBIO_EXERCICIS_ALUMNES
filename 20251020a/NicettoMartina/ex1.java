import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        double resultado;
        double num1,num2;
        double n,N;

        num1= pedirnumero(1);
        num2=pedirnumero(2);
       

        resultado= producto(num1,num2);

        System.out.println("El resultado es " + resultado);
    }

    public static double producto(double x, double y)
    { 
       double multi=x*y;
       return multi;
    };
      
    public static double pedirnumero(int x)
    {
        double n;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("Dime un numero "+ x);
        n=sc.nextDouble();
        }while(n<0); 
        
        return n;
    
    }

}

