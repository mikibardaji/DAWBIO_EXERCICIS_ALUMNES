package objectes;

import objectes.Ampolla;
import java.util.Scanner;

public class objectes
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Ampolla bottle;
        bottle = new Ampolla();
        
        System.out.println("Material : " + bottle.getMaterial());
        System.out.println("Capacidad : " + bottle.getCapacidad());
        System.out.println("Líquido : " + bottle.getLiquido());
        System.out.println("Tapón : " + bottle.isTapon());
        System.out.println("Diámetro : " + bottle.getDiametro());
        System.out.println("Estoy llenando la botella....");
        bottle.plenar();
        System.out.println("Capacidad : " + bottle.getCapacidad());
        System.out.println("Líquido : " + bottle.getLiquido());   
        System.out.println("Voy a tirar líquido sin quitar el tapón -> " + bottle.verter() );
        System.out.println("Capacidad : " + bottle.getCapacidad());
        System.out.println("Líquido : " + bottle.getLiquido());   
        bottle.obrir();
        System.out.println("Voy a tirar líquido sin quitar el tapón -> " + bottle.verter() );
        System.out.println("Capacidad : " + bottle.getCapacidad());
        System.out.println("Líquido : " + bottle.getLiquido());   
        Ampolla bottle2 = new Ampolla(100, 7);
        
        System.out.println("Nueva botella con constructor no vacío");
        System.out.println("Material : " + bottle2.getMaterial());
        System.out.println("Capacidad : " + bottle2.getCapacidad());
        System.out.println("Líquido : " + bottle2.getLiquido());
        System.out.println("Tapón : " + bottle2.isTapon());
        System.out.println("Diámetro : " + bottle2.getDiametro());        
    }
}