import java.util.Scanner;

public class nota {
    //0-4'99 Suspenso
    //5-5'99 Aprobado
    //6-8'99 Notable
    //9-10 Excelente
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        double nota;
        System.out.println("Introdcuce la nota: ");
        nota = sc.nextDouble();

        if (nota>=0 && nota<=4.99)
        {
          System.out.println("Tienes un suspenso");  
        }
        else if (nota>=5 && nota<=5.99)
        {
            System.out.println("Tienes un aprobado");
        }
        else if (nota>=6 && nota<=8.99)
        {
            System.out.println("Tienes un notable");
        }
        else if (nota>=9 && nota<=10)
        {
            System.out.println( "Tienes un excelente");
        }
        else
        {
            System.out.println("Esta nota no es válida");
        }

    }
    
}
