import Objectes.Botella;
import java.util.Scanner;

public class teoriaobjectes {

    
    public static void main(String[] args){

    Scanner sc;
    Botella bottle;
    bottle = new Botella();

    System.out.println("Material " + bottle.getMaterial());
    System.out.println("Capacidad " + bottle.getCapacidad());
    System.out.println("Liquido " + bottle.getLiquido());
    System.out.println("Tapon " + bottle.isTapon());
    System.out.println("Diametro " + bottle.getDiametro());
    bottle.plenar();
    System.out.println("Capacidad " + bottle.getCapacidad());
    System.out.println("Liquido " + bottle.getLiquido());
    System.out.println("Vaig a tirar liquido ->" + bottle.verter());
    System.out.println("Capacidad " + bottle.getCapacidad());
    System.out.println("Liquido " + bottle.getLiquido());
    bottle.obrirse();
    System.out.println("Vaig a tirar liquido ->" + bottle.verter());
    System.out.println("Capacidad " + bottle.getCapacidad());
    System.out.println("Liquido " + bottle.getLiquido());

    Botella bottle2 = new Botella(100,3);
    System.out.println("Nova ampolla amb constructor no buit");
    System.out.println("Material " + bottle.getMaterial());
    System.out.println("Capacidad " + bottle.getCapacidad());
    System.out.println("Liquido " + bottle.getLiquido());
    System.out.println("Tapon " + bottle.isTapon());
    System.out.println("Diametro " + bottle.getDiametro());
    bottle.plenar();
    System.out.println("Capacidad " + bottle.getCapacidad());
    System.out.println("Liquido " + bottle.getLiquido());
    System.out.println("Vaig a tirar liquido ->" + bottle.verter());
    System.out.println("Capacidad " + bottle.getCapacidad());
    System.out.println("Liquido " + bottle.getLiquido());
    bottle.obrirse();
    System.out.println("Vaig a tirar liquido ->" + bottle.verter());
    System.out.println("Capacidad " + bottle.getCapacidad());
    System.out.println("Liquido " + bottle.getLiquido());
    
    }
}
