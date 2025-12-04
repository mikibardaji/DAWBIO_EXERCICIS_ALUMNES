/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQDNA;

import java.util.Random;

/**
 *
 * @author agu3018
 */
public class seqDna {
    private final String id;
    private String seq;
    private double qualitat; 
    private final double MIN_QUALITAT = 0;
    private final double MAX_QUALITAT = 1;
    
    public static int ComptadorSeqs = 0;

    public seqDna(String id, String seq) {
        Random rd = new Random();
        this.id = id;
        this.seq = seq.toUpperCase();
        
        qualitat = (MIN_QUALITAT + MAX_QUALITAT)/2;
        
        ComptadorSeqs =+1;
    }

    public String getId() {
        return id;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        char letraSeq =' ';
        String seqMayuscula = seq.toUpperCase();
        String seqValida = "";
        for (int i = 0; i < seqMayuscula.length(); i++) {
            letraSeq = seqMayuscula.charAt(i);
            if(letraSeq == 'A' || letraSeq == 'C' || letraSeq == 'G' || letraSeq == 'T'){
            seqValida +=letraSeq;
            }
        }
        this.seq = seqValida;
    }

    public double getQualitat() {
        return qualitat;
    }

    public void setQualitat(double qualitat) {
        
        if(qualitat >= MIN_QUALITAT || qualitat > MAX_QUALITAT)
        this.qualitat = qualitat;
       
    }

    public static int getComptadorSeqs() {
        return ComptadorSeqs;
    }
    
    public int longitud(){
    int longitud = seq.length();
    return longitud;
    }
   
    public int comptaBase(char base){
        int comptaBase = 0;
        for (int i = 0; i < seq.length(); i++) {
            if(seq.charAt(i) == base)
                comptaBase ++;
        }
        
        return comptaBase; 

}
    
    public double porcentajeGC(char letra){
        int GC = comptaBase(letra); 
        int porcentaje = (GC/seq.length()) *100;
        
        
        
        return  porcentaje;
         
} 
}
