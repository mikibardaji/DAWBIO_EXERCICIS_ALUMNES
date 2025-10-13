import java.util.Scanner;

public class ex3 {
     public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    int num;
    System.out.println("Dime un numero ");
    num=sc.nextInt();
   
   for (int contador=2; contador <= num; contador++)
   {
      if (contador%2==0)
      {
         System.out.println("El numero es pari " + contador);
      }
   
   }

}
} 
