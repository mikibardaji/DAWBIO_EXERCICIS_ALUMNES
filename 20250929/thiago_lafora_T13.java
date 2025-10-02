import java.util.Scanner;

public class thiago_lafora_T13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double euros, dolares, yenes, libras, francos;

        System.out.println("Mostrar la cantidad de euros a cambiar: ");
        euros = sc.nextDouble();

        System.out.println("Indique a qué moneda quiere convertir los euros (dolares, yenes, libras): ");
        String moneda = sc.next();  

        
        dolares = euros * 1.28611;
        yenes   = euros * 129.852;
        libras  = euros * 0.86;
        francos = euros * 4.5;

        if (euros < 0) {
            System.out.println("Cantidad de euros no válida");
        } 
        else if (moneda.equals("francos")){
            System.out.println("Esta es la cantidad en francos: " + francos);
        }
        else if (moneda.equals("dolares")) {
            System.out.println("Esta es la cantidad en dólares: " + dolares);
        } 
        else if (moneda.equals("yenes")) {
            System.out.println("Esta es la cantidad en yenes: " + yenes);
        }
        else if (moneda.equals("libras")) {
            System.out.println("Esta es la cantidad en libras: " + libras);
        }
        else {
            System.out.println("Moneda no válida");
        }

        sc.close();
    }
}
