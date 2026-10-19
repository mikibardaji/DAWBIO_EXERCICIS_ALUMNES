/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author bca5802
 */
public class Dosi_de_medicament {
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.println("Cuantas dosis te quedan: ");
          int dosi = s.nextInt();
          dosi -= 1;
          while (dosi >= 0){
              System.out.println("Dosis administrada" + dosi);
              dosi -= 1;
          }
          }
                  
    }

