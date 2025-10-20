import java.util.Random;
import java.util.Scanner;
public class ex14 {
 public static void main(String[] args) {
//14.	Programa on l'usuari pensa un número de l'1 al 100 i l'ordinador intenta endevinar-lo. És a dir, l'ordinador anirà proposant números una vegada i una altra fins a endevinar-lo (l'usuari haurà d'indicar-li a l'ordinador si és més gran, menor o igual al número que ha pensat).   
Random rd = new Random();
Scanner sc = new Scanner(System.in);
int ordinador_proposta;
ordinador_proposta = rd.nextInt(1,101);
int min = 1;
int max = 100;
int intent;
char resposta = ' '; 
do {
System.out.println("Pensa un número de l'1 al 100.");
System.out.println("He pensat en el número " + ordinador_proposta + ".");
System.out.println("He pensat en el número " + ordinador_proposta + ".");

switch (resposta) {
    case '=':
    System.out.println("Has encertat!");
    break;
    case '+':
    min = ordinador_proposta + 1;
    break;
    case '-':
    max = ordinador_proposta - 1;
    break;
}
intent = rd.nextInt(min, max + 1);
System.out.println("He endevinat el teu número: " + intent);
}while (resposta != '=');
sc.close(); 
}}