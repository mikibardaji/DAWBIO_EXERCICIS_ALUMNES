import java.util.Random;

public class Ex_8 {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.print(rand.nextBoolean() ? "A" : "T");
        }
        System.out.println();
    }
}
