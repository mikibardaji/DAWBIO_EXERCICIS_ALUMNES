package allatu;

import java.util.Random;
import java.util.Scanner;


public class allatu {
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

    public static int[] ponerListaPremios()
    {
        int[] todosPremiosPrograma = {10,20,30,50};
        return todosPremiosPrograma;
    }
    
  
    public static Caja[] sortearCajas(int[] premiosOrdenados)
    { 
        Caja[] cajas = new Caja[premiosOrdenados.length];
        Random rd = new Random();
        for (int i = 0; i < premiosOrdenados.length; i++) {
            int posicion;
            do
            {
                posicion = rd.nextInt(premiosOrdenados.length);
            }while(cajas[posicion] != null);  
            cajas[posicion] = new Caja(premiosOrdenados[i]);
        }
        System.out.println("Cajas ya sorteadas");
        return cajas;
    }

    public static void mostrarTodosLosPremios(int[] premiosOrdenados)
    {
        System.out.println("Premios aun por abrir");
        for (int i = 0; i < premiosOrdenados.length; i++) {
            if(premiosOrdenados[i]!=0)
            {
                System.out.print(premiosOrdenados[i]+"-");
            }
        }
        System.out.println("");
    }
 
    public static int mostrarPremioCaja(Caja[] cajas, int cajaDescartada)
    {
        System.out.println("Has descartado " + cajas[cajaDescartada].getPremio() + "€");
        cajas[cajaDescartada].setAbierta(true);
        return cajas[cajaDescartada].getPremio();
    }

    public static int elegirCaja(int lenght) 
    {
        Scanner sc = new Scanner(System.in);
        int posicion;
        do
        {    
            System.out.println("Caja a descartar 1-" + lenght);
            posicion = sc.nextInt();
        }while(posicion<1 || posicion>lenght);
        return (posicion-1); 
    
   
    public static int ofertaBanca(Caja[] cajas)
    {
        int acumPremiosDescubrir = 0;
        int cajasAbrir = 0;
        for (int i = 0; i < cajas.length; i++) {
            if (!cajas[i].isAbierta()) 
                acumPremiosDescubrir += cajas[i].getPremio();
                cajasAbrir++;
            }
        }
        return acumPremiosDescubrir / cajasAbrir;
    }
    
  
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
   
    public static void eliminarPremioPrograma(int[] premios, int cantidad)
    {
        for (int i = 0; i < premios.length; i++) {
            if (premios[i] == cantidad) {
                premios[i] = 0;
                break;        
            }

        }
    }

    
}