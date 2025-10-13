import java.util.Scanner;

public class Nparells {
    public static void main(String[] args) throws Exception {
        
    // 3.	Programa que entra un número natural N i mostra els números parells compresos entre 1 i N. Per fer-ho utilitzeu un comptador i suma de 2 en 2.

    int num;

    Scanner sc = new Scanner(System.in);
    System.out.println("Digues un número NATURAL a l'atzar:");
    num=sc.nextInt();    

    System.out.println("Els números parells entre 1 i "+num+" son:");

    for  (int i=0; i<=num; i=i+2){
    
        System.out.print(i+" " );
    }
    sc.close();

    }
}

    
