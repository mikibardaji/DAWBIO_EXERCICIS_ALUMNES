import java.util.Random;

public class ej3 {
    public static void main(String[] args) {
        //3.- Crea un programa que pida veinte números reales por teclado ( o los ponga un aleatorio) , los almacene en un array, y luego lo recorra para averiguar el máximo. Una vez el máximo está bien también acabe encontrando el mínimo. Y mostrarlos por pantalla.
        int[] array;
        array = new int[20];
        NumerosRandom(array);
        MostrarArray(array);

    }

    public static void NumerosRandom(int array[]) {
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(1,101);

        }
    }

    public static void MostrarArray(int array[]){
        int maximo = 0;
        int minimo = 100;
        for (int i = 0; i < array.length; i++) {
            
            System.out.print( array[i] +" - ");
            if (maximo < array[i]) {
                maximo = array[i];
            }
            if (minimo > array[i]) {
                minimo = array[i];
            }
        }
        System.out.println("");
        System.out.println("El numero de valor maximo es " + maximo);
        System.out.println("El numero de valor minimo es " + minimo);        
    }
}
