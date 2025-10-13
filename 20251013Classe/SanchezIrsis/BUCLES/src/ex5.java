import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
//Mostra un compte enrere de 10 a 1 abans d’una intervenció:
int contador = 10;
System.out.println("Preparant quiròfan...");

for (contador=10; contador>=1; contador = contador -1)
{
    System.out.println("Comencem en " + contador + "...");
}
System.out.println(("Inici de la intervenció."));
}
}