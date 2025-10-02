import java.util.Scanner;

public class BaltasarCastro_ex13 {
public static void main(String[] args) {
    //Desenvolupeu un programa que entri un import en euros, mostri un menú amb diferents monedes, 
    //llegeixi el nom de la moneda i mostri la conversió a la moneda escollida.

    Scanner sc = new Scanner (System.in);

    double euros;
    double resultado = 0.0;
    int opcio;
    System.out.println("Cuantos euros quieres convertir.");
    euros = sc.nextDouble();

    System.out.println("En q moneda quieres canviar la moneda");
    System.out.println("1. Dolares");
    System.out.println("2. Libras");
    System.out.println("3. Yens");
    

     System.out.print("Escull una opció (1-3): ");
        opcio = sc.nextInt();

    if (opcio == 1) 
    {
        resultado = euros * 1.10;
        System.out.println("Son " + resultado + " en dolares.");
    }
    else if (opcio == 2)
     {
        resultado = euros * 0.87;
        System.out.println("Son " + resultado + " en libras.");
    }
    else if (opcio == 3) 
    {
        resultado = euros * 173.60;
        System.out.println("Son " + resultado + " en yens.");
    }
    else {
        System.out.println("Invalido");
    }
}
}
