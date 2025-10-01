import java.util.Scanner;

public class ex10 {
public static void main(String[] args)  {
//Programa que calcula el salari net mensual d'un treballador en funció del nombre d'hores treballades i la taxa d'impostos d'acord amb les hipòtesis següents:
//Definir variables: hores, impostos, salariBrut, salariNet.
//Demanar hores treballades 
//Calcular salari brut, net, hores i taxes.

Scanner sc = new Scanner(System.in);
double hores, salariNet, salariBrut, impostos;
System.out.println("Quantes hores has treballat?");
hores = sc.nextDouble();

if (hores<=130)
{
   salariBrut= hores*15;
}
else
   {
   salariBrut = 130 * 15 + (hores - 130)*22.5;
   }
  if (hores<=500)
{
   salariBrut = hores*15 + (hores - 130)*22.5;
   impostos= 0;
}
if (hores<=900)
{
    impostos = (salariBrut - 500)*0.25;
}
else 
{
    impostos = 400*0.25 + (salariBrut - 900)*0.45;
}
salariNet = salariBrut - impostos;

System.out.println("El teu salari net és de " + salariNet + " euros.");
System.out.println("El teu salari brut és de " + salariBrut + " euros.");
System.out.println("Els impostos totals són: " + impostos + " euros.");
System.out.println("Hores treballades: " + hores + "h.");
}
}




