import java.util.Scanner;

public class bucles4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaro las variables valorMin y valorMax
        //pido al usuario que me de los valores que quiere
        //creo un bucle que se detenga cuanto el valor min sea igual a el num max 
        //sumo a numero minimo el valor de 1 cada vez que se ejecuta el bucle
        //creo un condicional que muestre el valor en pantalla si "valorMin % 2 == 0"

        int valorMax;
        int valorMin;
  
        System.out.println("Para saber los numeros pares entre estos numeros ");
        System.out.print("dime un numero par minimo ");
        valorMin = sc.nextInt();
        System.out.print("dime un numero par maximo ");
        valorMax = sc.nextInt();
        
            System.out.println("estos son los numeros pares entre " + valorMax + " y " + valorMin);
            for (;valorMax >= valorMin; valorMin = valorMin + 1 ){
                if (valorMin % 2 == 0) {
                    System.out.println(valorMin);
                }
            }
        /*

            do {
                valorMin = valorMin + 1;
                if (valorMin % 2 == 0) {
                    System.out.println(valorMin);
                }
                

            } while(valorMax > valorMin);
        */
        sc.close();
    }   
}
