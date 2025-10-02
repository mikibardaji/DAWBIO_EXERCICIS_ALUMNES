import java.util.Scanner;

public class pt_1_xavier_garcia_martin_ex1 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int nacimientio;
    System.out.println("Introduce tu año de nacimiento: ");
    nacimientio = scanner.nextInt();
    if (nacimientio >= 2013) {
        System.out.println(" El/la jugador/a estarà federat a la caregoria: NO CATEGORIA" );
    } else if (nacimientio >= 2011) {
        System.out.println(" El/la jugador/a estarà federat a la caregoria: S14");    
    }
    else if (nacimientio >= 2009) {
        System.out.println(" El/la jugador/a estarà federat a la caregoria: S16");
    } else if (nacimientio >= 2007) {
        System.out.println(" El/la jugador/a estarà federat a la caregoria: S18");
    } else if (nacimientio >= 1991) {
        System.out.println(" El/la jugador/a estarà federat a la caregoria: Absoluta");

    } else if (nacimientio < 1991) {
        System.out.println(" El/la jugador/a estarà federat a la caregoria: Veteranos");
    } else {
        System.out.println("Aquest any no és vàlid per a jugar a categories actuals");
        
    }
}
}