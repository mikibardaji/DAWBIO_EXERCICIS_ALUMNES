import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        int edad=pidedad();
        
        mayoredad(edad);

    }
    public static int pidedad(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu edad: ");
        int x=sc.nextInt();
        return x;
    }
    public static boolean mayoredad(int x)
    {
     if(x<18)
     {
        System.out.println("Eres menor de edad");
    }
    else if (x>=18)
    {
        System.out.println("Eres mayor de edad");
    }
    return true;
    }
     
}
