import java.util.Scanner;

public class majorEdat {

    public static void main(String[] args)  {

    //Programa que demana a l’usuari una edat i indica si és major d’edat (edat major o igual a 18 anys). 
    //Ha d’implementar un mètode amb el prototip boolean esMajorEdat(int edat).

    //inicialitzem variables i scanner
    int edat;
    Scanner sc = new Scanner(System.in);    

    //demanem l'edat
    
    do{ //no acceptem la xifra fins que sigui un número positiu
    System.out.println("Quina és la teva edat? ");
    edat=sc.nextInt();
    }while(edat<0);

    //cridem a la funcio, és major d'edat.

    esMajoredat(edat);
   
    //mostrem el resultat segons si la funció ens ha donat true o false

    if (esMajoredat(edat)== true){
        System.out.println("Ets major d'edat");
    }
    else{
        System.out.println("Ets menor d'edat");
    }
   
    sc.close();


    }//final del main


    //fem una funció on haurem de multiplicar x i y
    private static boolean esMajoredat(int edat){

    if (edat>=18){
        return (true); //és major d'edat per tant retornem true

    }   
    else {return (false);} //si no serà menor i retornarem fals
    
    }
}
