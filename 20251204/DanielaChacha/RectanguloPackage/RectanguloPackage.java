package RectanguloPackage;
import java.util.Scanner;

import RectanguloPackage.Rectangulo;
import coodenadasPunto.punto;

public class RectanguloPackage 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);


        Rectangulo rectangulo1= new Rectangulo(0,0, 5, 5);
        Rectangulo rectangulo2= new Rectangulo(7,9, 2, 3);

        rectangulo1.mostrarCoordenadas();
        rectangulo2.mostrarCoordenadas();
        
    }
}
