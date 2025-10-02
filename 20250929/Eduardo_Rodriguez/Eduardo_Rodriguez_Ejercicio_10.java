import java.util.Scanner;

public class Eduardo_Rodriguez_Ejercicio_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double horas = 0;
        double pago = 15.0;
        double salario = 0;

        System.out.println("Introduce cuantas horas trabajaste: ");
        horas = sc.nextDouble();

        if (horas <= 130) {
            salario = horas * pago;
        } 
        else {
            salario = 130 * pago + ((horas - 130) * pago * 1.5);
        }

        double impuestos = 0;
        if (salario <= 500) {
            impuestos = 0;
        } else if (salario <= 900) {
            impuestos = (salario - 500) * 0.25;
        } else {
            impuestos = (400 * 0.25) + ((salario - 900) * 0.45);
        }

        double salarioimp = salario - impuestos;

        System.out.println("Salario bruto: " + salario);
        System.out.println("Salario con impuestos: " +  salarioimp);
        
    }
}
