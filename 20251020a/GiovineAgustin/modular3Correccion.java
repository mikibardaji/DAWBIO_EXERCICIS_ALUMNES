import java.util.Scanner;
public class modular3Correccion {
    public static void numMenor(int x, int y){

        if (x < y) {
            System.out.println("el numero menor es " + x);
        } else if (x > y){
            System.out.println("el numero menor es " + y);
        } else {
            System.out.println("son el mismo numero " + x);
        }
    }

        public static int numero(){
        Scanner sc = new Scanner(System.in);
            
        System.out.println("dame un numero");
        int x = sc.nextInt();

        return x;
    }
    public static void main(String[] args) {
        int num1, num2;

        num1 = numero();
        num2 = numero();
        numMenor(num1, num2);
    }
}
