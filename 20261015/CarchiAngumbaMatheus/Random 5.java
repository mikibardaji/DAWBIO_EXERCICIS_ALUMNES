/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package random.pkg5;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author mca3765
 */
public class Random5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random aleatori = new Random();
        Scanner lector = new Scanner(System.in);
        int dau1 = aleatori.nextInt(1,7);
        int dau2 = aleatori.nextInt(1,7);
        System.out.println("Ara llançare dos daus de 6 cares. Si la suma es mayor a 7 duplicaràs lo apostat." ) ;
        System.out.println("Quants euros vols apostar?: ");
        double apostat = lector.nextDouble();
        if (apostat>0) {
          if (dau1!=dau2){
                if ((dau1+dau2)>=(7)) {
                    System.out.println("Enhorabona, han sortit: "+dau1+" i " +dau2 );
                    System.out.println("Per tant has guanyat "+ (apostat*2) +" euros");
                } else {
                    System.out.println("Mala sort, han sortit: "+dau1+" i " +dau2 );
                    System.out.println("Per tant has perdut :(");
                }
            } else {
                System.out.println("Wow, han sortit numeros dobles: "+dau1+" i " +dau2 );
                System.out.println("Tornarem a llençar");
                dau1 = aleatori.nextInt(1,7);
                dau2 = aleatori.nextInt(1,7);
                System.out.println("Si surten dobles un altre cop, triplicaras l'aposta, de lo contrari només la dupliques");
                if ((dau1+dau2)>(7)) {
                    System.out.println("COMBO! Han sortit numeros dobles un altre cop: "+dau1+" i " +dau2 );
                    System.out.println("Tripliques la teva aposta, has guanyat "+ (apostat*3) +" euros");
                } else {
                    System.out.println("No ha hagut tanta sort, han sortit: "+dau1+" i " +dau2 );
                    System.out.println("Pero, has duplicat la aposa, has guanyat "+(apostat*2)+" euros");
                }


            }
        } else {
            System.out.println("No pots apostar el que no tens...");
        }
        
    }
    
}
