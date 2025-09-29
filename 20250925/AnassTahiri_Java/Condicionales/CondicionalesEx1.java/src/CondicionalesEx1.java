import java.util.Scanner;

public class CondicionalesEx1 {
    public static void main(String[] args) {
       
        // pedir codigo trabajador
        Scanner sc = new Scanner(System.in);
        int codigo;
        //si codigo es 1
        System.out.println("Que codigo  tienes? ");
        codigo = sc.nextInt();

        if (codigo==1) {
           System.out.println("Eres estudiante? ");
            System.out.println("No llegues Tarde a clase");
        }
        if(codigo==2){
            System.out.println("Eres profesor");
            System.out.println("Corrige bien");
        }

        else if(codigo==3){
            System.out.println("Eres del equipo directivo? ");
        }

        else {
            System.out.println("Eres de la limpieza?");
        }

    }
}
