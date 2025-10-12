import java.util.Scanner;
public class ex2FOR {
public static void main(String[] args) {
//Programa que pregunti nombre de dosis necessitades i et mostri cada hora (volta) quantes et queden.
Scanner sc= new Scanner(System.in);
int dosi, nombreDosi;
System.out.println("Quantes dosis necessites? ");
nombreDosi = sc.nextInt();

for (dosi=nombreDosi; dosi>0; dosi--)
{
    System.out.println("Dosi administrada t'en falten: "+ (dosi-1)+ "...");
}
System.out.println("Ja estas curat! :)" );
sc.close();
}
}
