/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author guill
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Un museo hace descuento en las entradas a diferentes precios según la temporada y según si el comprador es adulto o jubilado
    El programa pedirá el precio de la entrada.
    El programa debe preguntar al usuario el tipo de entrada (adulto, jubilado) y la temporada (baja, alta). Finalmente, mostrará el descuento a aplicar.
    También al final de todo mostrará el precio de la entrada aplicado el descuento

    El descuento de precios será el siguiente:

    Temporada / Tarifa Adulto(a) Jubilado(j)

    Temporada baja(x) 5% 15%

    Temporada alta(t) 0% 10%

    Se requiere usar estructuras condicionales if-else niats (a partir de sólo un if raíz o un switch, meter dentro otros if's). 
    O sea no se puede hacer un if con dos condiciones dentro del paréntesis

    Hay que documentar en el código la justificación de la estructura escogida.

    Si alguna de las entradas del usuario no es correcta, el programa deberá mostrar el mensaje «opción incorrecta» y no calcular el precio.

    Se valorará el uso de constantes y variables para los datos que lo requieran para evitar la incrustación de datos en medio del código.

        */
    
    /*
    
    */
        final double DESCUENTO_ADULTO_BAJA = 0.05; 
        final double DESCUENTO_JUBILADA_BAJA = 0.15;  
        final double DESCUENTO_ADULTO_ALTA = 0;
        final double DESCUENTO_JUBILADO_ALTA = 0.10;
        double precio = 0;
        int tipo_Entrada = 0, temporada;
        Scanner sc = new Scanner(System.in);
        System.out.println("INDICAME EL PRECIO DE LA ENTRADA");
        precio = sc.nextDouble();
        
        System.out.println("QUE TEMPORADA ASISTIRAS\n SELECCIONA PARA ALTA : 1 \n SELECCIONA PARA BAJA : 2" );
        temporada = sc.nextInt();
        
        if (temporada == 1 || temporada == 2) {
            System.out.println("QUE TIPO DE  ENTRADA ADQUIRIRAS\n SELECCIONA PARA ADULTOS : 1 \n SELECCIONA PARA JUBILADOS: 2" );
            tipo_Entrada = sc.nextInt();
            if (tipo_Entrada ==1 || tipo_Entrada ==2) {
                System.out.println("La temporada elegida es:" );
            
                switch  (tipo_Entrada){
                    case 1:
                        if (temporada == 1) {
                          precio = precio - (DESCUENTO_ADULTO_ALTA * precio);
                            System.out.println("Temporada alta");
                        }else{
                           precio = precio - (DESCUENTO_ADULTO_BAJA * precio);
                            System.out.println("Temporada baja");
                        }
                        break;
                    case 2:
                        if (temporada == 1) {
                          precio = precio - (DESCUENTO_JUBILADO_ALTA * precio);
                            System.out.println("Temporada alta");
                        }else{
                           precio = precio - (DESCUENTO_JUBILADA_BAJA * precio);  
                        System.out.println("Temporada baja");
                        }

                        break;
                    default:


                }
                System.out.println("El costo de tu entrada  es: " +precio);
            }else{
                System.out.println("Entrada No Valida");
            }
        }else{
            System.out.println("Temporada no valida");
        }    
              
    }  
    
    
}
    
    

