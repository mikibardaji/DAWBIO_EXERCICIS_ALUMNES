import java.util.Scanner;

public class claudialeonej13 {
    public static void main(String[] args) {
        //Pedir el importe en euros
        //Mostrar un menú con diferentes monedas
        //Mostras conversió de la moneda elegida
        Scanner sc= new Scanner(System.in); 
        double euros, moneda;
        System.out.print("Import en euros:");
        euros =sc.nextDouble();
        System.out.println("Escull un moneda per a la conversió:");
        System.out.println("1. Dòlars Americans - USD ");
        System.out.println("2. Libra esterlina - GBP ");
        System.out.println("3. Dólar hongkonés - HKD ");
        System.out.println("4. Yen japonés - JPY ");
        int opcion =sc.nextInt();
        if (opcion==1){
            moneda=euros*1.17;
            System.out.println("El valor es de " + moneda + "USD");
            }
            if (opcion==2){
                moneda=euros*0.87;
                System.out.println("El valor es de " + moneda+ "GBP");
            }
            if (opcion==3){
                moneda=euros*9.13;
                System.out.println("El valor es de " + moneda+ "HKD");

            }
            if (opcion==4){
                moneda=euros*174.27;
                System.out.println("El valor es de " + moneda+ "JPY");

            }
            sc.close();
        

    }
}
