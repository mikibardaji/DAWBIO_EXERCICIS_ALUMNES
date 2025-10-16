import java.util.Random;

public class ex10 {
    public static void main(String[] args) {
        Random rd = new Random();
        float temperatura ;
        int cont =0;
        do{
            temperatura = rd.nextFloat(35, 46);
            System.out.println( "Su temperatura es de "+temperatura);
            cont++;
        }while(temperatura<36.5);

        System.out.println(" Han sido necesaria " +cont+ " medidas");


    }
}
