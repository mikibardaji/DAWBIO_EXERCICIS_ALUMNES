/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Modelo.MostraDAO;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abrah
 */
public class Run {
       public static void start() {
        // 1. Creamos la base de datos (lista de muestras)
        List<MostraDAO> bancDeDades = new ArrayList<>();
        
        // 2. Configuramos el Menú usando tu clase Menu.java
        Menu menuBioBank = new Menu("SISTEMA BIOBANK");
        menuBioBank.afegirOpcio("Ingressar mostra");
        menuBioBank.afegirOpcio("Llistar banc de dades");
        menuBioBank.afegirOpcio("Estadístiques de seqüenciació");
        menuBioBank.afegirOpcio("Actualitzar longitud");
        menuBioBank.afegirOpcio("Eliminar mostra");
        menuBioBank.afegirOpcio("Sortir del sistema");
        
        // El número de la opción de salida es 6
        int opcioSortida = 6;
        int opcioSeleccionada = 0;

        // 3. Bucle principal
        do {
            menuBioBank.mostrarMenu();
            opcioSeleccionada = menuBioBank.llegirOpcioValida();

            switch (opcioSeleccionada) {
                case 1:
                    System.out.println("-> Acció: Ingressar mostra");
                    // Aquí llamarías a un método: ingresarMostra(bancDeDades);
                    break;
                case 2:
                    System.out.println("-> Acció: Llistar banc de dades");
                    if(bancDeDades.isEmpty()) System.out.println("El banc està buit.");
                    for(MostraDAO m : bancDeDades) System.out.println(m);
                    break;
                case 3:
                    System.out.println("-> Acció: Estadístiques");
                    break;
                case 4:
                    System.out.println("-> Acció: Actualitzar longitud");
                    break;
                case 5:
                    System.out.println("-> Acció: Eliminar mostra");
                    break;
                case 6:
                    System.out.println("Sortint del sistema... Adeu!");
                    break;
            }
        } while (opcioSeleccionada != opcioSortida);
    }
}
