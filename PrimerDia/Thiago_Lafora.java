import java.util.Scanner;

//Thiago Lafora

public class App {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
               double nota;
        
               System.out.println("Que nota sacaste en el examen?");
               nota = sc.nextDouble();

 
    if (nota>=0 && nota<=4.99)                

    {
        System.out.println("Desafortunadamente has suspendido");

    }
    else if (nota==5 && nota<=5.99)
    {
        System.out.println("Conseguiste aprobar");
        
    }
    else if(nota<=6 && nota<=8.99)

    {
        System.out.println("Sacaste una nota notable");
    }
    else if(nota==9 && nota<=10)

    {
        System.out.println("Tienes un sobresaliente");
        
    }
    else 
    {
        System.out.println("La nota introducida no es valida");
    }
    sc.close();
 }
 }
