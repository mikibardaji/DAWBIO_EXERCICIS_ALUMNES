import java.util.Scanner;

public class menor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero: ");
        int uno = sc.nextInt();
        System.out.println("introduzca otro numero: ");
        int dos = sc.nextInt();

        int respuesta = numMenor(uno, dos);

        System.out.println("El numero menor es: "+ respuesta);
    }

    public static int numMenor(int x, int y){
        int respuesta;
        if (x > y){
            respuesta = y;
        } else{
            respuesta = x;
        }
        
        return respuesta;
    }
}
