import java.util.Scanner;

public class ex_7 {
 public static void main(String[] args) {

        float total = preusTotals();
        float preuFinal = preuAmbIva(total);
        System.out.printf("El preu total amb IVA inclòs és: " + preuFinal);
    }


    public static float preusTotals(){
        Scanner sc = new Scanner(System.in);
        float total = 0f;

        while (true){
            System.out.print("Introdueix el preu de l'article (o 0 per acabar): ");
            float preu = sc.nextFloat();

            if (preu == 0f){
                break;
            } else {
                total += preu;
            }
        }

        sc.close();
        return total;
    }

    public static float preuAmbIva(float preu){
        return preu * 1.21f;
    }
}
