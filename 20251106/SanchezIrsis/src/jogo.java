import java.util.Random;
import java.util.Scanner;

public class jogo {
Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
int jugada, usuario, ordenador, imp_guanyador, aumentar_punto, marcador, ganador;


}
private static int nVictories (int tope) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Hola! Indicame a cuantas victorias quieres jugar: ");
    tope = sc.nextInt();
    return tope;
}
private static int jugadaUsuario(){
    int usuario;
    Scanner sc = new Scanner(System.in);
    System.out.println("Perfecto, Ahora indicame què te gustaría sacar: 0 - Piedra, 1 - Papel, 2 - Tijera. Introduce el numero: ");
    usuario = sc.nextInt();
    if (usuario > 2 || usuario < 0)
    System.out.println("Por favor, introduzca un valor válido.");
    return usuario;
}
private static void imp_jugada(String quien, int eleccion){
    switch (eleccion){
        case 0:
        System.out.println( quien +" Ha escogido piedra.");
        break;
        case 1:
        System.out.println( quien +" Ha escogido papel.");
        break;
        case 2:
        System.out.println( quien +" Ha escogido tijeras.");
        break;
    }
}
private static int ordenador(int maquina){
    Random rd = new Random();
    System.out.print("Pensando numero...");
    maquina = rd.nextInt(0,3);
    return maquina;
}
private static void imp_ganador(int imp_guanyador){
    if (imp_guanyador == 0){
        System.out.print("Empate.");
    }
    else if (imp_guanyador == 1){
        System.out.println("Has ganado!");
    }
    else if ( imp_guanyador == 2){
        System.out.print("Ha ganado el ordenador :-(.");
    }
    else{
        System.out.print("Error.");
    }
}
private static int aumentar_punto(int score){
    score++;
}
private static int marcador(int pUsuario, int pOrdenador){
    System.out.println("MARCADOR: ");
    System.out.print("Usuario: " + pUsuario "y Ordenador: " + pOrdenador);
}
private static int ganador(int Usuario, int Ordenador) {
int ganador = 0;
    if (Usuario == Ordenador) {
        ganador = 0; 
        } else if (
            (Usuario == 0 && Ordenador == 2) || // piedra gana a tijera
            (Usuario == 1 && Ordenador == 0) || // papel gana a piedra
            (Usuario == 2 && Ordenador == 1)    // tijera gana a papel
        ) {
            ganador = 1; // gana el jugador
        } else {
            ganador = 2; // gana la máquina
        }

        return ganador;
    }
}


