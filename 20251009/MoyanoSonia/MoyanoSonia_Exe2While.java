import java.util.Scanner;

public class dosimedW {
public static void main(String[] args) throws Exception {
    
//Un pacient ha de prendre n dosis d’un medicament, fes un simulacre que et pregunti quantes dosis necessites i et mostri cada hora (volta) quantes et queden
//Fes un programa que mostri un missatge per cada hora:

// resoldrem el problema utilitzant la iteració while

int dosi;

Scanner sc = new Scanner(System.in);
//primer preguntarem a l'usuari quantes dosis ha de prendre i l'emmagatzarem
System.out.println("Quantes dosis necessites? ");
dosi= sc.nextInt();

//farem un bucle que anirà restant les dosis pendents mentre que el la dosi no sigui igual a 1 i es mostrarà les restants
do{

System.out.println("Dosi administrada, falten per prendre: "+(dosi-1));

dosi--;

}while (dosi!=1);
//quan surti del bucle mostrarem que ja s'ha finalitzat la medicació.
System.out.println("Ja has acabat la medicació, ja estàs curat");

sc.close();

}
}
