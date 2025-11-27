import objectes.Botella;
import objectes.Got;


import java.util.Scanner;
public class main {
   
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        Botella bottle; //add import objectes.Botella;
        bottle=new Botella();
        System.out.println("Material: " + bottle.getMaterial());
        System.out.println("Capacitat: " + bottle.getCapacitat());
        System.out.println("Liquid: " + bottle.getLiquido());
        System.out.println("Tapon: " + bottle.isTapon());
        System.out.println("Diametro: " + bottle.getdiametro());
        bottle.plenar();
        System.out.println("Capacitat: " + bottle.getCapacitat());
        System.out.println("Liquido: " + bottle.getLiquido());
        System.out.println("Vaig a tirar liquido (sin quitar tapon): " + bottle.verter());
        System.out.println("Capacitat: " + bottle.getCapacitat());
        System.out.println("Liquido: " + bottle.getLiquido());
        bottle.obrir();
        System.out.println("Vaig a tirar liquido (quitando tapon): " + bottle.verter());
        System.out.println("Capacitat: " + bottle.getCapacitat());
        System.out.println("Liquido: " + bottle.getLiquido());
        Botella bottle2 = new Botella(100,3);
        System.out.println("Nova botella amb constructor no vuit!");
        System.out.println("Material: " + bottle2.getMaterial());
        System.out.println("Capacitat: " + bottle2.getCapacitat());
        System.out.println("Liquid: " + bottle2.getLiquido());
        System.out.println("Tapon: " + bottle2.isTapon());
        System.out.println("Diametro: " + bottle2.getdiametro());
        bottle.plenar();
        System.out.println("Capacitat: " + bottle2.getCapacitat());
        System.out.println("Liquido: " + bottle2.getLiquido());
        System.out.println("Vaig a tirar liquido (sin quitar tapon): " + bottle2.verter());
        System.out.println("Capacitat: " + bottle2.getCapacitat());
        System.out.println("Liquido: " + bottle2.getLiquido());
        bottle.obrir();
        System.out.println("Vaig a tirar liquido (quitando tapon): " + bottle2.verter());
        System.out.println("Capacitat: " + bottle2.getCapacitat());
        System.out.println("Liquido: " + bottle2.getLiquido());
        Got bottle3 = new Got();
        System.out.println("Material: " + bottle.getMaterial());
        System.out.println("Capacitat: " + bottle.getCapacitat());
        System.out.println("Liquid: " + bottle.getLiquido());
        System.out.println("Tapon: " + bottle.isTapon());
        System.out.println("Diametro: " + bottle.getdiametro());
        Got got = new Got();
        System.out.println("Material  got: " + got.getMaterial());
        System.out.println("Diametro  got: " + got.getdiametro());
        System.out.println("Capacidad got: " + got.getCapacitat());
        System.out.println("Liquido  got: " + got.getLiquido());
        got.afegirliq(5);
        System.out.println("Añadim liquid...");
        System.out.println("Liquid al got actual: " + got.getLiquido());

    }
}


