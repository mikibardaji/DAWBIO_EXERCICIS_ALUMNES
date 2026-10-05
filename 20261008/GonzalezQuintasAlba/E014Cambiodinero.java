
package cambiodinero;

import java.util.Scanner;

/**
 *
 * @author albagonzalezquintas1985
 */
public class Cambiodinero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int euros, moneda = 0;
        double newmoneda=0;
        System.out.println("Introduzca el importe en euros");
        Scanner lector = new Scanner(System.in);
        euros = lector.nextInt();
        System.out.println("Escriba el número correspondiente a la moneda que desea convertir el importe en euros: ");
        System.out.println("1 - dolares estadounidenses\n 2-Libras esterlinas\n 3-Yen japones\n 4-Franco suizo\n 5-Yuan chino\n 6-Dolar canadiense\n");
        moneda = lector.nextInt();
        switch (moneda) {
            case 1: 
                newmoneda=euros*1.12;
                System.out.println(euros + "€ equivale a "+newmoneda+" dolares americanos.");
                break;
            case 2:
                newmoneda=euros*0.85;
                System.out.println(euros + "€ equivale a "+newmoneda+" libras esterlinas.");
                break;
            case 3:
                newmoneda=euros*177.21;
                System.out.println(euros + "€ equivale a "+newmoneda+" yen japones");
                break;
            case 4:
                newmoneda=euros*0.93;
                System.out.println(euros + "€ equivale a "+newmoneda+" francos suizos.");

                break;
            case 5:
                newmoneda=euros*7.52;
                System.out.println(euros + "€ equivale a "+newmoneda+" yuanes chino.");

                break;
            case 6:
                newmoneda=euros*1.60;
                System.out.println(euros + "€ equivale a "+newmoneda+" dolares canadienses.");
                break;
            default:
                System.out.println("Moneda no valida");
                

        }
    }
    
}
