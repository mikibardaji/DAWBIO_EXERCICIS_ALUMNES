import java.util.Scanner;
public class modular2Correccion {
    public static boolean mayorDeEdad(int minEdad){
        Scanner sc = new Scanner(System.in);
        boolean mayoriaEdad = false;
        if (minEdad >= 18) {
            mayoriaEdad = true;
        } else if (minEdad < 18) {
            mayoriaEdad = false;
        }
        sc.close();   
        return mayoriaEdad;
    }
    public static int edadUsuario(){
        Scanner sc = new Scanner(System.in);
        int tuEdad = 0;
        System.out.println("que edad tienes?");
        tuEdad = sc.nextInt();

        sc.close();   
        return tuEdad;
    }

    public static void main(String[] args) {
    int edad = edadUsuario();
    
    if (mayorDeEdad(edad)) {
        System.out.println("eres mayor de edad");
    } else  if (!mayorDeEdad(edad)) {
        System.out.println("eres menor de edad");
    }
}
}