package Fonaments;

import java.util.Scanner;

import Objetos.Ampolla;
import Objetos.Got;

public class Teoria_Objetos {
    public static void main(String[] args) {
        Scanner sc;
        Ampolla bottle;
        bottle = new Ampolla();

        System.out.println("Capacidad de la botella: " + bottle.getCapacidad());
        System.out.println("Material de la botella: " + bottle.getMaterial());
        System.out.println("Diametro de la botella: " + bottle.getDiametro());
        System.out.println("Cantidad de liquido de la botella: " + bottle.getLiquido());
        System.out.println("La botella tiene tapa: " + bottle.getTapon());
        bottle.plenar();

        //----------------------------------------------------------------------------

        Got got;
        got = new Got();   

        System.out.println("Capacidad del vaso: " + got.getCapacidad());
        System.out.println("Liquido del vaso: " + got.getLiquido());
        System.out.println("Material del vaso: " + got.getMaterial());
        System.out.println("Diametro del vaso: " + got.getDiametro());

        got.plenar(34);

        System.out.println("Líquid final del got: " + got.getLiquido());
    }
}
