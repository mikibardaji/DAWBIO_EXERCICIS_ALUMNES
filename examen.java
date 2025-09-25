import java.util.Scanner;
//programa que dice si has suspendido o aprobado
public class examen { 

    public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    int nota;
    System.out.print("Que nota tienes? ");
    nota=sc.nextInt();
        if (nota>=5)
        {
            System.out.println("Has aprobado");
        }
        else
        {
            System.out.println("Has suspendido");
        }
    }
}