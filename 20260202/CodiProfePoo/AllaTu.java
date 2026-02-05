/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allatu;

/**
 *
 * @author bardaji
 */
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
        
        // Crear array de objetos Caja inicializados con los premios sorteados
        Caja[] objetosCaja = sortearCajas(todosPremiosPrograma);
        mostrarEstadoCaja(objetosCaja);
        
        System.out.println("Elige tu caja");
        final int caja_elegida = elegirCaja(todosPremiosPrograma.length);
        objetosCaja[caja_elegida].setElegida(true); //mar
        
        int cajasAbiertas = 0;
        int descarte = 0, oferta = 0, cantidadPerdida = 0;
        boolean plantarte = false;
        do
        {
            mostrarTodosLosPremios(todosPremiosPrograma);
            mostrarEstadoCaja(objetosCaja);
            descarte = elegirCaja(objetosCaja.length);
            cantidadPerdida = mostrarPremioCaja(objetosCaja, descarte);
            eliminarPremioPrograma(todosPremiosPrograma, cantidadPerdida);
            cajasAbiertas++;
            if (cajasAbiertas % 3 == 0) //llamada banquero
            {
                oferta = ofertaBanca(objetosCaja);
                System.out.println("Banquero te ofrece " + oferta + " � ");
                plantarte = pedirSiTePlantas();
            }
        }while(!plantarte && cajasAbrir(objetosCaja));
        if (plantarte)
        {
            System.out.println("Has ganado " + oferta);
        }
        System.out.println("Tu caja tenia " + mostrarPremioCaja(objetosCaja, caja_elegida));
    }
    
    /*
    �	PonerListaPremios() poner todos los premios ordenados posibles
Array con X posiciones donde pones todos los valores.
Retornas el array con todos los premios
	Entrada() nada
	Salada retornar int[] premiosConcurso

    */
    public static int[] ponerListaPremios()
    {
        int[] todosPremiosPrograma = {10,20,30,50};//,100,500,1000,2000};
        return todosPremiosPrograma;
    }
    
    /* 
    �	sortearCajas() coger todos los premios y ponerlos aleatoriamente en cajas
Variables Entrada premiosConcurso
	Bucle coges cada premio y con un random (lenght) y pones el premio 
El array de caja, validando que la posicion no tenga ya premio (sino otro random)
Variables salida     
    
    */
    public static Caja[] sortearCajas(int[] premiosOrdenados)
    { //{10,100,500,1000,5000,10000}
        Caja[] cajas = new Caja[premiosOrdenados.length];
        Random rd = new Random();
        for (int i = 0; i < premiosOrdenados.length; i++) {
            int posicion;
            do
            {
                posicion = rd.nextInt(premiosOrdenados.length);
            }while(cajas[posicion] != null);  //si no esta a null, ja he fica't valors
            cajas[posicion] = new Caja(premiosOrdenados[i]);
        }
        System.out.println("Cajas ya sorteadas");
        return cajas;
    }
    
    /*
    �	MostrarTodosLosPremiosPrograma() mostrarte todos los premios del Programa 
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
     * �	MostrarPremioCaja(�.) mostrarte el dinero que tiene la caja que descartas
o	Entrada arrayCajas (premios desordenados)
o	Entrada Valor entero posici�n
o	Salida valorPremioCaja (mostrar print , o devolver)
*       marcar esa caja como abierta
     */
    public static int mostrarPremioCaja(Caja[] cajas, int cajaDescartada)
    {
        System.out.println("Has descartado " + cajas[cajaDescartada].getPremio() + "€");
        cajas[cajaDescartada].setAbierta(true);
        return cajas[cajaDescartada].getPremio();
    }
    
    /**
     * �	ElegirCaja(..) pedir una posici�n al usuario, dentro del numero de cajas posibles
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
        return (posicion-1); //retorna la posicion del array, no el numero de caja
    }
    
    /* 
    �	ofertaBanca(�) banca piensa que oferta y la devuelve 
        o	Necesita el array con valores (arrayCajjas)
        ?	Suma todos los valores del array no abiertos (variable acumulativa)
        ?	Divide por cajas por abrir (variable contador)
        ?	Retorna el valor
    */
    public static int ofertaBanca(Caja[] cajas)
    {
        int acumPremiosDescubrir = 0;
        int cajasAbrir = 0;
        for (int i = 0; i < cajas.length; i++) {
            if (!cajas[i].isAbierta()) // no abierta
            {
                acumPremiosDescubrir += cajas[i].getPremio();
                cajasAbrir++;
            }
        }
        return acumPremiosDescubrir / cajasAbrir;
    }
    
    /*
    �	mostrarEstadoCaja() mostrar el numero de las cajas que a�n est�n por abrir
    o	arrayCajas (objeto Caja con estado abierta)
    o	Mostrar la posición  (índice) de solo las que no están abiertas
    */
    public static void mostrarEstadoCaja(Caja[] cajas)
    {
        System.out.println("Cajas por abrir");
        for (int i = 0; i < cajas.length; i++) {
            if (!cajas[i].isAbierta() && !cajas[i].isElegida())
            {
                System.out.print((i+1) + "-");
            }
        }
        System.out.println("");
    }
  
    /*
    �	pedirSiTeplantas() pedir al usuario si se planta
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
    private static boolean cajasAbrir(Caja[] cajas) {
        int abrir=0;
        for (int i = 0; i < cajas.length; i++) {
            if (!cajas[i].isAbierta())
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
    
    /**
     * Elimina un premio del array de premios disponibles
     * Busca el premio en el array y lo pone a 0
     * @param premios array de premios disponibles
     * @param cantidad cantidad a eliminar
     */
    public static void eliminarPremioPrograma(int[] premios, int cantidad)
    {
        for (int i = 0; i < premios.length; i++) {
            if (premios[i] == cantidad) {
                premios[i] = 0;
                break; // poso break per sortir i perque el codi es petit            
            }

        }
    }

    
}
