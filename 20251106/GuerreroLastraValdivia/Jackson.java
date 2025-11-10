public class Jackson {
    public static void main(String[] args) {
        
    }

    public static int jugada_ordenador(){
        int respuesta  = (int) (Math.random()*2 + 0); 
        return respuesta;
    }



    public static int aumentar_punto(int score){
        return score++;
    }
    
    public static int ganador(int choose_player1, int choose_player2){
        int respuesta= 3;
        if (choose_player1 == choose_player2) {
            respuesta = 0;
        }
        if (choose_player1 == 0 && choose_player2 == 1) {
            respuesta = 2;
        }else if (choose_player1 == 1 && choose_player2 == 0) {
            respuesta = 1;
        }else if (choose_player1== 2 && choose_player2 == 0) {
            respuesta = 2;
        }else if (choose_player1 == 0 && choose_player2 == 2) {
            respuesta = 1;
        }else if (choose_player1 == 1 && choose_player2 ==2) {
            respuesta = 1;
        }else if (choose_player1 == 2 && choose_player2 ==1) {
            respuesta = 2;
        }
        return respuesta;
    }
}
