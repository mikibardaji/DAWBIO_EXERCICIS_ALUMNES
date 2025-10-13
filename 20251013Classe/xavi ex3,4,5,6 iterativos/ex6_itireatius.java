import java.util.Random;

public class ex6_itireatius {
    //programa lee 20 valores
    //si es negativo sumara 1 a un contador
    //y lo muestra al final
    public static void main(String[] args) {
        Random rnd = new Random();
        int thegref=0;
        int num;

        for(int i= 0; i < 20;i++){
            num = rnd.nextInt(-100,100);
            if(num < 0){
                thegref ++;
            }
        }
        System.out.print("numeros negativos: "+thegref);



    }
}
