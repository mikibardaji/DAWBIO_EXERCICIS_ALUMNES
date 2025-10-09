import java.util.Scanner;

public class dosimed {
public static void main(String[] args) throws Exception {
    
//Un pacient ha de prendre n dosis d’un medicament, fes un simulacre que et pregunti quantes dosis necessites i et mostri cada hora (volta) quantes et queden
//Fes un programa que mostri un missatge per cada hora:

// resoldrem el problema utilitzant for

int dosi;

Scanner sc = new Scanner(System.in);
//primer preguntarem a l'usuari quantes dosis ha de prendre i l'emmagatzarem
System.out.println("Quantes dosis necessites? ");
dosi= sc.nextInt();

//inicialitzarem comptador amb les dosis que necessita l'usuari i anirem descomptant fins que arribi a 1
for (int i=dosi; i>1; i--){
//mostrarem per pantalla les dosis restant que seràn la dosi actual menys una
    System.out.println("Dosi administrada, falten per prendre: "+(i-1));

}
//quan ja s'ha arribat a 1 dosi sortirà del bucle i s'indicarà que s'ha pres la ultima dosi
System.out.println("Ja has acabat la medicació, ja estàs curat");

sc.close();

}
}
