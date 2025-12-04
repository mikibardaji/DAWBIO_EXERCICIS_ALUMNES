/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seqdna;
import SQDNA.seqDna;
/**
 *
 * @author agu3018
 */
public class SeqDNA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        seqDna s1 = new seqDna("SEQ001", "acgtacgtgca");
        seqDna s2 = new seqDna("SEQ002", "gggcccaaa");

        System.out.println("ID: " + s1.getId());
        System.out.println("Seq: " + s1.getSeq());
        System.out.println("Longitud: " + s1.longitud());
        System.out.println("Num de G: " + s1.comptaBase('G'));
        System.out.println("%GC: " + s1.porcentajeGC('A'));

        System.out.println("Total seqüències creades: " + seqDna.getComptadorSeqs());

    }
    
}
