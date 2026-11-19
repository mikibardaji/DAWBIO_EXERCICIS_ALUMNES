/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex19funcions;

/**
 *
 * @author ama5753
 */
public class Ex19Funcions {

    /**
     * @param args the command line arguments
     Programa amb un menú de tres opcions: 0. Sortir. 1. Càlculs amb rectangles 2. Càlculs amb triangles

El programa presentarà iterativament el menú a l’usuari perquè esculli una de les opcions fins que esculli sortir.

Cal crear un mètode void mostraMenu() per mostrar el menú.

Per a cada figura es calcularà el perímetre i l’àrea. Cal fer funcions per:

• Demanar cadascuna de les dades d’entrada (si es pot fer reaprofitant en algun cas reaprofitant funcions), també la funció de les dades d’entrada sol ha de retornar numeros positius, sino no pot acabar la funció.

• Una funció per calcular el perimetre per cada una de les figures. Una per cada figura.

• Una funció per calcular l’area de cada figura, una per cada figura.

• Crear el main que cridi a cadascuna de les funcions, i que funcioni.

====== MENÚ PRINCIPAL ====== 0. Sortir

Càlculs amb rectangles
Càlculs amb triangles Escull una opció: 1
--- CÀLCULS AMB RECTANGLES ---

Introdueix la base del rectangle: 5

Introdueix l'altura del rectangle: 3.5

Perímetre del rectangle: 17,00

Àrea del rectangle: 17,50

====== MENÚ PRINCIPAL ====== 0. Sortir

Càlculs amb rectangles
Càlculs amb triangles
Escull una opció: 0

Fins aviat! Sortint del programa...

====== MENÚ PRINCIPAL ====== 0. Sortir

Càlculs amb rectangles
Càlculs amb triangles Escull una opció: 5
Error: Opció no vàlida. Torna-ho a intentar.

====== MENÚ PRINCIPAL ====== 0. Sortir

Càlculs amb rectangles
Càlculs amb triangles Escull una opció: 2
--- CÀLCULS AMB TRIANGLES --- Introdueix la base del triangle: -4

Error: El número ha de ser estrictament positiu (major que 0).

Introdueix la base del triangle: 0

Error: El número ha de ser estrictament positiu (major que 0). Introdueix la base del triangle: 6 Introdueix l'altura del triangle: 4 Introdueix el segon costat del triangle: 5 Introdueix el tercer costat del triangle: 5 Perímetre del triangle: 16,00 Àrea del triangle: 12,00

====== MENÚ PRINCIPAL ====== 0. Sortir

Càlculs amb rectangles
Càlculs amb triangles Escull una opció: 0 Fins aviat! Sortint del programa...
     */
    public static void main(String[] args) {
        // TODO code application logic here


      
    }

      public static void mostraMenu() {

        System.out.println("\n===== MENU PRINCIPAL =====");
        System.out.println("0. Salir");
        System.out.println("1. Calculos con rectangulos");
        System.out.println("2. Calculos con circulos");
        System.out.println("Elige una opcion (0,1,2): ");
    }

    // Metodo que calcula el area del rectangulo
    public static double areaRectangulo(double base, double altura) {

        return base * altura;
    }

    // Metodo que calcula el perimetro del rectangulo
    public static double perimetroRectangulo(double base, double altura) {

        return 2 * (base + altura);
    }

    
}
