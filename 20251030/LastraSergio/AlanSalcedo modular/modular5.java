import java.util.Scanner;

public class modular5 {


    public static double millesAKm(int milles) {
        return milles * 1.6093;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introdueix una distància en milles: ");
        int milles = entrada.nextInt();

        double quilometres = millesAKm(milles);

        System.out.println(milles + " milles equivalen a " + quilometres + " quilòmetres.");
        
        entrada.close();
    }
}