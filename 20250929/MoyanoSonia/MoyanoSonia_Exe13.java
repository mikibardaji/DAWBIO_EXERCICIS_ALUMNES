import java.util.Scanner;

public class CanviMoneda {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char moneda;
    final double DOLAR = 1.17;
    final double LLIURA = 0.87; 
    final double YEN = 174.26;
    double quantitat;
    
    // demanar import en euros
    System.out.print("Quin import en euros tens? ");
    quantitat = sc.nextDouble();

    // demanar moneda a convertir
    System.out.print("A quina moneda vols convertir-ho (D)olars/(L)liures/(Y)ens)? ");

    moneda = sc.next().charAt(0);

    //mirem quina es la moneda que ha triat l'usuari

    if (moneda == 'D' || moneda == 'd')
    {System.out.println("l'import per "+ quantitat+ " Euros en Dolars és:" + quantitat*DOLAR+ " Dolars");
    } else if (moneda == 'L' || moneda == 'l') {
        System.out.println("l'import per "+ quantitat+ " Euros en Lliures és:" + quantitat*LLIURA+ " Lliures");
    } else if (moneda == 'Y' || moneda == 'y') {
        System.out.println("l'import per "+ quantitat+ "Euros en Yens és:" + quantitat*YEN+ " Yens");
    } else {
        System.out.println("Moneda no vàlida");
    }


    sc.close();
}

}
