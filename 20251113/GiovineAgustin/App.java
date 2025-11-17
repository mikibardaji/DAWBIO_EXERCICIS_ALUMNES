import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroCarta;
        int pintaCarta;
        int seguirJugando = 0;
        double puntos_jugador = 0;
        double puntos_banca = 0;
    
        System.out.println("Empieza tu turno, tu primera carta es: ");
        do {
            numeroCarta = numero_carta_aleatori();
            pintaCarta = pal_carta_aleatori();
            imprimir_carta(numeroCarta,pintaCarta);
            puntos_jugador = puntos_jugador + punts_carta(numeroCarta);

            System.out.println("Tenes " + puntos_jugador + " puntos");
            if (puntos_jugador < 7.5) {
                System.out.println("Queres tirar otra carta? ");
            
            System.out.println("1) Si / 2) No");
            seguirJugando = sc.nextInt();
            }
        } while (seguirJugando == 1 && puntos_jugador <= 7.5);

        System.out.println("Empieza el turno de la banca, su primera carta es: ");

            while (banca_demana_carta(puntos_jugador, puntos_banca)) {
            numeroCarta = numero_carta_aleatori();
            pintaCarta = pal_carta_aleatori();
            imprimir_carta(numeroCarta,pintaCarta);
            puntos_banca = puntos_banca + punts_carta(numeroCarta);
            System.out.println("La banca tiene " + puntos_banca + " puntos"); 
            }

            if (guanya_jugador(puntos_jugador, puntos_banca)) {
                System.out.println("Bien jugado, HAS GANADO"); 
            } else {
                System.out.println("Mejor suerte la proxima..."); 
            }
        System.out.println("Resultados: Tus puntos " + puntos_jugador + "  |  Los puntos de la banca " + puntos_banca);
        
    }

        static public int numero_carta_aleatori(){
            Random rand = new Random();

            int numAleatorio = rand.nextInt(1, 11);
            if (numAleatorio == 8 || numAleatorio == 9 || numAleatorio == 10){
                numAleatorio = numAleatorio + 2;
            }

            return numAleatorio;
            
        }

        static public int pal_carta_aleatori(){
            Random rand = new Random();

            int pinta = rand.nextInt(1,5);

            return pinta;
        }

        static public void imprimir_carta(int numeroCarta, int pintaCarta){ //1 serà el pal OROS / 2 serà el pal BASTOS /3 serà el pal ESPADAS / 4 serà el pal COPAS
            String pintaFinal = "";
            if (pintaCarta == 1 ){
                pintaFinal = "ORO"; 
            } else if (pintaCarta == 2 ){
                pintaFinal = "BASTO";
            } else if (pintaCarta == 3 ){
                pintaFinal = "ESPADA";
            }else if (pintaCarta == 4 ){
                pintaFinal = "COPA";
            }

            if (numeroCarta == 10) {
                pintaFinal = pintaFinal + " (SOTA)";
            } else if (numeroCarta == 11) {
                pintaFinal = pintaFinal + " (CABALLO)";
            } else if (numeroCarta == 12) {
                pintaFinal = pintaFinal + " (REY)";
            }

            System.out.println("La carta salida es " + numeroCarta + " de " + pintaFinal);
        }

        static public double punts_carta(int numeroCarta){
            double puntos = 0;

            if (numeroCarta < 8 && numeroCarta > 0) {
                puntos = puntos + numeroCarta;
            } else if (numeroCarta > 9 && numeroCarta < 13) {
                puntos = 0.5;
            }
            return puntos;
            }

        static public boolean banca_demana_carta(double puntos_jugador, double puntos_banca){
            boolean salida = false;

                if (puntos_jugador <= 7.5 && puntos_banca < puntos_jugador || puntos_banca < 5) {
                    salida = true;
                }
            return salida;
        }

        static public boolean guanya_jugador(double puntos_jugador, double puntos_banca){
            boolean salida = false;

            if ((puntos_jugador <= 7.5 && puntos_jugador > puntos_banca) || puntos_banca > 7.5) {
                salida = true;
            }
            return salida;
        }

}