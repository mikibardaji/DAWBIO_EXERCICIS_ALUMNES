import java.util.Random;
import java.util.Scanner;
public class ex14plus {
 public static void main(String[] args) {
//14.	Programa on l'usuari pensa un número de l'1 al 100 i l'ordinador intenta endevinar-lo. És a dir, l'ordinador anirà proposant números una vegada i una altra fins a endevinar-lo (l'usuari haurà d'indicar-li a l'ordinador si és més gran, menor o igual al número que ha pensat).   
Random rd = new Random();
Scanner sc = new Scanner(System.in);
int ordinador_proposta;
int contador=0;
int min = 1;
int max = 101;
int intent;
char resposta = ' '; 
do {
System.out.println("Pensa un número de l'1 al 100.");
ordinador_proposta = rd.nextInt(min, max);
System.out.println("He pensat en el número " + ordinador_proposta + ".");
contador++;

System.out.println("És major, menor o igual? (+/-/=): ");
resposta = sc.next().charAt(0);
intent = rd.nextInt(min, max + 1);
switch (resposta) {
    case '=':
    System.out.println("Has encertat!");
    System.out.println("He endevinat el teu número: " + intent);
    break;
    case '+':
    min = ordinador_proposta + 1;
    break;
    case '-':
    max = ordinador_proposta;
    
    break;
}
}while (resposta != '=');
System.out.println("He necessitat " + contador + " intents per endevinar el teu número.");
sc.close(); 
}}
