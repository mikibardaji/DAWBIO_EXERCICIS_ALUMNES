import java.util.Scanner;

public class ProducteReal {

    public static void main(String[] args)  {

    //Programa que demana a l’usuari dos números reals i mostra el seu producte. 
    //Cal implementar el mètode double producte(double x, double y), el qual retorna el producte dels arguments passats com a paràmetres.
    
    //inicialitzem variables i scanner
    double x1, y1;
    Scanner sc = new Scanner(System.in);    

    //demanem la primera variable
    
    System.out.println("Indica x: ");
    x1=sc.nextDouble();
    System.out.println("Indica y: ");
    y1=sc.nextDouble();
    producte(x1,y1);

     System.out.println("El producte de "+ x1 +" i "+ y1+ " és :" + producte(x1, y1));




    }//final del main

    private static double producte(double x, double y){

    return x*y;
    
    }
}
