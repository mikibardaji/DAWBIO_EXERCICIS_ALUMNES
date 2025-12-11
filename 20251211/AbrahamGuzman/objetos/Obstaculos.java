/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author xabiel
 */
public class Obstaculos {
    
      public static final int DIFICULTAD_BARRERA_MIN = 1;
    public static final int DIFICULTAD_BARRERA_MAX = 5;
    public static final int DIFICULTAD_TREN_MIN = 5;
    public static final int DIFICULTAD_TREN_MAX = 10;
    
    private final String tipo; 
    private final int dificultad;

   
    public Obstaculos() {
        Random rand = new Random();
        
       
        if (rand.nextBoolean()) {
            this.tipo = "barrera";
           
            this.dificultad = rand.nextInt(DIFICULTAD_BARRERA_MAX - DIFICULTAD_BARRERA_MIN + 1) + DIFICULTAD_BARRERA_MIN;
        } else {
            this.tipo = "tren";
            this.dificultad = rand.nextInt(DIFICULTAD_TREN_MAX - DIFICULTAD_TREN_MIN + 1) + DIFICULTAD_TREN_MIN;
        }
        
        System.out.println("-> Constructor Obstaculo: Creado obstáculo tipo " + this.tipo + 
                           " con dificultad " + this.dificultad);
        
        
        if (this.tipo.equals("tren")) {
            
            System.out.println("   " + getTrenASCII());
        }
    }

  
    public static Obstaculos obstaculoMaxim() {
        System.out.println("-> Método estático Obstaculo.obstaculoMaxim(): Creando obstáculo de dificultad máxima.");
       
        return new Obstaculos("tren", DIFICULTAD_TREN_MAX); 
    }
    
   
    private Obstaculos(String tipo, int dificultad) {
        this.tipo = tipo;
        this.dificultad = dificultad;
    }
    
    public String getTipo() {
        return tipo; 
    }

    public int getDificultad() {
        return dificultad; 
    }
}

