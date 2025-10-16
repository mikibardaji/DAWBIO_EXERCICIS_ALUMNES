import java.util.Scanner;
public class ex10 {
 public static void main(String[] args) {
//Simula que vas mesurant la temperatura d’un pacient.
//El programa ha de demanar valors (float) fins que la temperatura sigui 36.5 o més, i després mostrar quants intents han calgut.
Scanner sc = new Scanner(System.in);
float temperatura;
int intents = 0;

do{
    System.out.println("Introdueix la temperatura del pacient: ");
    temperatura = sc.nextFloat();
    intents++;
} while (temperatura <= 36.5);
System.out.println("Han fet falta " + intents + " mesures.");

sc.close();
 }}
