import java.util.Scanner;
public class modular2 {
    public static void mayorDeEdad(int edad){
        Scanner sc = new Scanner(System.in);
        boolean mayoriaEdad = false;
        if (edad >= 18) {
            mayoriaEdad = true;
        } else if (edad < 18) {
            mayoriaEdad = false;
        }

        System.out.println("es mayor de edad? " + mayoriaEdad + " tiene " + edad + " años");
        sc.close();
        
    }
    public static void main(String[] args) {
        mayorDeEdad(18);
        
    }
}
