import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca su edad: ");
        int edad = sc.nextInt();

        if(mayorEdad(edad)){
            System.out.println("Felicidades, usted es mayor de edad");
        }else{
            System.out.println("no puede pasar, es menor de edad");
        }

    }

    public static boolean mayorEdad(int edad){
        boolean esmayor;
        
        if (edad >= 18){
            esmayor = true;
        } else {
            esmayor = false;
        }

        return esmayor;
    }
}
