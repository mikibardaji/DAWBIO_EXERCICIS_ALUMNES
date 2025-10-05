import java.util.Scanner;

public class ControlDM {
//Realitzem un programa per el control de la diabetis.
//Demanarem el index de glicemia al pacient, segons el que ens indiqui li suggerirem 
//la correcció que farà el pacient en unitats d'insulina segons una ratio fixe per el seu index glicèmic estàndard.

public static void main(String[] args) throws Exception {
//Definim constant ratio, i definim les variables glicemia, insulina i inicialitzem scanner
final int RATIO=34, GLIC_OBJECTIU=100;

int glicemia, insulina;
Scanner sc = new Scanner(System.in);

System.out.print("Quin és el valor de glicemia actual?");
glicemia = sc.nextInt();

//tot i que per calcular les dosi d'insulina farem una divisió i perdrem informació no ens interesa que sigui doble ja 
//que només ens interessa la part sencera de la xifra, perque només podem aplicar la medicació en sencers 
//i axí podrem utitilzar menys recursos del programa

insulina = (glicemia-GLIC_OBJECTIU)/RATIO;

if (glicemia<70){

    System.out.print("Compte!! Estàs amb el sucre baix, deuries menjar alguna cosa.");
}

else if (glicemia>=70 && glicemia<=120){

    System.out.print("Bona feina estás dintre de rang.");
}

else if (glicemia>120 && glicemia<250){
    if(insulina==0){
        System.out.print("Tens la glicemia Alta, pero no cal corregir, revisa passats uns minuts.");}
    else{
        System.out.print("Tens la glicemia Alta, deus aplicar "+ insulina+ " unitats d'insulina.");
    }
}

else {

    System.out.print("Estas en perill de cetoacidòsi aplica "+insulina+" unitats de insulina i revisa passat 15 minuts." );
}

sc.close();
}

}
