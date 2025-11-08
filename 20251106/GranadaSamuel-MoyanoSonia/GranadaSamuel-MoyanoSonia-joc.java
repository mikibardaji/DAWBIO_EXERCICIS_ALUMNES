import java.util.Random;
import java.util.Scanner;

public class joc {
    public static void main(String[] args)  {//sonia
    int choose_player1,choose_player2, ganador, point_player1=0, point_player2=0;
    choose_player1=jugada( "que sacas? (0 piedra, 1 papel, 2 tijera)");
    imp_jugada("Eleccion jugador 1: ", choose_player1);
    choose_player2=jugada_ordenador();
    imp_jugada("Eleccion jugador 2: ", choose_player2);
    ganador=ganador(choose_player1, choose_player2);
    imp_ganador(ganador);
    if(ganador==1){
        point_player1=aumentar_punto(point_player1);
    }
    else if (ganador==2){
        point_player2=aumentar_punto(point_player2);
    }
    marcador(point_player1,point_player2);  
    }
    public static int jugada(String frase){ //Samuel
        Scanner sc = new Scanner(System.in);
        int num;
        do{
        System.out.println(frase);
        num = sc.nextInt();
        }while(num<0 || num > 2 );
        
        return num;
    }

    public static int jugada_ordenador(){ //sonia
        int num_random;
        Random rd = new Random();
        //indiquem que ha de ser un valor entre 0 i 2
        num_random=rd.nextInt(0,3);
        return num_random;
    }

    public static void imp_ganador(int ganador){//sonia
        switch (ganador) {
            case 0:
            System.out.println("Hay empate!!");
            return;
            case 1:
            System.out.println("Ha ganado el jugador 1!!");
            return;
            case 2:
            System.out.println("Ha ganado el jugador 2!!");
            return;
            default:
            System.out.println("Jugada Erronea");
            return;
        }
    }
    public static void marcador(int point_player1, int point_player2){//Samuel
    
        System.out.println("Jugador 1: " + point_player1+ " - Jugador 2: "+point_player2 ); 

    }
    public static int aumentar_punto(int score){//sonia
        score++;
        return score;
    }
    public static int imp_jugada(String quien_juega, int choose){ //samuel
        System.out.println(quien_juega);
        switch (choose) {
            case 0:
                System.out.println("Piedra ");
                break;
            case 1:
                System.out.println("Papel ");
                break;
            case 2:
                System.out.println("Tijera ");
                break;
        
            default:
                break;
        }
    
        return choose;


    }
    
    public static int ganador(int choose_player1, int choose_player2){//Samuel
        int gana;
        if (choose_player1 == choose_player2) {
            gana =0;
        }else if(choose_player1 == 1 && choose_player2 == 0){
            gana=1;
        }else if(choose_player1 == 0 && choose_player2 == 2){
            gana=1;
        }else if(choose_player1 == 2 && choose_player2 == 1){
            gana=1;
        }else{
            gana=2;
        }
        return gana;
    }

    }

