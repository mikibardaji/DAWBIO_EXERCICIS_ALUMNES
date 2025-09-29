import java.util.Scanner;
//10.	Programa que calcula el salari net mensual d'un treballador en funció del nombre d'hores treballades i la taxa d'impostos d'acord amb les hipòtesis següents:
// Declara salari brut, taxes i salari net (net = brut- tassas , brut+tassas)
//pones if con las condiciones impuestas
// Mostrar resultado 

public class MartinaNicettoEx10 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         double salario, horas, tassas;
      
        System.out.println("Cuantas horas has trabajado? ");
         horas = sc.nextDouble();
         System.out.println("Cuanto es el salario bruto? ");
         salario = sc.nextDouble();
        
        
        double salarionet; 

        if (horas>130)
        {
           salario= horas *15;
            System.out.println(salario);
        }
        else if (horas>130)
        {
            salario=salario*15*1.5;
            System.out.println(salario);
        }         
        if(salario<500)
        {
            System.out.println("No hay tassas");
            System.out.println("Tu salario es "+ salario);
        }
        else if (salario>500 && salario<900)
        {
            tassas=(salario-500)*0.25;
            salarionet= salario - tassas;
            System.out.println("El salario neto es " + salarionet);
            System.out.println("Tienes que pagar " + tassas + "de tassas");
        }
        else if (salario>900)
        {
            tassas=(salario-900)*0.45;
            salarionet=salario-tassas;
            System.out.println("El salario neto es " + salarionet);
            System.out.println("Tienes que pagar " + tassas + "de tassas");

        }
        
        salario=horas*15;

        }    
}
