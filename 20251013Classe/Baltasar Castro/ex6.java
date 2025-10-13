import java.util.Scanner;

public class ex6 {
public static void main(String[] args) {
    //El programa llegeix 20 valors de tensió arterial (no nuls) i, en acabar, 
    //mostra un missatge indicant si s’ha detectat algun valor crític —és a dir, si algun valor 
    //ha estat negatiu, cosa que indicaria un error de mesura o un pacient fictici. Al final ha de si hi havia algun valor crític 
      
    Scanner sc = new Scanner(System.in);
        int valor;
        boolean valorsmal = false;  

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
                valorsmal = true;
            }
        }

        
        if (valorsmal) {
            System.out.println("Si hay valores criticos");
        } else {
            System.out.println("Esta bien");
        }

        sc.close();
    }
}


