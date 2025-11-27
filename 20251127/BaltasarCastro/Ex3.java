

package ampollla;

import java.util.Scanner;
import ampolla;


public class Ex3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ampolla fontVella = new ampolla(5.0, true, 400.0, 200.0, "Vidre");
        ampolla veri = new ampolla(10.0, true, 750.0, 600.0, "Plastic");
        System.out.println("FONT VELLA");
        System.out.println("Material : " + fontVella.getMaterial());
        System.out.println("Liquido : " + fontVella.getLiquido());
        System.out.println("Capacidad : " + fontVella.getCapacidad());
        System.out.println("Tapon : " + fontVella.isTapon());
        System.out.println("Diametre : " + fontVella.getDiametro());
        fontVella.plenar();
        System.out.println("Liquido : " + fontVella.getLiquido());
        System.out.println("Capacidad : " + fontVella.getCapacidad());
        fontVella.obrir();
        System.out.println("Vaig a tirar liquid " + fontVella.vertre());
        System.out.println("Liquido : " + fontVella.getLiquido());
        System.out.println("VERI");
        System.out.println("Material : " + veri.getMaterial());
        System.out.println("Liquido : " + veri.getLiquido());
        System.out.println("Capacidad : " + veri.getCapacidad());
        System.out.println("Tapon : " + veri.isTapon());
        System.out.println("Diametre : " + veri.getDiametro());
        
        
    }
    
}