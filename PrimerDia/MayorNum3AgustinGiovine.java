import java.util.Scanner;

public class Comparacion3AgustinGiovine {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaro las variables numerol, numero2, numero3
        //muestro en pantalla la instruccion de que el usuario me de un numero
        //almaceno el numero que me dio el usuario
        //repito las 3 veces para tener los 3 numeros
        //condicionales preguntando cual numero es mayor numero1 >= numero2 && numero1 >= numero3
        //si no es afirmativo utilizo otro condicional numero2 >= numero3
        //si ninguno se cumple uso un else mostrando el 3er numero
        int numero1, numero2, numero3;

		System.out.print("introduce el primer numero: ");
        numero1 = sc.nextInt();
        System.out.print("introduce el segundo numero: ");
        numero2 = sc.nextInt();
        System.out.print("introduce el tercer numero: ");
        numero3 = sc.nextInt();
        
        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("el numero mayor es " + numero1);
        } else if (numero2 >= numero3) {
            System.out.println("el numero mayor es " + numero2);
        } else{
            System.out.println("el numero mayor es " + numero3);
        }
		sc.close();
	}
}
