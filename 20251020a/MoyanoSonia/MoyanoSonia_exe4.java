import java.util.Scanner;

public class posistiuoNegatiu {

//Programa que demana a l’usuari dos números enters i mostra quin és el menor. 
//Cal implementar i usar el mètode int menor(int x, int y), el qual retorna el menor dels dos passats com a paràmetres.

    public static void main(String[] args)  {
        
    //inicialitzem variables i scanner
    int num;
    Scanner sc = new Scanner(System.in);    

    //demanem la x
    
    System.out.println("Indica un número enter: ");
    num=sc.nextInt();
        
    //cridem a la funció de comparació
    esPositiu(num);

    switch (esPositiu(num)) {
        case 1:
             System.out.println("El número "+num+" és positiu"  );
            break;
        case -1:
             System.out.println("El número "+num+" és negatiu"  );
            break;
        case 0:
             System.out.println("El número és Zero"  );
            break;
    }

    //mostrem el resultat
   
    sc.close();

    }//final del main

    //fem una funció on haurem de mirar si el numero es positiu, negatiu o zero
    
    private static int esPositiu(int num){

        if (num>0){ //comprobem si x es major que y , 
           return (1) ; // si es cert y és més petit per tant retornarem aquest valor
        }
        else if (num<0) {
            return (-1);} //si no retornarem el valor de x

        else {
            return (0);
        }      
    }
}

