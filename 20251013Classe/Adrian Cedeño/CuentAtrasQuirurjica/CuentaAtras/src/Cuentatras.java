import java.util.Scanner;
public class Cuentatras {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hora =0 ;
    System.out.println("Empezaremos la cuenta atras");
    System.out.println("Empezando Preparación Quirurgica...");

    for (int tiempo = 10;  tiempo > hora; tiempo-- ) {
    System.out.println(tiempo + "...");
    }
    System.out.println("Inici de la intervenció.");
    sc.close();
    }
}
