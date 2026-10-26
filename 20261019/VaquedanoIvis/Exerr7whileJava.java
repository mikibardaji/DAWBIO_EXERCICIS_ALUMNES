/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerr7while.java;

/**
 *
 * @author iviss
 */
public class Exerr7whileJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

int negativos = 0;
int i = 1;

while (i <= 10) {
    System.out.print("Introdueix el valor " + i + ": ");
    double valor = sc.nextDouble();

    if (valor < 0) {
        negativos++;
    }

    i++;
}

System.out.println("Nombre de valors negatius: " + negativos);
    }
    
}
