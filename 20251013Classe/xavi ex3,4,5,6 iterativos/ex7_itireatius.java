import java.util.Random;

public class ex7_itireatius {
    public static void main(String[] args) {
        Random rnd = new Random();
        boolean thegref = false;
        int num;

        for(int i= 0; i < 20;i++){
            num = rnd.nextInt(-100,100);
            if(num < 0){
                thegref = true;
                break;
            }
        }
        System.out.print("hay numeros negativoS:"+thegref);

    }
}
