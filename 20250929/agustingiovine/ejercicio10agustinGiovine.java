/*10. Programa que calcula el salario neto mensual de un trabajador en función del número de horas trabajadas y la tasa de impuestos de acuerdo con las siguientes hipótesis:
• Las primeras 130 horas se pagan a tarifa normal (15,00 €/h).
• Las horas que pasen de 130 se pagan a 1,5 veces la tarifa normal.
• Las tasas de impuestos son:
◦ Los 500 primeros euros son libres de impuestos.
◦ Los 400 siguientes tienen un 25% de impuestos.
◦ El resto un 45% de impuestos. Escribir nombre, salario bruto, tasas y salario neto.
*/      

import java.util.Scanner;

public class ejercicio10agustinGiovine {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    
    double salario = 0;
    double horasTrabajadas;
    double horasExtras = 0;
    double impuestos1 = 0;
    double impuestos2 = 0

        System.out.println("cuantas horas trabajaste este mes?");
        horasTrabajadas = sc.nextDouble();

        if (horasTrabajadas <= 130) {
            salario = horasTrabajadas * 15;
                
            System.out.println("tu salario es de " + salario);
        } else if (horasTrabajadas > 130) {
            salario = 130 * 15;
            horasExtras = (horasTrabajadas - 130) * (1.5 * 15);

               System.out.println(salario = salario + horasExtras);
        }

        if (salario > 500){
            impuestos1 = 400 * 0,25;
        }

        if (salario > 900) {
            impuestos2 = (salario - 900) * 0,45;
        }

        System.out.println("el salario total es de " + (salario - impuestos1) - impuestos2);
        System.out.println("salario bruto " + salario);
        System.out.println("las tazas de impuestos son " + impuestos1 + "$ ," + impuesto2 + "$");
    sc.close();
    }
}
