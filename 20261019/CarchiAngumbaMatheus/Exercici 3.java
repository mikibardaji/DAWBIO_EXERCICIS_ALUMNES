/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author mca3765
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dona'm un número Natural, i et diré els nomeros parells des de 1");
        int num = lector.nextInt();
        int comptador = 2;
        System.out.println("Els números parells entre 1 i " + num +" son:" );
        while (comptador < num) {
            System.out.println(comptador);
            comptador +=2;
        }
        System.out.println("");
        System.out.println("Dona'm un altre número Natural, i et diré els nomeros parells des de 1: ");
        num =lector.nextInt() ;
        System.out.println("Els números parells entre 1 i " + num +" son:" );
        for (comptador = 2; comptador < num ; comptador+=2) {
            System.out.println(comptador);
        }
        }
        //TODO code application logic here
    }
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author mca3765
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Dona'm un número Natural, i et diré els nomeros parells des de 1");
        int num = lector.nextInt();
        int comptador = 2;
        System.out.println("Els números parells entre 1 i " + num +" son:" );
        while (comptador < num) {
            System.out.println(comptador);
            comptador +=2;
        }
        System.out.println("");
        System.out.println("Dona'm un altre número Natural, i et diré els nomeros parells des de 1: ");
        num =lector.nextInt() ;
        System.out.println("Els números parells entre 1 i " + num +" son:" );
        for (comptador = 2; comptador < num ; comptador+=2) {
            System.out.println(comptador);
        }
        }
        //TODO code application logic here
    }
    

