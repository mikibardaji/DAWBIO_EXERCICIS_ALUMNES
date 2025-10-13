import java.util.Scanner;

public class ejercicio2AgustinGiovine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaro las variables hora = 0 y dosis
        //le pido al usuario el valor de la cantidad de dosis
        //creo un bucle de while o for que cuando el valor de dosis llegue a 0 se detenga 
        

        int hora = 0;
        int dosis;

   
        System.out.println("Cuantas dosis debes de tomar? ");
        dosis = sc.nextInt();
    /*
        do { 

            System.out.println(hora + "hs te quedan por tomar " + dosis + " dosis");
            dosis = dosis - 1;
            hora = hora + 1;
        } while (dosis != 0);
        
        System.out.println("Ya estas curado!!");
    */


        for (; dosis > 0; dosis = dosis - 1) {
            System.out.println(hora + "hs te quedan por tomar " + dosis + " dosis");
            hora = hora + 1; 
        }

        System.out.println("Ya estas curado!!");
        sc.close();
    }   
}