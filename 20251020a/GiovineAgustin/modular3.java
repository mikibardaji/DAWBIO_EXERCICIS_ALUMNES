import java.util.Scanner;
public class modular3 {
    public static void numMenor(int x, int y){
        Scanner sc = new Scanner(System.in);

        if (x < y) {
            System.out.println("el numero menor es " + x);
        } else if (x > y){
            System.out.println("el numero menor es " + y);
        } else {
            System.out.println("son el mismo numero " + x);
        }

        sc.close();
        
    }
    public static void main(String[] args) {
        numMenor(32, 31);
    }
}
