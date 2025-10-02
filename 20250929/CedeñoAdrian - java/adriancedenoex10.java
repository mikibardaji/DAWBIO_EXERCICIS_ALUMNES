import java.util.Scanner;

public class adriancedenoex10 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in); 
        double hores, salariobruto, tasas, salarioneto;

        System.out.print("Horas este mes?:");
        hores=sc.nextDouble();

         if (hores<=130){
            salariobruto= hores*15;
            }
        else {
            salariobruto=130*15 + (hores-130)*(15*1.5);
            }

         if (salariobruto<=500){
            tasas=0;
            }
            if (salariobruto<=900){
            tasas = (salariobruto - 500) * 0.25;
            }
             else {
            tasas = 400*0.25 + (salariobruto - 900)*0.45;
            }

         salarioneto = salariobruto - tasas;

         System.out.println("El numero de horas son: " + hores);
         System.out.println("El salari bruto es: " + salariobruto);
         System.out.println("Les tasas son: " + tasas);
         System.out.println("El salario neto sera: " + salarioneto);

         sc.close();
    }
    
}