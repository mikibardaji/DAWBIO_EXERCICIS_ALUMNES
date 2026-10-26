/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exeer6while.java;

/**
 *
 * @author iviss
 */
public class Exeer6whileJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

boolean negativo = false;
int i = 1;

while (i <= 10) {
    System.out.print("Introdueix el valor " + i + ": ");
    double valor = sc.nextDouble();

    if (valor < 0) {
        negativo = true;
    }

    i++;
}

if (negativo) {
    System.out.println("S'ha detectat algun valor crític.");
} else {
    System.out.println("No s'han detectat valors crítics.");
}
        
    }
    
}
