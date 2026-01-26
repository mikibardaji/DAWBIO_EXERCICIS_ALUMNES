import java.util.Random;
public class ej5 {
    public static void main(String[] args) {
        //El mismo programa que el anterior pero luego muestre por separado la suma de todos los valores positivos y negativos.
        int[] valores;
        valores = new int[20];

        NumerosRandom(valores);
        System.out.println("");
        MostrarArray(valores);
        System.out.println("");
        PosNeg(valores);
        System.out.println("");
        SumaDePosYNeg(valores);


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
    public static void SumaDePosYNeg(int valores[]){
        int positivos = 0;
        int negativos = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > 0) {
                positivos = positivos + valores[i];
            } else if (valores[i] < 0) {
                negativos = negativos + valores[i];
            }
        }
        System.out.println("Los numeros negativos suman " + negativos);
        System.out.println("Los numeros positivos suman " + positivos);
    }
 }
