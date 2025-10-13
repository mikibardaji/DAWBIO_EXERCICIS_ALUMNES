import java.util.Scanner;
public class ej4 {
    public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner (System.in);
    //Programa que entra un numero natural N i mostra els numeros parells entre 1 i N
    //Pero amb un comptador sumant de 1 en 1
    int N, contador;
    System.out.print("Introdueix un numero natural:");
    N=sc.nextInt();
        for(contador=1; contador<=N; contador ++){
            if (contador%2==0) {
                System.out.println(contador);
            }
            }
        
}
}

