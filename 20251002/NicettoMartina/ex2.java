import java.util.Scanner;

public class ex2 {
     public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);    
    int dosi;
    System.out.println("Cuantas dosis necesitas? ");
    dosi=sc.nextInt();

   for (int contador=0; contador < dosi; dosi--)
   {
    System.out.println("Cuantas dosis faltan? " + (dosi-1));
   }
   System.out.println("Ya estas curado!! ");
    

}
}