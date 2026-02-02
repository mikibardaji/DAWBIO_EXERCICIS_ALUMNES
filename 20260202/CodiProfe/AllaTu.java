/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package allatu;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class AllaTu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] todosPremiosPrograma = ponerListaPremios();
        mostrarTodosLosPremios(todosPremiosPrograma);
        /* 
        Completar la clase Caja
        ponerle getters, setters si hace falta.
        Y luego cambiar el codigo a partir de aqui
        para adaptarll al objeto java.
        Acordarse que todas las pasiciones del array
        se deben inicializar con un constructor!
        */
        Caja[] ObjetosCaja = new Caja[todosPremiosPrograma.length];
        //totes les posiciones de cajas estan a null!!
        //per inicialitzarles haig de fer un new Caja(valorPremio);
        int[] cajas = sortearCajas(todosPremiosPrograma);
        mostrarEstadoCaja(cajas);
        Scanner sc = new Scanner(System.in);
        System.out.println("Que caja quieres maximo - " + cajas.length);
        final int caja_elegida = sc.nextInt();
        int cajasAbiertas =0;
        int descarte=0, oferta=0;
        boolean plantarte = false;
        do
        {
            mostrarTodosLosPremios(todosPremiosPrograma);
            mostrarEstadoCaja(cajas);
            descarte=elegirCaja(cajas.length);
            mostrarPremioCaja(cajas, descarte);
            cajasAbiertas++;
            if (cajasAbiertas%3==0) //llamada banquero
            {
                oferta = ofertaBanca(cajas);
                System.out.println("Banquero te ofrece " + oferta + " € ");
                plantarte = pedirSiTePlantas();
            }
        }while(!plantarte && cajasAbrir(cajas));
        if (plantarte)
        {
            System.out.println("Has ganado " + oferta);
        }
        System.out.println("Tu caja tenia" + mostrarPremioCaja(cajas, caja_elegida-1));
    }
    
    /*
    •	PonerListaPremios() poner todos los premios ordenados posibles
Array con X posiciones donde pones todos los valores.
Retornas el array con todos los premios
	Entrada() nada
	Salada retornar int[] premiosConcurso

    */
    public static int[] ponerListaPremios()
    {
        int[] todosPremiosPrograma = {10,20,30,50,100,500,1000,2000};
        return todosPremiosPrograma;
    }
    
    /* 
    •	sortearCajas() coger todos los premios y ponerlos aleatoriamente en cajas
Variables Entrada premiosConcurso
	Bucle coges cada premio y con un random (lenght) y pones el premio 
El array de caja, validando que la posicion no tenga ya premio (sino otro random)
Variables salida     
    
    */
    public static int[] sortearCajas(int[] premiosOrdenados)
    { //{10,100,500,1000,5000,10000}
        int[] cajas = new int[premiosOrdenados.length];
        Random rd = new Random();
        for (int i = 0; i < premiosOrdenados.length; i++) {
            int posicion;
            do
            {
                posicion = rd.nextInt(premiosOrdenados.length);
            }while(cajas[posicion]!=0); 
            cajas[posicion] = premiosOrdenados[i];
        }
        System.out.println("Cajas ya sorteadas");
        return cajas;
    }
    
    /*
    •	MostrarTodosLosPremiosPrograma() mostrarte todos los premios del Programa 
o	ArrayPremiosConcurso
?	Muestra todos los valores de premios
*/
    public static void mostrarTodosLosPremios(int[] premiosOrdenados)
    {
        System.out.println("Premios aun por abrir");
        for (int i = 0; i < premiosOrdenados.length; i++) {
            if(premiosOrdenados[i]!=0) //si esta a 0 no se muestra
            {
                System.out.print(premiosOrdenados[i]+"-");
            }
        }
        System.out.println("");
    }
    
    /**
     * •	MostrarPremioCaja(….) mostrarte el dinero que tiene la caja que descartas
o	Entrada arrayCajas (premios desordenados)
o	Entrada Valor entero posición
o	Salida valorPremioCaja (mostrar print , o devolver)
*       poner esa posición a 0 marcada abierta
     */
    public static int mostrarPremioCaja(int[] cajas, int cajaDescartada)
    {
        System.out.println("Has descartado " + cajas[cajaDescartada] + "€");
        int premio = cajas[cajaDescartada];
        cajas[cajaDescartada] = 0;
        return premio; //return cajas[cajaDescartada]
    }
    
    /**
     * •	ElegirCaja(..) pedir una posición al usuario, dentro del numero de cajas posibles
    o	Entrada necesita valor de longitud array
    o	Pregunta que caja eliges
    o	Valida que el numero sea dentro del numero cajas (
    o	Devuelve el valor pedido valido
     * @param cajas 
     */
    public static int elegirCaja(int lenght) //longitud array juego
    {
        Scanner sc = new Scanner(System.in);
        int posicion;
        do
        {    
            System.out.println("Caja a descartar 1-" + lenght);
            posicion = sc.nextInt();
        }while(posicion<1 || posicion>lenght);
        return posicion;
    }
    
    /* 
    •	ofertaBanca(…) banca piensa que oferta y la devuelve 
        o	Necesita el array con valores (arrayCajjas)
        ?	Suma todos los valores del array no abiertos (variable acumulativa)
        ?	Divide por cajas por abrir (variable contador)
        ?	Retorna el valor
    */
    public static int ofertaBanca(int[] cajas)
    {
        int acumPremiosDescubrir = 0;
        int cajasAbrir=0;
        for (int i = 0; i < cajas.length; i++) {
            if (cajas[i]!=0) // no abierta
            {
                acumPremiosDescubrir += cajas[i];
                cajasAbrir++;
            }
        }
        return acumPremiosDescubrir/cajasAbrir;
    }
    
    /*
    •	mostrarEstadoCaja() mostrar el numero de las cajas que aún están por abrir
    o	arrayCajas (tendrá premios y posiciones a0)
    o	Mostrar la posición  (índice) de solo las que no están a 0
    */
    public static void mostrarEstadoCaja(int[] cajas)
    {
        System.out.println("Cajas por abrir");
        for (int i = 0; i < cajas.length; i++) {
            if (cajas[i]>0)
            {
                System.out.print((i+1) + "-");
            }
        }
        System.out.println("");
    }
  
    /*
    •	pedirSiTeplantas() pedir al usuario si se planta
    o	Pide si te plantas 
    o	Retorna True si dices Si, false en otro caso

    */
    public static boolean pedirSiTePlantas()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres plantarte(Si/No");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("SI"))
            return true;
        else
            return false;
    }

    /** contar si hay mas de una caja por abrir
     * una es la que juegas
     * @param cajas
     * @return 
     */
    private static boolean cajasAbrir(int[] cajas) {
        int abrir=0;
        for (int i = 0; i < cajas.length; i++) {
            if (cajas[i]!=0)
            {
                abrir++;
            }
            if (abrir>1)
            {
                return true;
            }
            
        }
        return false;
    }
    
    
    
    
}
