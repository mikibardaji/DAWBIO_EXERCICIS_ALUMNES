public class nuevo{
    public static void main(String[] args) {
        
    }


    public static int numero_carta_aleatorio(){
        int aleatorio = (int)(Math.random()*10)+1;
        if (aleatorio == 8 || aleatorio == 9 || aleatorio == 10) {
            aleatorio+=2;
        }
        return aleatorio;
    }

    public static int pal_carta_aleatorio(){
        int aleatorio = (int)(Math.random()*4)+1;
        return aleatorio;
    }

    public static void imprimir_carta(int num_carta, int num_pal_carta){
        String pal = "";
        switch (num_pal_carta) {
            case 1:
                pal = "OROS";
                break;
            case 2:
                pal ="BASTOS";
                break;
            case 3:
                pal ="ESPADAS";
                break;
            case 4:
                pal ="COPAS";
            default:
                break;
        }
        System.out.println("Carta: "+ num_carta + " de " + pal);
    }



    public static double punts_carta(int num_carta){
        double valor;
        if (num_carta > 0 && num_carta< 8) {
            valor = num_carta;
        }else{
            valor = 0.5;
        }
        return valor;
    }


    public static boolean banca_demanda_carta(int punts_jugador, int punts_carta){
        boolean seguir = false;
        if (punts_jugador <= 7.5 && (punts_carta < punts_jugador || punts_carta < 5)) {
            seguir = true;
        }else{
            seguir = false;
        }
        return seguir;
    }

    public static boolean ganya_jugador(double punts_jugador, double punts_carta){
        boolean ganar = false;
        if ((punts_jugador <= 7.5 && punts_carta < punts_jugador) || punts_carta > 7.5) {
            ganar = true;
            System.out.println("Gana el jugador");
        }else{
            ganar = false;
            System.out.println("Gana la banca");
        }
        return ganar;

    }
}
