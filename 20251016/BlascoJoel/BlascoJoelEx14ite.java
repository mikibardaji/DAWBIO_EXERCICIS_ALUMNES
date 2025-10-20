package exercicis;
import java.util.Random;
import java.util.Scanner;


public class BlascoJoelEx14ite {
    public static void main(String[] args) {

        Random rd = new Random();

        Scanner sc = new Scanner(System.in);

        int max = 101;
        int min = 1;
        char resposta;
        System.out.println("Pensa en un numero del 1 al 100... intentaré adivinar-ho");
        System.out.print("Inserta el numero pensat: ");
        int numusuari = sc.nextInt();
        System.out.print("Cuants intents hem dones? ");
        int intents = sc.nextInt();

        do{
            int nummaquina = rd.nextInt(min,max);
            System.out.println("El teu numero es el " + nummaquina + "? (S/N)");
            resposta = sc.next().charAt(0);

            switch (resposta) {
                case 'S':
                case 's':
                    if(nummaquina == numusuari){
                        System.out.println("El numero que habias pensat era el " + numusuari + " i jo he dit el " + nummaquina + ".");
                        System.out.println("Hem faltaban per gastar" + intents + " intents.");
                    }
                    else{
                        System.out.println("He guanyat!!... Espera... T'has oblidat del numero, jo he dit el " + nummaquina + ", pero has posat el " + numusuari + ".");
                        System.out.println("Aixi no es pot jugar :(");
                    }
                    break;
                    
                case 'N':
                case 'n':
                    System.out.print("D'acord, el teu numero es major(+) o menor(-)? ");
                    char majorOMenor = sc.next().charAt(0);

                    switch (majorOMenor) {
                        case '+':
                            min = nummaquina + 1;
                            if(max < min){
                                System.out.println("Estas fent trampes :/");
                            }
                            break;
                        
                        case '-':
                            max = nummaquina;
                            if(min > max){
                                System.out.println("Estas fent trampes :/");
                            }
                            break;

                        default:
                            System.out.println("Error, inserti si + o - per determinar si el numero es major o menor:");
                            break;
                    }
                    intents -= 1;
                    break;
                default:
                    System.out.println("Resposta no valida, utilitza per di si la 'S' i per di no la 'N':");
                    break;
            }
            if(min == max){
                        System.out.println("Nomes queda el " + min + ".");
                        System.out.println("Hem faltaban per gastar" + intents + " intents.");
                    }

        }
        while(intents != 0);
        
        System.out.println("M'he quedat sense intents :(");

    }
}

