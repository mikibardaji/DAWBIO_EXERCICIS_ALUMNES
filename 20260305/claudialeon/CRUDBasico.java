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
 * @author claud
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
        añadirDatosEjemplo(mundial);
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
                    System.out.println("? Opción no válida. Debe ser entre 1 y 5.");
                } else {
                    switch (opcion) {
                        case 1:
                            System.out.println("? Alta Luchador.");
                            altaUsuario(mundial);
                            break;
                        case 2:
                            System.out.println("? Listar todos Luchadores");
                            listarLuchadores(mundial);
                            break;
                        case 3:
                            System.out.println("? Borrar Luchador");
                            borrarLuchador(mundial);
                            break;
                        case 4:
                            System.out.println("? Aquí irá el código de la opción 4.");
                            listarLuchadoresPeso(mundial);
                            break;
                            
                        case 5:
                            cambiarNombre(mundial);
                            break;
                         case 6:
                            añadirluchador(mundial);
                            break;
                        case 7:
                            System.out.println("? Saliendo del programa...");
                            break;
                    }
                }
        } while (opcion != 7);

        sc.close();
    }

    private static void mostrarMenu() {
            System.out.println("===== MENÚ =====");
            System.out.println("1. Alta Luchador");
            System.out.println("2. Listar todos Luchadores");
            System.out.println("3. Borrar Luchador");
            System.out.println("4. Listar Luchadores por categoria peso");
            System.out.println("5. Añadir Luchador en posicion elegida");
            System.out.println("6. Canviar nombre luchador (pedir idLicencia)");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
    }

    private static void altaUsuario(List<Luchador> mundial) {
        Scanner sc = new Scanner(System.in);
         try {
             /*1era parte recogida datos (teclado, fichero, bd)
             casi siempre esta pero no en todos */
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
        /*interaccion con la estructura dados compleja (add/read/delete/updte, rpalce
        obligatoria*/
        if (mundial.add(wrestler))
        {//salida datos 
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

    private static void añadirDatosEjemplo(List<Luchador> mundial) {
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
        ejemplo = new Luchador(50, "Musculator");
        ejemplo.setPeso(63);
        mundial.add(ejemplo);        
        } catch (NotValidWeightException ex) {
            System.out.println("Peso no valido");
        }
    }

    private static void listarLuchadores(List<Luchador> mundial) {
        /*1era parte recogida datos (teclado, fichero, bd)
             casi siempre esta pero no en todos */
        //como quiero a todos los luchadores , el usuario no hace falta que me pase datos
        /*interaccion con la estructura dados compleja (add/read/delete/updte, rpalce
        obligatoria*/
        int num=1;
        for (Luchador fighter : mundial) {
            //salida datos
            System.out.println(num + "-" +fighter);
            num++;
        }
        System.out.println("Luchadores en el mundial: " + mundial.size());
    }

    private static void borrarLuchador(List<Luchador> mundial) {
        /*1era parte recogida datos (teclado, fichero, bd)
             casi siempre esta pero no en todos */
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon la licencia que quieres dar de baja");
        int idLicencia = sc.nextInt();
        sc.nextLine();
        
        Luchador fakeDelete = new  Luchador(idLicencia, "fakeNombre");
        /*2 segudna parteinteraccion con la estructura dados compleja (add/read/delete/updte, rpalce
        obligatoria*/
        if (mundial.remove(fakeDelete))
        {//3 parte salida datos
            System.out.println("Luchador eliminado mundial");
        }
        else
        {
            System.out.println("No he podido borrar luchador con licencia " 
                    + fakeDelete.getIdLicencia());
        }
        
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

    private static void cambiarNombre(List<Luchador> mundial) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon la licencia que quieres dar de baja");
        int idLicencia = sc.nextInt();
        sc.nextLine();
        System.out.println("Pon nuevo nombre");
        String  nombre = sc.nextLine();
        //podria fer un bucle per tots els lluitadors
        //i preguntar per id
        int i, pos_encontrada=-1;
        for (i = 0; i < mundial.size(); i++) {
            if (mundial.get(i).getIdLicencia()==idLicencia)
            {
                pos_encontrada=i;
                //break;
            }
        }
        if (pos_encontrada!=-1)
        {//encontre
            mundial.get(pos_encontrada).setNombre(nombre);
        }
        
        Luchador fakeBuscar = new  Luchador(idLicencia, "fakeNombre");
        int posicio = mundial.indexOf(fakeBuscar); //equals
        if (posicio == -1)
        {
            System.out.println("Luchador no existe con licencia " + idLicencia);
        }
        else
        {
          //  Luchador cambiar = mundial.get(posicio);
          //  cambiar.setNombre(nombre);
          mundial.get(posicio).setNombre(nombre);
            System.out.println("Nombre cambiado" + mundial.get(posicio));
        }
        
    }
    private static void añadirluchador(List<Luchador> mundial) {
    Scanner sc = new Scanner(System.in);
    
    try {
        System.out.println("En que posicion quieres añadir el luchador?");
        int posicion = sc.nextInt();
        sc.nextLine();

        System.out.println("Pon el numero de licencia");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Pon el nombre del luchador");
        String nombre = sc.nextLine();

        System.out.println("Pon el peso del luchador");
        int peso = sc.nextInt();
        sc.nextLine();

        Luchador wrestler = new Luchador(id, nombre);
        wrestler.setPeso(peso);

        if (posicion >= 0 && posicion <= mundial.size()) {
            mundial.add(posicion, wrestler);
            System.out.println("Luchador añadido en la posicion " + posicion);
        } else {
            mundial.add(wrestler);
            System.out.println("Posicion no valida. Luchador añadido al final");
        }

    } catch (NotValidWeightException ex) {
        System.out.println(ex.getMessage());
        System.out.println("Vuelve a intentar dar de alta");
    }
}
}

