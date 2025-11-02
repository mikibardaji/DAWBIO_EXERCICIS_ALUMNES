import java.util.Scanner;

public class compraIva {

//Programa que pregunta a l’usuari preus d’articles fins que decideix no continuar (cal preguntar a cada iteració) 
//i mostra el preu amb IVA (21 %). Implementa el mètode float preuAmbIva(float preu).

public static void main(String[] args)  {
        
    //inicialitzem variables i scanner
    int acc=0;
    float total=0,nouPreu;
    boolean finalitzar;

    //demanem el preu;
    do {
        nouPreu=preuAmbIva(0);
        total=total+ nouPreu;
        acc++;
        finalitzar=terminarCompra();
    }while(finalitzar!=true);//mentre no ens diguin que es finalitza anar demanant preu

    mostrarCompra(total, acc);

}//final del main
    public static float preuAmbIva(float preu){
        final float IVA = 1.21f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el preu de l'article: ");
        preu=sc.nextFloat();
        while (preu<0){
            System.out.println("El valor indicat es erroni, indica un preu vàlid: ");
            preu=sc.nextFloat();
        }

        return preu*IVA;
    }
    public static boolean terminarCompra(){
        char continuar;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Vols incloure un nou article? S/N "); 
        continuar=sc.next().charAt(0);
        } while (continuar!='s'&& continuar!='S'&& continuar!='n'&&continuar!='N');
        if (continuar=='n'|| continuar=='N'){
            return true;
        }
        else{
            return false;
        }
    }
    public static void mostrarCompra(float total, int acc){

        System.out.println("Has comprat "+acc+" articles i la suma total amb Iva és "+ total); 
    }

}
