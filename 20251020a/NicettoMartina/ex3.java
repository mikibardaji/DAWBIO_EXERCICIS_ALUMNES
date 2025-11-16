import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        int num1=pidenum();
        int num2=pidenum();
        
        numayor(num1,num2);

    }
    public static int pidenum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero: ");
        int x=sc.nextInt();
        return x;
    }
    public static int numayor(int x, int y)
    {
        int nummayor;
     if(x<y)
     {
        nummayor=y;
        System.out.println("El numero mayor es "+ y);
    }
    else 
    {
        nummayor=x;
        System.out.println("El numero mayor es " + x);
    }
    return nummayor;
    }
     
}

