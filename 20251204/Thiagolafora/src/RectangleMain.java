import Objectes.Rectangle;

public class RectangleMain {

    public static void main(String[] args) {

    
        Rectangle r1 = new Rectangle(0, 0, 5, 5);
        Rectangle r2 = new Rectangle(7, 9, 2, 3);

        System.out.println("Situació inicial:");
        r1.imprimir();
        r2.imprimir();

        
        System.out.println("Modificant r1 amb noves coordenades vàlides...");
        r1.setX1Y1(1, 1);
        r1.setX2Y2(10, 10);
        r1.imprimir();

        
        System.out.println("Intentant posar coordenades incorrectes a r1...");
        r1.setAll(50, 50, 20, 20);
        r1.imprimir();

       
        System.out.println("Generant un rectangle aleatori:");
        Rectangle aleatori = Rectangle.crearAleatori();
        aleatori.imprimir();
    }
}
