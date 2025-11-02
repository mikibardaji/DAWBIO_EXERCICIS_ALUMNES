import java.util.Scanner;

public class granOPetit {

//Programa que demana a l’usuari dos números enters i diu si són iguals o, cas que no ho siguin, 
//quin és el valor del més gran. Ha d’implementar un mètode amb el prototip int compara(int x, int y) 
//que retorna -1, 0, +1 segons que x sigui més petit, igual o major que y.

    public static void main(String[] args)  {
        
    //inicialitzem variables i scanner
    int x,y,numGran;

    //demanem la x
    x=demanarNumero();

    //demanem la y
    y=demanarNumero();
        
    //cridem a la funció de comparació
    numGran=esMesgran(x,y);

    //mostrem el resultat

    resultat(numGran,x,y);

    }//final del main


    //fem una funció per demarnar el número
    
    private static int demanarNumero(){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Indica un número enter: ");
        num=sc.nextInt();
        return num;
    }
    //fem una funció on haurem de mirar quin número és més gran
    private static int esMesgran(int x, int y){

        if (x>y){ //comprobem si x es major que y ,
           return (1) ; // si es cert y és més petit per tant retornarà 1
        }
        else if (x<y) {
            return (-1);} //si no retornarem -1

        else {
            return (0);//si no direm que són iguals retornant 0
        }
    }
public static void resultat(int numGran, int x, int y){
    switch (numGran) {
        case 1:
            System.out.println("El número "+x+" és més gran que "+y  );
            break;
        case -1:
            System.out.println("El número "+x+" és mes petit que " +y );
            break;
        case 0:
            System.out.println("Els dos número són iguals: " +x );
            break;
    }
}
}
