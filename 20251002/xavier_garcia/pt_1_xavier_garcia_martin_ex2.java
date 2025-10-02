import java.util.Scanner;

public class pt_1_xavier_garcia_martin_ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peso;
        int med;

        System.err.println("Introduce tu peso en kg:");
        peso = sc.nextInt();

        System.err.println("0-ibuprofeno");
        System.err.println("1-xarelto");
        System.err.println("2-amoxicilina");
        System.err.println("3-fluoxetina");

        med = sc.nextInt();

        if (med == 0 && peso <= 70) {
            System.err.println("con un peso de "+peso+ "ha de prendre 500mg de ibuprofeno");
        }else if (med == 0 && peso >= 70) {
            System.err.println("con un peso de "+peso+ "ha de prendre 1mg de ibuprofeno");
        }

        if (med == 1 && peso <= 60) {
            System.err.println("con un peso de "+peso+ "ha de prendre 10mg de ibuprofeno");
        }else if (med == 1 && peso >= 60 && peso <= 80) {
            System.err.println("con un peso de "+peso+ "ha de prendre 15mg de xarelto");
        }else if (med == 1 && peso >= 80) {
            System.err.println("con un peso de "+peso+ "ha de prendre 20mg de xarelto");
        }

        if (med == 2 && peso <= 65) {
            System.err.println("con un peso de "+peso+ "ha de prendre 500mg de amoxicilina");
        }else if (med == 2 && peso >= 65){
            System.err.println("con un peso de "+peso+ "ha de prendre 1g de amoxicilina");
        }
        
        if (med == 3 && peso <= 80) {
            System.err.println("con un peso de "+peso+ "ha de prendre 20mg de fluoxetina");
        }else if (med == 3 && peso >= 80) {
            System.err.println("con un peso de "+peso+ "ha de prendre 40mg de fluoxetina");
        }
        
        

    }
}
