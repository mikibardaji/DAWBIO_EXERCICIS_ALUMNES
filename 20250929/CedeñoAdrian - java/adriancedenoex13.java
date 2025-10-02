import java.util.Scanner;

public class adriancedenoex13
    {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double euros, money;

        System.out.print("Import en euros: ");
        euros =sc.nextDouble();

        System.out.println("Escoje una moneda para la conversion: ");
        System.out.println("1. Dolares americanos (USD) ");
        System.out.println("2. Yen japones (JPY) " );
        System.out.println("3. Franco suizo (CHF)" );
        System.out.println("4. Yuan chino (CNY) ");

        int opcion =sc.nextInt();
        if (opcion==1){
            money = euros*1.18;
            System.out.println("El valor es de " + money + " USD");
            }
            if (opcion==2){
                money = euros*173;
            System.out.println("El valor es de " + money + " JPY");
            }
            if (opcion==3){
                money = euros*0.94;
            System.out.println("El valor es de " + money + " CHF");
            }
            if (opcion==4){
                money = euros*8.37;
            System.out.println("El valor es de " + money + " CNY");
            }
            sc.close();
            }
        }
