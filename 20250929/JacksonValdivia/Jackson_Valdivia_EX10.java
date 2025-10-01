
import java.util.Scanner;



public class salario {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su nombre: ");
        String name = sc.nextLine();

        System.out.println("Introduzca el número de horas trabajadas: ");
        double horas_trabajadas = sc.nextDouble();
        double tarifa = 15.0;
        double pago_aumentado = tarifa * 1.5;

        double salario_bruto;
       

        if (horas_trabajadas <= 130) {
         salario_bruto = horas_trabajadas * tarifa;    
        } else {
            double horas_extra = horas_trabajadas - 130;
            salario_bruto = (130 * tarifa) + (horas_extra * pago_aumentado);
        }
        
        double impuestos = 0;
        double salario_neto = 0;
        double restante = salario_bruto;
        if (restante > 500) {
            salario_neto += 500;
            restante -= 500;
            
        } else {
            salario_neto += restante;
            restante = 0;
            }

        if (restante <= 400) {
            impuestos += restante * 0.25;
            salario_neto += restante;
            restante = 0;
        } else{

            impuestos += 400*0.25;
            salario_neto +=400;
            restante -= 400;

        }

        if (restante > 0) {
            impuestos += restante * 0.45;
            salario_neto += restante;
        }
        salario_neto -= impuestos;


        System.out.println("resultados");
        System.out.println("nombre: " + name);
        System.out.println("salario bruto: " + salario_bruto);
        System.out.println("impuestos: "+ impuestos);
        System.out.println("Salario neto: " + salario_neto);

        


}


}
