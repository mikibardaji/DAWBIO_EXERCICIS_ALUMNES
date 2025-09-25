import java.util.Scanner;

public class BaltasarCastro_ex4 {
public static void main(String[] args) {
    //Programa que llegeix un número i diu si és positiu, si és zero, o bé i és negatiu

    Scanner sc = new Scanner (System.in); 

double valor1;

System.out.println("Que numero quieres?");
    valor1 = sc.nextDouble();


     if (valor1 == 0) {
            System.out.println("Es 0");
        } else if (valor1 > 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }
}
}
