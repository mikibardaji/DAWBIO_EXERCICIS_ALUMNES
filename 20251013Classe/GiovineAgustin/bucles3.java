import java.util.Scanner;

public class bucles3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaro las variables valorMin y valorMax
        //pido al usuario que me de los valores que quiere
        //creo un condicional el cual me diga si el valor min otorgado es impar 
        //si es impar creo un bucle que se detenga cuanto el valor min sea igual a el num max 
        //sumo a numero minimo el valor de 2 cada vez que se ejecuta el bucle y lo muestro en pantalla

        int valorMax;
        int valorMin;
  
        System.out.println("Para saber los numeros pares entre estos numeros ");
        System.out.println("dime un numero par minimo ");
        valorMin = sc.nextInt();
        System.out.println("dime un numero par maximo ");
        valorMax = sc.nextInt();
   

        if (valorMin % 2 == 0){
        /*
            System.out.println("estos son los numeros pares entre " + valorMax + " y " + valorMin);
            for (;valorMax >= valorMin; valorMin = valorMin + 2 ){
                System.out.println(valorMin);
            }
        */

            do {
                valorMin = valorMin + 2;
                System.out.println(valorMin);

            } while(valorMax > valorMin);

        }   else    {
            System.out.println("error el numero min ingresado es impar");
        }
        sc.close();
    }   
}
