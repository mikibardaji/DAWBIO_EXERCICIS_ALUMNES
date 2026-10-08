import java.util.Scanner;
/**
 *
 * @author dro3858
 */
public class Ex14 {

    //14.Desenvolupeu un programa que entri un import en euros, mostri un menú amb diferents monedes, llegeixi el nom de la moneda i mostri la conversió a la moneda escollida.
    /*      Cuantos euros tienes? *por ejemplo usuario pone 10*
                      a - Dolar
                      b - Libra
                      c - Yen
                      Esperando opción: ___
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        double euros, Dolar, Lek, Libra;
        
        
        
        System.out.println("Quants euros tens?");
        
        euros = sc.nextDouble();
        
       
        
        System.out.println("Tria el canvi de moneda (A, B o C)");
        System.out.println("Dolar");
        Dolar = sc.nextDouble();
        Dolar = euros*1.13;
        
        System.out.println("Lek");
        Lek = sc.nextDouble();
        Lek = euros*91.9;
        
        System.out.println("Libra");
        Libra = sc.nextDouble();
        Libra = euros*0.85;
        
      
      switch(){   
        case 1:
            {
            System.out.print("Son"+ Dolar + "Dolars");
            }
        case 2:
            {
            System.out.print("Son"+ Lek + "Leks");
            }
        
        case 3:
            {
            System.out.print("Son"+ Libra + "libras");
            }
      }
    }   
}
