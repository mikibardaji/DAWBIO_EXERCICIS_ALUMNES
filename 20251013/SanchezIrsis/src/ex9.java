import java.util.Scanner;
public class ex9 {
 public static void main(String[] args) {
//Demana a l’usuari les pulsacions (batecs per minut) d’un pacient durant 5 minuts, i calcula la mitjana.
//Exemple de sortida:
//Introdueix pulsacions minut 1: 80
//Mitjana = 78.6 bpm
Scanner sc = new Scanner(System.in);
int pulsacions,acum_suma = 0, contador = 0;
double mitjana;
do{
    System.out.println("Introdueix les teves pulsacions per minut: ");
    pulsacions = sc.nextInt();
    acum_suma = acum_suma + pulsacions;
    contador++;
} while (contador < 5);
mitjana = acum_suma / 5;
System.out.println("La mitjana de pulsacions és de: " + mitjana + " bpm.");
sc.close();
}
}