import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double horas;
        double horasExtra;
        double tarifaNormal = 15.0;
        double tarifaExtra = tarifaNormal * 1.5;
        double salarioBruto;

        System.out.print("Introdueix les hores treballades: ");
        horas = sc.nextDouble();

        if (horas <= 130)
        {

            salarioBruto = horas * tarifaNormal;
            
        } 
        
        else 
        {

            horasExtra = horas - 130;
            salarioBruto = (130 * tarifaNormal) + (horasExtra * tarifaExtra);
        
        }

        double impuestos = 0;
        double sobrante1, sobrante2, sobrante3;

        if (salarioBruto <= 500) 
        {

            impuestos = 0;

        } 
        
        else if (salarioBruto <= 900) 
        {

            sobrante1 = salarioBruto - 500;
            impuestos = sobrante1 * 0.25;

        } 
        
        else 
        {

            sobrante2 = 400 * 0.25;
            sobrante3 = (salarioBruto - 400) * 0.45;
            impuestos = sobrante2 + sobrante3;

        }

        double salarioNeto = salarioBruto - impuestos;

        System.out.println("\n--- Resultats ---");
        System.out.println("Salari brut: " + salarioBruto + " euros");
        System.out.println("Impostos: " + impuestos + " euros");
        System.out.println("Salari net: " + salarioNeto + " euros");

        sc.close();
    }
}
