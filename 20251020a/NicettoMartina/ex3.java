import java.util.Scanner;

public class ex3 {
    
public static void main(String[] args) {
    int menor=men();
    System.out.println("El numero mas pequeño es " + menor );

}

private static int men()
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero ");
        int num1=sc.nextInt();
        System.out.println("Dime un numero ");
        int num2=sc.nextInt();
        int menor;
       if (num1<num2)
       {
           menor=num1;
       }
       else
       {
            menor=num2;
       }
       return menor;
    }

}
