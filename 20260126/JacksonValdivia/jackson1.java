package premios;

import java.util.Random;

/**
 *
 * @author jva2780
 */
public class Premios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int prueba[] = new int[10];
        Random ra = new Random();
        
        for (int i = 0; i < prueba.length; i++) {
            prueba[i] = ra.nextInt(1, prueba.length);
        }
        for (int i = 0; i < prueba.length; i++) {
            System.out.println("Array numero " + i + "con premio numero" + prueba[i]);
        }
        
        
        
        prueba = SortearCajas(prueba);
        
        System.out.println("APARTE");
        
        for (int i = 0; i < prueba.length; i++) {
            System.out.println("Array numero " + i + "con premio numero" + prueba[i]);
        }
        
    }
    
    
    public static int[] SortearCajas(int premios[]){
        
        int premiosaleatorio[] = new int[premios.length];
        Random rd = new Random();
        
        for (int i = 0; i < premios.length; i++) {
            
            
            premiosaleatorio[i] = premios[rd.nextInt(0, premios.length)];
            
        }
     
        return premiosaleatorio;
        
    }
    
    
    
    
}

