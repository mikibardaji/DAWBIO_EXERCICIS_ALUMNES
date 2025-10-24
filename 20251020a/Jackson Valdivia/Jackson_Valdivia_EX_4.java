import java.util.Scanner;

public class EX_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int respuesta = sc.nextInt();
        int resultado = signe(respuesta);
        switch (resultado) {
            case 1:
                System.out.println("Su numero es positivo");
                break;
        
            case -1:
                System.out.println("su numero es negativo");
                break;
            case 0:
                System.out.println("su numero es cero");
                break;
            default:
                break;
        }
    }


    public static int signe(int x){
        int respuesta;
        if (x == 0) {
            respuesta = 0;
        } else if (x < 0) {
            respuesta = -1;
        } else{
            respuesta = 1;
        }
        return respuesta;
    }
}
