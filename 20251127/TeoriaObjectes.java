
import Objectes.Ampolla;

public class TeoriaObjectes {

    public static void main(String[] args) {

        Ampolla bottle = new Ampolla();

        System.out.println("Capacidad de la botella: " + bottle.getCapacidad());
        System.out.println("Material de la botella: " + bottle.getMaterial());
        System.out.println("Diametro de la botella: " + bottle.getDiametro());
        System.out.println("Cantidad de liquido en la botella: " + bottle.getLiquido());
        System.out.println("¿La botella tiene tapon? " + bottle.isTapon());
        System.out.println("Ara pleno ampolla");
        bottle.plenar();
        System.out.println("Capacidad: " + bottle.getCapacidad());
        System.out.println("Liquido actual: " + bottle.getLiquido());
        System.out.println("Vaig a tirar liquido sense obrir el tapon -> " + bottle.verter());
        System.out.println("Liquido actual actual: " + bottle.getLiquido());
        bottle.obrir(); 
        System.out.println("Vaig a tirar liquido un cop obert el tapon -> " + bottle.verter());
        System.out.println("Liquido: " + bottle.getLiquido());
        bottle = new Ampolla(100, 3);
        System.out.println("Nova ampolla amb constructor no buit");
        System.out.println("Material de la botella: " + bottle.getCapacidad());
        System.out.println("Capacidad de la botella: " + bottle.getMaterial());
        System.out.println("Diametre: " + bottle.getDiametro());
        System.out.println("Liquido: " + bottle.getLiquido());
    }
}
