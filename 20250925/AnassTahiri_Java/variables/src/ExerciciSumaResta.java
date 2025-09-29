import java.util.Scanner;

public class ExerciciSumaResta {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
      int oper1,oper2,suma;
      double division;

      System.out.print("Operador 1 ");
      oper1 = sc.nextInt();
      System.out.print("Operador 2 ");
      oper2 = sc.nextInt();

      suma= oper1 + oper2;
      division = (double)oper1/oper2;


      System.out.println("La suma es " + suma);
      System.out.println("La divison es " + division);
        
    }
}
 