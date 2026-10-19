/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adeninatimina;

/**
 *
 * @author jgu3417
 */

public class AdeninaTimina {
    public static void main(String[] args) {

        int comptador = 1;

        while (comptador <= 20) {
            if (comptador % 2 == 1) {
                System.out.print("A");
            } else {
                System.out.print("T");
            }

            comptador++;
        }
    }
}

