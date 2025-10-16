public class ex10 {
    public static void main(String[] args) {
    //Control de temperatura corporal
    //Simula que vas mesurant la temperatura d’un pacient.
    //El programa ha de demanar valors (float) fins que la temperatura sigui 36.5 o més, 
    //i després mostrar quants intents han calgut. Valores aleatorios entre 35 y 45.

        Random rand = new Random();
        float temperatura = 0;
        int intents = 0;

        while (temperatura < 36.5) {
            temperatura = 35 + rand.nextFloat() * 10; 
            intents++;
            System.out.printf("Introdueix temperatura:", temperatura);
        }

        System.out.println("Han calgut " + intents + " intents.");
    }
}


