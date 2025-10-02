import java.util.Scanner;

public class Ex10_salario 
/*
 * Defino las variables
 * Pido las horas trabajadas
 * Calculo el salario bruto
 * Calculo las tasas según el salario bruto
 * Calculo el salario neto
 * Muestro los resultados
 */
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        double horas, euros, neto, euro_tasas, euro_resta;
        System.out.println("Horas de trabajo: ");
        horas = sc.nextDouble();

        if (horas<= 130)
        {
            euros= horas *15;
        }
        else 
        {
            euros = 130* 15 + (horas-130)*  (15*1.5);
        }

        if (euros<=500)
        {
            System.out.println("Salario bruto: " + euros + " euros");
            System.out.println("No hay tasas");
            System.out.println("Salario neto: " + euros + " euros");
        }
        else if (euros>500 && euros<=900)
        {
            System.out.println("Salario bruto: " + euros + " euros");
            euro_resta= euros-500;
            euro_tasas = euro_resta*0.25;
            System.out.println("Tasas: " + euro_tasas);
            neto = euros-euro_tasas;
            System.out.println("Salario neto: " + neto + " euros");
        }
        else
        {
            System.out.println("Salario bruto: " + euros + " euros");
            euro_tasas= (900 - 500) * 0.25 + (euros - 900) * 0.45;
            System.out.println("Tasas: " + euro_tasas);
            neto = euros-euro_tasas;
            System.out.println("Salario neto: " + neto + " euros");
        }    
    }
}
