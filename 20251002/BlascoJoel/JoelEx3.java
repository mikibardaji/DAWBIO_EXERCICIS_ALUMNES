import java.util.Scanner;

public class JoelEx3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        final double preu_entrada = 17.99;
        final double iva = 0.21;

        double preu_total = 0;
        double preu_total_iva = 0;

        System.out.println("1 entrada - Sense Descompte");
        System.out.println("2 entrades - 10% descompte la segona entrada");
        System.out.println("3+ entrades - 5% descompte totes les entrades");
        System.out.print("Quantes entrades vols? ");
        int entrada = sc.nextInt(); 
        
        if(entrada == 1){
            System.out.println("No hi ha descompte!");   
            preu_total = preu_entrada;        
        }   
        
        else if(entrada == 2 ){
            System.out.println("Tens un 10% de descompte en la segona entrada");
            preu_total =  preu_entrada + (preu_entrada - (preu_entrada * 0.1));  
        }
        
        else if(entrada >= 3 ){
            System.out.println("Tens un 5% de descompte a totes les entrades");
            preu_total =  entrada * (preu_entrada - (preu_entrada * 0.05));  
        }

        else{
            System.out.println("ERROR!");
        }
        
        preu_total_iva = preu_total + preu_total * iva;
        System.out.println("Has comprat " + entrada + " amb un amb descomptes aplicats de " + preu_total + ", pero amb IVA es de " + preu_total_iva + ".");

    }
}

