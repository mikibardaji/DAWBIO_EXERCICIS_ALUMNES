import java.util.Scanner;

public class GuerreroMateoEx10 {
    public static void main(String[] args) throws Exception {
        String nombre;
        double horas;
        double precioHora = 15.00;
        double salarioBruto;
        double impuestos;

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, introduzca su nombre y total de horas trabajadas:");
        nombre = sc.nextLine();
        horas = sc.nextDouble();

        if (horas <=130) {
            salarioBruto = horas * precioHora;
            
        }else{
            salarioBruto = 130 * precioHora + (horas - 130) * precioHora * 1.5;
        }

        // Impuestos

        if (salarioBruto <=500) {
            impuestos = 0;
            
        }else if (salarioBruto<= 900) {
            impuestos = (salarioBruto - 500) * 0.25;
            
        }else{
            impuestos = (400 * 0.25) + ((salarioBruto - 900) * 0.45);
        }

        double salarioNeto = salarioBruto - impuestos;

        System.out.println("nombre: " +nombre);
        System.out.println("Salario bruto: " +salarioBruto);
        System.out.println("Impuestos: "+impuestos);
        System.out.println("Salario neto: "+salarioNeto);

    }
    
}
