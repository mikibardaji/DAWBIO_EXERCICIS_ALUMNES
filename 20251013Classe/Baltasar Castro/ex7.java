import java.util.Scanner;

public class ex7 {
public static void main(String[] args) {
    //El programa llegeix 20 valors de tensió arterial (no nuls) i, en acabar, 
    //mostra un missatge indicant si s’ha detectat algun valor crític —és a dir, si algun valor 
    //ha estat negatiu, cosa que indicaria un error de mesura o un pacient fictici. Al final ha de dir quants valors critics hi ha. 
      
    Scanner sc = new Scanner(System.in);
        int valor;
        int valorsmal = 0;  

        System.out.println("Introdueix 20 valors de tensió arterial (no nuls):");

        for (int i = 1; i <= 20; i++) {
            System.out.print("Valor " + i + ": ");
            valor = sc.nextInt();

            if (valor == 0) {
                System.out.println(" El valor no pot ser 0");
                i--; 
                continue;
            }

            if (valor < 0) {
                valorsmal++;
            }
        }

        
        if (valorsmal > 0) {
            System.out.println("\nS'han detectat " + valorsmal + " valors crítics ");
        } else {
            System.out.println("Valor malo");
        }

        sc.close();
    }
}
