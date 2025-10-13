import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner (System.in);
    //Programa que entra un numero natural (int N) y mostra els numeros parells compresos entre 1 i N.
    //Utilitzant un comptador i suma de 2 en 2.
    int N, contador;
    System.out.print("Introdueix un numero natural:");
    N=sc.nextInt();
    for(contador=2; contador<=N; contador++){
        System.out.println(contador);
        contador++;
    }

}
}
