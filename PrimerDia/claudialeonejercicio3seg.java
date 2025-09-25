import java.util.Scanner;
public class claudialeonejercicio3seg {
     public static void main(String[] args) throws Exception {
     Scanner sc= new Scanner(System.in);
     double nota;
     System.out.print("Que nota has sacado?");
     nota =sc.nextDouble();
        if (nota>=0 && nota<5){
            System.out.println("Has suspendido, estudia mas.");
            }
    else if (nota>=5 && nota<6){
            System.out.println("Has aprobado, esfuerzate mas.");
            }
 
        else if (nota>=6 && nota<9){
            System.out.println("Has aprobado, tienes un notable");
            }
         else if (nota>=9 && nota<10){
            System.out.println("Has aprobado, tienes un excelente.");
            }
            sc.close();
    }
}
