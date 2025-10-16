import java.util.Scanner;
//9.	Programa que rep com a dades d'entrada una hora expressada en hores, minuts i segons i un temps expressat en segons i que ens calcula i escriu l'hora, minuts i segons que seran, transcorregut el temps especificat.
// Pedir horas, minutos, segundos
//Sumar segundos, minutos y horas
// Mostrar resultado

public class MartinaNicettoEx9 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int minutos, horas, segundosMAS, segundos;
         System.out.println("Que hora es? ");
         horas = sc.nextInt();
         System.out.println("Que minuto es? ");
         minutos = sc.nextInt();
         System.out.println("Que segundo es? ");
        segundos= sc.nextInt();


        System.out.println("Los segundos mas son ");
        segundosMAS= sc.nextInt();


        segundos= segundos + segundosMAS;

        if (segundos>=59)
        {
            minutos=minutos+(segundos/60);
            segundos=segundos%60;
        }
         if (minutos>59)
        {
            horas=horas+(minutos/60);
            minutos=minutos%60;
        }
        if (horas>23)
        {
            horas=horas/24;
        }

        System.out.println( "Las horas son " + horas + ": " + minutos + " : " + segundos);

        }    
}