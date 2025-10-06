import java.util.Scanner;

public class JoelEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Posa l'any de la categoria: ");
        int any = sc.nextInt();
        String categoria = "";

        if(any > 1924) {
            if(any >= 2013){
                System.out.println("No Categoria");
            }
            else if(any >= 2011 && any <= 2012){
                categoria = "S14";
            }
            else if(any >= 2009 && any <= 2010){
                categoria = "S16";
            }
            else if(any >= 2007 && any <= 2008){
                categoria = "S18";
            }
            else if(any >= 1991 && any <= 2006){
                categoria = "Absoluta";
            }
            else{
                categoria = "Veterans";
            }
            System.out.println("El/la jugador/a estarà federat a la categoria " + categoria);
        }
        else{
            System.out.println("Aquest any no és vàlid per a jugar a categories actuals");
        }
    }
}

