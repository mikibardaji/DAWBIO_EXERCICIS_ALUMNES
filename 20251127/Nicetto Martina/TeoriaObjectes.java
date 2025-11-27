import java.util.Scanner;

import objetos.Botella;
import objetos.exbotella;

public class TeoriaObjectes {

      public static void main(String[] args) {
        Scanner sc;
        Botella bottle;
        bottle = new Botella();
        
        System.out.println("material : " + bottle.getMaterial());
        System.out.println("capacidad : " + bottle.getCapacitat());
        System.out.println("liquido : " + bottle.getLiquido());
        System.out.println("Tapon : " + bottle.isTapon());
        System.out.println("Diametro : " + bottle.getdiametro());
        System.out.println("Ara pleno ampolla....");
        bottle.plenar();
        System.out.println("capacidad : " + bottle.getCapacitat());
        System.out.println("liquido : " + bottle.getLiquido());   
        System.out.println("Vaig a tirar liquido sin quitar tapon -> " + bottle.verter() );
        System.out.println("capacidad : " + bottle.getCapacitat());
        System.out.println("liquido : " + bottle.getLiquido());   
        bottle.obrir();
        System.out.println("Vaig a tirar liquido sin tapon -> " + bottle.verter() );
        System.out.println("capacidad : " + bottle.getCapacitat());
        System.out.println("liquido : " + bottle.getLiquido());   
        Botella bottle2 = new Botella(100, 7);
        
        System.out.println("Nova ampolla amb constructor no buit");
        System.out.println("material : " + bottle2.getMaterial());
        System.out.println("capacidad : " + bottle2.getCapacitat());
        System.out.println("liquido : " + bottle2.getLiquido());
        System.out.println("Tapon : " + bottle2.isTapon());
        System.out.println("Diametro : " + bottle2.getdiametro());        
        
        
    }
    
}
