import java.util.Scanner;

public class numeroMajor {

//Programa que demana a l’usuari dos números enters i mostra quin és el menor. 
//Cal implementar i usar el mètode int menor(int x, int y), el qual retorna el menor dels dos passats com a paràmetres.

    public static void main(String[] args)  {

        
    //inicialitzem variables i scanner
    int x, y;
    Scanner sc = new Scanner(System.in);    

    //demanem la x
    
    System.out.println("Indica x: ");
    x=sc.nextInt();

    //demanem la y

    System.out.println("Indica y: ");
    y=sc.nextInt();
    
    //cridem a la funció producte
    esMenor(x,y);

    //mostrem el resultat
    System.out.println("El número menor és "+ esMenor(x,y)+ " (entre els dos indicats: "+x+" i "+y+" )" );

    sc.close();


    }//final del main


    //fem una funció on haurem de multiplicar x i y
    private static int esMenor(int x,int y){

        if (x>y){ //comprobem si x es major que y , 
            return y; // si es cert y és més petit per tant retornarem aquest valor
        }
        else {return x;} //si no retornarem el valor de x
    
    }
}
