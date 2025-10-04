import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int año = sc.nextInt();

        // System.out.println("Introdueix el teu any de naixement:");

        // String categoria;

        // if (año>= 2011 && año <=2012 ) {
        //     categoria = "S14";
        // }

        // else if (año >= 2009 && año <= 2010) {
        //     categoria = "S14";
        // }

        // else if (año >= 2007 && año <= 2008 ){
        //     categoria = "S14";
        // }

        // else if (año >= 1991 && año <= 2006){
        //     categoria = "S14";
        // }

        // else if (año >= 1924 && año <= 1990){
        //     categoria = "S14";
        // }

        // else {
        //     categoria = "Sense categoria";
        // }

        // sc.close();



        // System.out.print("Introdueix el teu pes:");
        
        // double pes = sc.nextDouble();
        // int respuesta;

        // System.out.println("\n--- Menu de Medicaments ---");
        // System.out.println("0.Ibuprofeno");
        // System.out.println("1.Xarelto");
        // System.out.println("2.Amoxicilina");
        // System.out.println("3.Fluoxetina");

        // System.out.println("Introdueix el medicament (Ibuprofeno(0), Xarelto(1), Amoxicilina(2), Fluoxetina(3)): ");
        // respuesta = sc.nextInt();
        // sc.close();

        // switch (respuesta) {
        //     case 0:
        //         if (pes < 70) {
        //             System.out.println("La dosi recomanada es de 500 mg.");
        //         }
        //         else {
        //             System.out.println("La dosi recomanada es de 1g.");
        //         }
                
        //         break;

        //     case 1:
        //         if (pes < 60) {
        //                 System.out.println("La dosi recomanada es de 10mg.");
        //             } 
        //             else if (pes >= 60 && pes <= 80) {
        //                 System.out.println("La dosi recomanada es de 15mg.");
        //             } 
        //             else {
        //                 System.out.println("La dosi recomanada es de 20mg.");
        //             }

        //         break;
        //     case 2:
        //         if (pes < 65 ){
        //             System.out.println("La dosi recomenada es de 500mg.");
        //         }
        //         else {
        //             System.out.println("La dosi recomenada es de 1g.");
        //         }

        //         break;
        //     case 3:
        //         if (pes < 80 ){
        //             System.out.println("La dosi recomenada es de 20mg.");
        //         }
        //         else {
        //             System.out.println("La dosi recomenada es de 40mg.");
        //         }
        //         break;
        
        //     default:
        //         break;
        // }



        System.out.print("Cuantas entradas quieres comprar?: ");
        int entradas = sc.nextInt();
        sc.close();
        int precio = 5;
        double Descuento1 = (entradas * precio) *  0.90;
        double descuento2 = (entradas * precio) * 0.95;
        double precioTotal = entradas * precio;
        double iva = 0.21;
        double precioConIva = precioTotal + (precioTotal * iva);
        double cantidad = entradas;

        switch (entradas) {
            case 1:
                precioTotal = precio;
                System.out.println("Se han comprado " + cantidad + " entradas. con un precio total sin IVA de " + precioTotal + " euros. Con IVA: " + precioConIva + " euros.");
                break;
            case 2:
                precioTotal = precio + Descuento1;
                precioConIva = precioTotal + (precioTotal * iva);
                System.out.println("Se han comprado " + cantidad + " entradas. con un precio total sin IVA de " + precioTotal + " euros. Con IVA: " + precioConIva + " euros.");
                break;
            case 3,4,5,6,7,8,9,10,11,12,13,14,15:
                if (entradas >= 3) {
                    precioTotal = precio + descuento2;
                    precioConIva = precioTotal + (precioTotal * iva);
                }
                System.out.println("Se han comprado " + cantidad + " entradas. con un precio total sin IVA de " + precioTotal + " euros. Con IVA: " + precioConIva + " euros.");
            
            default:
                break;
        }
    }
    
 }
