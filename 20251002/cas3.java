import java.util.Scanner;
public class cas3 {
public static void main(String[] args)  {
//Programa que mostri quantes entrades s’han comprat, el preu base i el preu TOTAL amb un 21% d’IVA aplicat. 
//Declarar variables: entrades, preuBase, preuTotal, IVA;
//Mostrar menú.
//Preguntar quantes entrades.
//Fer calculs.
//Mostrar resultat.

Scanner sc = new Scanner(System.in);
int entrades;
double preuTotal = 0 , preuBase, descompteCinc, descompteDeu, entradaRebaixada;
final double IVA = 1.21;
descompteCinc = 0.05;
descompteDeu = 0.10;

System.out.println("Benvinguts... Mostrant entrades:");
System.out.println("Una Entrada = 25 euros [preu sinIVA]");
System.out.println("Dues Entrades = 25 euros. Emporta't la segona amb un 10% de descompte! [preu sinIVA]");
System.out.println("+2 Entrades = 25 euros. Emporta-les amb un 5% de descompte cadascuna! [preu sinIVA]");
System.out.println("Si us plau, introdueix el nombre d'entrades desitjat: ");
entrades = sc.nextInt();
preuBase = 25;


if (entrades == 1)
{
    preuTotal = preuBase * IVA;
}
else if (entrades == 2)
{
    entradaRebaixada = preuBase - (preuBase*descompteDeu); 
    preuTotal = (preuBase * IVA) + (entradaRebaixada * IVA);
}
else
{
preuBase =  entrades*preuBase - entrades*(preuBase*descompteCinc);
preuTotal = preuBase*IVA;
}
if (entrades<=0)
{
    System.out.println("Error.");
}
System.out.println("S'han comprat un total de " + entrades +" entrades.");
System.out.println("Preu base per entrada (sense IVA): " + preuBase +" euros.");
System.out.println("Preu total en conjunt amb IVA del 21%: " + preuTotal + " euros.");
sc.close();
}
}
