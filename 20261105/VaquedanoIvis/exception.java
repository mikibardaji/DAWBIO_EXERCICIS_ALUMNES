
package cajaregistradora;

import java.util.Scanner;

/**
 *
 * @author iva7943
 */
public class CajaRegistradora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        double precio, precioAcum, valor, total =0;
        String precioString;
        
        System.out.println("Introduce los precios de los productos: ");
        precioString = sc.nextLine();
        
        do {
            System.out.println("Introduce el precio del producto (0 para terminar):");
            precioString = sc.nextLine();

            try {
                
             valor= Double.parseDouble(precioString);

                if (valor != 0) {
                    total += valor;
                }

            } catch (NumberFormatException e) {
                System.out.println("Error de formato, Operación cancelada por seguridad.");
                precioString = "0"; 
            }

        } while (!precioString.equals("0"));

        System.out.println("Total de la compra: " + total + " €");
            
        }
        
    }
    


    
    

