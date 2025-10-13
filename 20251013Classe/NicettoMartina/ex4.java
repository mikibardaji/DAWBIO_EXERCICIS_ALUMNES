import java.util.Scanner;

public class ex4 {
     public static void main(String[] args) throws Exception
   {
    Scanner sc= new Scanner(System.in);
    int num;
    System.out.println("Dime un numero ");
    num=sc.nextInt();
   for (int contador=1; contador <= num; contador++)
   {
      if (contador%2==0)
      {
         System.out.println(contador);
      }
   
   }
}
}