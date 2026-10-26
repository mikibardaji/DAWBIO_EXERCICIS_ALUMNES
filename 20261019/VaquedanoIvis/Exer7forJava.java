/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer7for.java;

/**
 *
 * @author iviss
 */
public class Exer7forJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

int negativos = 0;

for (int i = 1; i <= 10; i++) {
    System.out.print("Introdueix el valor " + i + ": ");
    double valor = sc.nextDouble();

    if (valor < 0) {
        negativos++;
    }
}

System.out.println("Nombre de valors negatius: " + negativos);
    }
    
}
