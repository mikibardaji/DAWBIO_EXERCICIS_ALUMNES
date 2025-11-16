import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        int num1=pidenum();
        obtensign(num1);

    }
    public static int pidenum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero: ");
        int x=sc.nextInt();
        return x;
    }
    public static int obtensign(int x)
    {
    
     if(x==-1)
     {
        System.out.println("El numero es negativo");
    }
    else if (x==0)
    {
        System.out.println("El numero es 0");
    }
    else if(x==1)
    {
        System.out.println("El numero es positiu");
    }
    else 
     {
        System.out.println("Non valido");
    }

    return x;
    }
     
}
