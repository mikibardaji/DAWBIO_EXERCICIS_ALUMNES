import java.util.Scanner;
/**
 *
 * @author dro3858
 */
public class Ex12Java {
//12.Desenvolupeu un programa que demani a l’usuari que introdueixi un preu en € i la quantitat de € que paga. El programa compararà les dues quantitats i escriurà els € que li falten per pagar o bé els que li han de tornar. Ex. Si l’usuari introdueix preu=102€ i paga=150€, el programa li dirà “Sobren 48€”. Si l’usuari introdueix preu=102€ i paga=100€, el programa li dirà “Falten 2€”.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double preu, abonat, canvi, falta;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix el preu en euros");
        preu = sc.nextDouble();
        
        System.out.println("Introdueix el import abonat");
        abonat = sc.nextDouble();
        
        canvi = abonat-preu;
        
        falta = preu-abonat;
        
        if (preu<abonat)
        {
            System.out.println("Sobren " + canvi + " euros");    
        }
   
        else if (preu>abonat)
        {
            System.out.println("Falten " + falta + " euros");
        }
        
    }
    
}
