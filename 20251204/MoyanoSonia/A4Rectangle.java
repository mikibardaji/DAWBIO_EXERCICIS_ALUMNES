import Objectes.Rectangle;

public class A4Rectangle {

    public static void main(String[] args) {

        
        Rectangle r1 = new Rectangle(0, 0, 5, 5);
        Rectangle r2 = new Rectangle(7, 9, 2, 3); // Coordenades incorrectes de prova

        r1.imprimir();
        r2.imprimir(); // Per defecte resta a 0,0,0,0

        // Modificando valores con setters
        System.out.println("Modifiquem minims i màxims r1...");
        r1.setX1Y1(1, 1);
        r1.setX2Y2(10, 10);
        r1.imprimir();

        // Probando errores
        System.out.println("Provem errors al configurar coordenades");
        r1.setAll(50, 50, 20, 20); // ERROR
        r1.imprimir();

        
        System.out.println("Creem un rectangle aleatori:");
        Rectangle rA = Rectangle.crearAleatori();
        rA.imprimir();
    }
}
