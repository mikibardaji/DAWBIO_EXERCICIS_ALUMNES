import java.util.Scanner;

public class bucles5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creo un bucle el  el valor i inicie con el valor 10 
        //si el valor es mayor a 0 que se ejecute
        //cada vez que se ejecute el programa resto un 1 a i
        //muestro cada valor de i de cada vez que se ejecuta el bucle
        
        System.out.println("preparando el quirofano en ");
    /*     
        for(int i = 10; i > 0; i = i - 1){
            System.out.println("preparado en " + i + "...");
        };
    */

        int i = 10;
        do {
            System.out.println("preparado en " + i + "...");
            i = i - 1;
        } while (i > 0);
        System.out.println("quirofano listo comienza la intervension");


        sc.close();
    }   
}
