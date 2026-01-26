import java.util.Random;

public class ej4 {
    public static void main(String[] args) {
        // Crea un programa que pida veinte números enteros por teclado ( o los ponga un aleatorio pero debe dar aleatoris negativos y positivos) , los almacene en un array y luego muestre CUANTOS VALORES HAY POSITIVOS, Y CUANTOS NEGATIVOS.

        int[] valores;
        valores = new int[20];

        NumerosRandom(valores);
        MostrarArray(valores);
        PosNeg(valores);


    }
    public static void NumerosRandom(int valores[]) {
        Random rd = new Random();
        for (int i = 0; i < valores.length; i++) {
            valores[i] = rd.nextInt( -100, 101);

        }
    }
    public static void PosNeg(int valores[]){
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > 0) {
                positivos = positivos + 1;
            } else if (valores[i] < 0) {
                negativos = negativos + 1;
            } else {
                ceros = ceros + 1;
            }

        }
        System.out.println("hay " + negativos + " numeros negativos");
        System.out.println("hay " + positivos + " numeros positivos ");
        System.out.println("hay " + ceros + " numeros ceros ");
    }
    public static void MostrarArray(int valores[]) {
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " / ");
        }
        System.out.println("");
    }
 }
