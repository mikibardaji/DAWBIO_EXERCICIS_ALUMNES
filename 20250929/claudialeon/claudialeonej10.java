import java.util.Scanner;

public class claudialeonej10 {
    public static void main(String[] args) {
        //Programa que calcula salario neto segun las horas
        //130h=15e, +130=1,5*15e, taxes,primers 500e(free), luego 400e(25%),+mas(45%)
        //Preguntar cuantas horas ha hecho
        //Definir las variables
        //Calcular y añadir los impuestos

        Scanner sc= new Scanner(System.in); 
        double hores, salariBrut, taxes, salariNet;
        System.out.print("Quantes hores has fet aquest mes:");
        hores=sc.nextDouble();
         if (hores<=130){
            salariBrut= hores*15;
            }
        else {
            salariBrut=130*15 + (hores-130)*(15*1.5);
            }
         if (salariBrut<=500){
            taxes=0;
            }
            if (salariBrut<=900){
            taxes=(salariBrut - 500)*0.25;
            }
             else {
            taxes= 400*0.25 + (salariBrut - 900)*0.45;
            }
         salariNet=salariBrut - taxes;
         System.out.println("El nombre d'hores són:" + hores);
         System.out.println("El salari brut es:" + salariBrut);
         System.out.println("Les taxes són:" + taxes);
         System.out.println("El salari net será:" + salariNet);
         sc.close();
    }
    
}
