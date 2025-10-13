import java.util.Scanner;

public class algoritmos1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int nacimiento;
        String categoria;
        System.out.println("Cual es tu fecha de nacimiento? ");
        nacimiento = sc.nextInt();
        if (nacimiento > 2013) {
            categoria = "sin federar";
        } else if ((nacimiento == 2011) || (nacimiento == 2012)) {
            categoria = "S14";
        } else if ((nacimiento == 2009)||(nacimiento == 2010)) {
            categoria = "S16";
        } else if ((nacimiento == 2007)||(nacimiento == 2008)) {
            categoria = "S18";
        } else if (nacimiento >= 1991 && nacimiento <= 2006) {
            categoria = "ABSOLUTA";
        } else {
            categoria = "Veterans";
        }
        System.out.println("el jugador esta federado en la categoria " + categoria);


    sc.close();
    }   
}