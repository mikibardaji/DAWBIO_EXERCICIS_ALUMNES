import java.util.Random;
import java.util.Scanner;

public class ExRuleta 
{
    public static void main(String[] args) 
    {
        
    }    

    public static int afegirPunts (int saldo)
    {
        Scanner sc = new Scanner(System.in);
        int sumar;
        do
        {
            System.out.print("Introduce cuántos puntos te gustaría añadir(Pon número positivo!): ");
            sumar= sc.nextInt();
        }while(sumar<=0); 
        saldo += sumar;
        return saldo;
    }

    public static int apostaPunts(int puntsTotal, int puntsAposta)
    {
        
        if(puntsTotal <= puntsAposta)
        {
            return -1;
        }
        else
        {
            return puntsAposta;
        }
    }
    
    public static int bola()
    {
        Random rd = new Random();
        int bola = rd.nextInt(0, 37);
        return bola; 
    }

    public static void pintaAsterisc(int numero)
    {
        for(int i=0;i<numero;i++)
        {
            System.out.print("*");
        }
        System.out.println("" + numero);
    }

    public static int quantitatAposta()
    {
        Scanner sc = new Scanner(System.in);
        int dinero;
        do
        {
            System.out.println("Cuánto quieres apostar?: ");
            dinero=sc.nextInt();
            if (dinero<0)
            {
                System.out.println("Introduce un valor válido: ");
            }
        }while(dinero<0);
        return dinero;
    }

    public static int resultatJugada(int tipusAposta,int saldo,int puntsAposta, int bola)
    {
      if((bola%2==0 && tipusAposta==-2) || (tipusAposta==-1 && bola%2!=0))
      {
        System.out.println("Has ganado el doble!");
        saldo += puntsAposta;  
      } 
      else if (tipusAposta == bola)
      {
        System.out.println("Has ganado 36 veces más!!");
        saldo += puntsAposta * 35;
      } 
      else 
      {
        System.out.println("Has perdido :c");
        saldo -=puntsAposta;
      }
      return saldo;
    }

    public static int tipusAposta() 
    {
        Scanner sc = new Scanner(System.in);
        int tipus;
        System.out.println("\n Opciones de apuesta");
        System.out.println("Par (-2)");
        System.out.println("Senar (-1)");
        System.out.println("Número específico (1-36)");
        do {
            System.out.print("Elige una opción: ");
            tipus = sc.nextInt();
            if (tipus < -2 || tipus > 36) 
            {
                System.out.println("Opción no válida, vuelve a intentarlo!");
            }
        } while (tipus<-2 || tipus>36 || tipus==0);
        return tipus;
    }
}