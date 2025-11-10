import java.util.Random;
import java.util.Scanner;

public class Joc 
{
    public static int jugada ()
    {
        Scanner sc = new Scanner(System.in);
        int eleccion;
        do 
        {
            System.out.println("que sacas? (0 piedra, 1 papel, 2 tijera)");
            eleccion=sc.nextInt();
        }while(eleccion!=0 && eleccion!=1 && eleccion!=2);
        return eleccion;
    }
    public static int jugada_ordenador()
    {
        Random rd = new Random();
        int x=rd.nextInt(0,3);      
        return x;
    }

    public static void imp_jugada(String quien_juega, int choose)
    {
        String jugada = "";
        if (choose == 0) jugada = "Piedra";
        else if (choose == 1) jugada = "Papel";
        else if (choose == 2) jugada = "Tijera";

        System.out.println(quien_juega + " ha sacado: " + jugada);
    }

    public static void imp_ganador(int ganador)
    {
        if (ganador==0)
        {
            System.out.println("Hay empate");
        }
        else if (ganador==1)
        {
            System.out.println("Has ganado");
        }
        else if (ganador==2)
        {
            System.out.println("Ha ganado el ordenador");
        }
    }

    public static void marcador(int jugador, int ordenador)
    {
        System.out.println("Marcador -> Jugador: " + jugador + " | Ordenador: " + ordenador);
    }

    public static int aumentar_punto(int score)
    {
        return score+1;
    }

    public static int ganador(int jugador, int ordenador)
    {
        int resultado;

        if (jugador == ordenador)
        {
            resultado = 0;
        }
        else if (jugador == 0 && ordenador == 2)
        {
            resultado = 1;
        }
        else if (jugador == 1 && ordenador == 0)
        {
            resultado = 1;
        }
        else if (jugador == 2 && ordenador == 1)
        {
            resultado = 1;
        }
        else
        {
            resultado = 2;
        }
        return resultado;
    }
}