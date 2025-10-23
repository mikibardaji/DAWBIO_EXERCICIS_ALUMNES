import java.util.Scanner;

public class ProducteReal {

    public static void main(String[] args)  {

    //Programa que demana a l’usuari dos números reals i mostra el seu producte. 
    //Cal implementar el mètode double producte(double x, double y), el qual retorna el producte dels arguments passats com a paràmetres.
    
    //inicialitzem variables i scanner
    double x1, y1;
    Scanner sc = new Scanner(System.in);    

    //demanem la x
    
    System.out.println("Indica x: ");
    x1=sc.nextDouble();

    //demanem la y

    System.out.println("Indica y: ");
    y1=sc.nextDouble();
    
    //cridem a la funció producte
    producte(x1,y1);

    //mostrem el resultat
    System.out.println("El producte de "+ x1 +" i "+ y1+ " és :" + producte(x1, y1));

    sc.close();


    }//final del main


    //fem una funció on haurem de multiplicar x i y
    private static double producte(double x, double y){

    return x*y; //retorna el producte dels dos valors.
    
    }
}
