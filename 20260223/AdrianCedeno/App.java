import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

    ejercicio();
    }

public static void ejercicio(){
    try{
        double[] lista = {1,4,22,6,1};

        for (int i = 0; i < 6; i++){
            System.out.println(lista[i]);
        }
    }

    catch(Exception e){
        System.out.println("Mensaje error: " + e.getMessage());
    }
}

public static void ejercicio2(){
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int posicion = 0;
    int[] lista = {rd.nextInt(1,11),
                   rd.nextInt(1,11),
                   rd.nextInt(1,11),
                   rd.nextInt(1,11),
                   rd.nextInt(1,11)};
    do{
        try{
            System.out.println("Que posicion quieres ver?");
            System.out.println("Para salir introduzca un valor negativo!");
            posicion = sc.nextInt();

            System.out.println("Valor: " + lista[posicion]);
        }catch(Exception e){
            System.out.println("Mensaje error: "+ e.getMessage());
        }
    }while(posicion>0);
}



}