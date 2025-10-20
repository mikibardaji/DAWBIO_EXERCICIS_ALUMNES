import java.util.Random;
import java.util.Scanner;

public class Ex14_1_al_100_pt2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int intento_maquina;
        int contador_intents=0;
        int contador_gran=0;
        int contador_petit=0;
        int min=0;
        int max=101;
        char ayuda;

        System.out.println("Comncem amb el joc ^^!");
        do 
        {
            intento_maquina = rd.nextInt(min, max);
            System.out.println(intento_maquina);
            do
            {
                System.out.println("He encertat el número en el que pensaves? (+, -, =)");
                ayuda = sc.next().charAt(0);
            }while(ayuda!='+'&& ayuda!='-'&& ayuda!='=');

            if (ayuda == '+')
            {
                System.out.println("El número és més gran");
                min = intento_maquina +1;
                contador_petit++;
                contador_intents++;
            }
            else if (ayuda == '-')
            {
                System.out.println("El número és més petit");
                max = intento_maquina;
                contador_gran++;
                contador_intents++;

            }
            else if (ayuda== '=')
            {
                System.out.println("He esbrinat el numero :D!");
                contador_intents++;
            }

        }while (ayuda!='=');
        System.out.println("Els meus intents han sigut de " + contador_intents);
        System.out.println(contador_gran + " vegades he dit un número més gran i " + contador_petit + " vegades un número més petit"  );
    }
}