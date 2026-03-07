/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crudbasico;

import Objetos.Luchador;
import Objetos.NotValidWeightException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author smo4567
 */
public class CRUDBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        List<Luchador> mundial;
        mundial = new ArrayList();
        LuchadoresIniciales(mundial);
        do {
            mostrarMenu();


                boolean valorEntero = false;
                
                do{
                    try
                        {
                            opcion = sc.nextInt();
                            valorEntero = true;
                            sc.nextLine();
                        }
                    catch(InputMismatchException ex)
                    {
                          System.out.println("? Debes introducir un número.");
                          sc.nextLine();
                    }
                }while(!valorEntero);
                
                

                if (opcion < 1 || opcion > 7) {
                    System.out.println("? Opción no válida. Debe ser entre 1 y 7.");
                } else {
                    switch (opcion) {
                        case 1:
                            System.out.println("? Alta Luchador.");
                            altaLuchador(mundial);
                            break;
                        case 2:
                            ListarLuchadores(mundial);
                            break;
                        case 3:
                            borrarLuchador(mundial);
                            break;
                        case 4:
                           listarLuchadoresPeso(mundial);
                            break;
                        case 5:
                           introducirLuchador(mundial);
                            break;
                        case 6:
                            RenombrarLuchador(mundial);
                            break;
                            
                        case 7:
                            System.out.println("Saliendo del programa...");
                            break;
                    }
                }
        } while (opcion != 7);

        sc.close();
    }

    private static void mostrarMenu() {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Alta Luchador");
            System.out.println("2. Listar todos Luchadores");
            System.out.println("3. Borrar Luchador");
            System.out.println("4. Listar Luchadores por categoria de peso.");
            System.out.println("5. Introducir nuevo luchador en una posición concreta");
            System.out.println("6. Cambiar nombre luchador");  
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
    }

    private static void altaLuchador(List<Luchador> mundial) {
        Scanner sc = new Scanner(System.in);
         try {
        System.out.println("Pon el numero de licencia");
        int id = sc.nextInt();
        sc.nextLine(); //limpio el buffer o el que es lo mismo el return
        System.out.println("Pon el nombre del luchador");
        String nombre = sc.nextLine();
        System.out.println("Pon el peso del luchador");
        int peso = sc.nextInt();
        sc.nextLine(); //limpio el buffer o el que es lo mismo el return
        
        Luchador wrestler = new Luchador(id, nombre);
       
        wrestler.setPeso(peso);
        
        if (mundial.add(wrestler))
        {
            System.out.println("Luchador añadido");
        }
        else
        {
            System.out.println("Luchador no se ha podido añadir");
        }
        
        
        } catch (NotValidWeightException ex) {
             System.out.println(ex.getMessage());
             System.out.println("Vuelve a intentar dar de alta");
        }
        
        
        
    }
 public static void ListarLuchadores(List<Luchador> mundial)
    {   
    
     System.out.println("Luchadores en el mundial: " + mundial.size());
        for (Luchador wwe : mundial) { //for each (Iterable)
            System.out.println(wwe);
        }
}
 

private static void borrarLuchador(List<Luchador> mundial) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Pon la licencia que quieres eliminar del mundial");
        int idLicencia = sc.nextInt();
        sc.nextLine(); //limpio el buffer o el que es lo mismo el return
        
        Luchador eliminado = new Luchador(idLicencia, "");
                              
        if (mundial.remove(eliminado))
            System.out.println("Luchador eliminado del mundial " + eliminado.getIdLicencia());
        else
            System.out.println("No existeix el registre sel·lecionat");
       
}

private static void RenombrarLuchador(List<Luchador> mundial) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Pon la licencia que quieres eliminar del mundial");
        int idLicencia = sc.nextInt();
        sc.nextLine(); //limpio el buffer o el que es lo mismo el return
        
        System.out.println("¿Cúal es el nuevo nombre del luchador?");
        String nouNom =sc.nextLine();
        
        Luchador cambiado = new Luchador(idLicencia, nouNom);
        int id = mundial.indexOf(cambiado);
        
        
        mundial.set(id,cambiado);
            System.out.println("Luchador eliminado del mundial " + cambiado.getIdLicencia());
        
}
private static void listarLuchadoresPeso(List<Luchador> mundial) {
          /*1era parte recogida datos (teclado, fichero, bd)
             casi siempre esta pero no en todos */
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon la categoria y te dire que luchadores pueden luchar");
        String categoria = sc.nextLine().toUpperCase();
        int pesoLimite=0;
        switch(categoria)
        {
            case "MOSCA":
                pesoLimite = 57;
                break;
            case "GALLO":
                pesoLimite = 62;
                break;                
            case "PLUMA":
                pesoLimite = 65;
                break;         
            case "SEMIPESADO":
                pesoLimite = 100;
                break;      
            case "PESADO":
                pesoLimite = 200;
                break;                      
        }
        
           /*2 segudna parteinteraccion con la estructura dados compleja (add/read/delete/updte, rpalce
        obligatoria*/
        List<Luchador> luchadorSeleccioPeso = new ArrayList<>();
        for (int i = 0; i < mundial.size(); i++) {
            //System.out.println(i + "-" + mundial.get(i));
            if (mundial.get(i).getPeso()<= pesoLimite)
            {//cumples criterio
                //System.out.println("seleccionado");
                luchadorSeleccioPeso.add(mundial.get(i)); //voy poniendo los validos
            }
        }
        //luchadorSeleccioPeso sera un array con luchadores validos
           
           //3 parte salida datos
        int num=1;
        for (Luchador fighter : luchadorSeleccioPeso) {
            System.out.println(num + "- " + fighter);
            num++;
        }
        System.out.println("Luchadores peso " + categoria + " : "  + luchadorSeleccioPeso.size());
    }





private static void LuchadoresIniciales(List<Luchador> mundial) {
         try {
            System.out.println("Añadiendo 4 luchadores de prueba.... ");
        Luchador ejemplo = new Luchador(2, "Topuria");
        ejemplo.setPeso(100);
        mundial.add(ejemplo);
        ejemplo = new Luchador(3, "Joan");
        ejemplo.setPeso(88);
        mundial.add(ejemplo);
        ejemplo = new Luchador(10, "Goku");
        ejemplo.setPeso(74);
        mundial.add(ejemplo);
        ejemplo = new Luchador(99, "Vegeta");
        ejemplo.setPeso(64);
        mundial.add(ejemplo);
        } catch (NotValidWeightException ex) {
            System.out.println("Peso no valido");
        }
    }

private static void introducirLuchador(List<Luchador> mundial) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("En que posición quieres registrar al luchador?");
        int posicion = sc.nextInt();
        sc.nextLine();   
        System.out.println("Pon el numero de licencia");
        int id = sc.nextInt();
        sc.nextLine(); //limpio el buffer o el que es lo mismo el return
        System.out.println("Pon el nombre del luchador");
        String nombre = sc.nextLine();
        System.out.println("Pon el peso del luchador");
        int peso = sc.nextInt();
        sc.nextLine(); //limpio el buffer o el que es lo mismo el return
        
        Luchador wrestler = new Luchador(id, nombre);
        
        wrestler.setPeso(peso);
       
        if (posicion >= 0 && posicion < mundial.size()) {
            Luchador actual=mundial.get(posicion);
            System.out.println("¿Quiere sustituir al luchador " + actual.toString()+"? (S/N)");
            String respuesta = sc.next().toUpperCase(); 
            sc.nextLine(); 
            if (respuesta.equals("S")){
            mundial.set(posicion, wrestler);
            System.out.println("Luchador sustituido en la posición " + posicion);
            }
            else {
            System.out.println("El Luchador se introducirá al final de la lista.");
            mundial.add(wrestler);
            }
        } else {
            // Si està fora de rang (negatiu o massa gran), el posem al final
            mundial.add(wrestler);
            System.out.println("Posición no válida. Luchador añadido al final de la llista (Índice: " + (mundial.size() - 1) + ")");
        }
        
        
        } catch (NotValidWeightException ex) {
             System.out.println(ex.getMessage());
             System.out.println("Vuelve a intentar dar de alta");
        } catch (InputMismatchException e) {
        System.out.println("ERROR: Has de introducir un número entero");
        sc.nextLine(); // Netegem el buffer del Scanner
        
    }
        
        
    }

}
