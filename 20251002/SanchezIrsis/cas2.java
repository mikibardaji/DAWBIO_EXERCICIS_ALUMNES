import java.util.Scanner;
public class cas2 {
public static void main(String[] args)  {
//Programa que pregunta el pes a l’usuari i mostra un menú amb diferents medicaments.
//Declarar variables: medicaments, pes, opcio, quantiat, mg, g;
//Preguntar pes i medicaments.
//Mostrar menú.
//Mostrar resultat.

Scanner sc = new Scanner(System.in);
double pes;
int opcio;
String medicament = "";
String quantitat = "";

System.out.println("Quin és el teu pes?");
pes = sc.nextDouble();
System.out.println("Quin és el medicament prescrit?");
System.out.println("1. Ibuprofeno.");
System.out.println("2. Xarelto.");
System.out.println("3. Amoxicilina.");
System.out.println("4. Fluoxetina.");
System.out.println("Si us plau, introdueixi el número corresponent: ");
opcio = sc.nextInt();

if (opcio == 1)
{
    medicament = "Ibuprofeno";
    if (pes<70)
    {
    quantitat = "500mg";
    }
    else 
    {
        quantitat = "1g";
    }
}
else if (opcio == 2)
{
    medicament = "Xarelto";
    if (pes<60)
    {
    quantitat = "10mg";
    }
    else if (pes>=60 && pes<=80)
    {
        quantitat = "15mg";
    }
    else if (pes>=80)
    {
    quantitat = "20mg";
    }
}
else if (opcio == 3)
{
    medicament = "Amoxicilina";
    if (pes<65)
    {
    quantitat = "500mg";
    }
    else 
    {
        quantitat = "1g";
    }
}
else if (opcio == 4)
{
    medicament = "Fluoxetina";
    if (pes<80)
    {
    quantitat = "20mg";
    }
    else 
    {
        quantitat = "40mg";
    }
}
else 
{
    System.out.println("Error.");
}

System.out.println("Amb el pes de " + pes + " kg, ha de prendre " + quantitat + " de " + medicament + ".");
sc.close();
}
}
