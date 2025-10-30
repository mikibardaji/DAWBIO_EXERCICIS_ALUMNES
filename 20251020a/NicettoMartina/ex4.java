import java.util.Scanner;

public class ex4 {
    // Programa que demana a l’usuari un nombre enter i mostra si és positiu, zero o negatiu. 
    // Cal crear el mètode int obteSigne(int x), el qual retorna -1, 0 o +1 segons el nombre és negatiu, zero o positiu.

    public static void main(String[] args) {
        
        int v1;
       v1=pedirValor(1);

        int respuesta = signe(v1); 
        mostra(respuesta);
        int num1 = 9;
        mostra(num1);

    
    }
public static int pedirValor(int x)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon el valor " + x +  ": ");
        int num = sc.nextInt();
        return num;
    }

    

        private static int signe(int x) {
        int respuesta;

        if (x < 0) {
            respuesta = -1;
        } else if (x == 0) {
            respuesta = 0;
        } else {
            respuesta = 1;
        }

        return respuesta;
    }
    
        private static void mostra(int x)
        {
            if (x == -1) {
            System.out.println("El número es negatiu");
        } else if (x == 0) {
            System.out.println("El número es zero");
        } else {
            System.out.println("El número es positiu");
        }
        
        }
}
