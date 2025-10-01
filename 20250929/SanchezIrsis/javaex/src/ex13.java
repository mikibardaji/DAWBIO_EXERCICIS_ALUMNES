import java.util.Scanner;

public class ex13 {
    public static void main(String[] args)  {
    //Desenvolupeu un programa que entri un import en euros, mostri un menú amb diferents monedes, llegeixi el nom de la moneda i mostri la conversió a la moneda escollida.
    //Definir variables: import i monedes.
    //Demanar import.
    //Mostrar resultats

Scanner sc = new Scanner(System.in);
double euros, dollar, yen, kr;
System.out.println("Introdueixi l'import en euros: ");
euros = sc.nextDouble();
char moneda;

System.out.println("A què t'agradaria canviar? Introdueixi número: ");
System.out.println("1. Dollars Americans - USD [1 EURO/1.17 USD]");
System.out.println("2. Yen - JYP [1 EURO/172.57 JYP]");
System.out.println("3. Corona Islandesa - KR [1 EURO/142.59 KR]");
moneda = sc.next().charAt(0);

if (moneda == '1')
{
    dollar = euros * 1.17;
    System.out.println("Processant... Total: " + dollar + " USD");
}
else if (moneda == '2')
{
    yen = euros * 172.57;
    System.out.println("Processant... Total: " + yen + " JYP");
}
else if (moneda == '3')
{
    kr = euros * 142.59;
    System.out.println("Processant... Total: " + kr + " KR");
}
else
{
System.out.println("Error.");
}

sc.close();
}
}
