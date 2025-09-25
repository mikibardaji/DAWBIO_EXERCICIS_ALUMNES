import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        
    // Pedir Nota
    Scanner sc = new Scanner(System.in);
    double nota;

    System.out.println("Que nota tu tiene'?: ");
    nota = sc.nextDouble();
    
    if (nota>0 && nota<4.99)
    {
    System.out.print("Has suspendido");
    }
    else if (nota>5 && nota<5.99)
    {
    System.out.print("Has aprovado");
    }
    else if (nota>6 && nota<8.99)
    {
    System.out.print("Has aprovado con un notable");
    }
    else if (nota>9 && nota<10)
    {
    System.out.print("Has aprovado con un Excelente, Felicidades!");
    }
    sc.close();
    }
}
