import java.util.Scanner;

public class ExerciciProfe2 
{
    public static void main(String[] args) 
    {
        int numeros[]= new int [10];

        mostrarMenu(numeros);
    }    

    private static void mostrarMenu(int num[])
    {
        char opcion;
        do 
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("----------MENÚ----------");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Selecciona una de las opciones: ");
            opcion = sc.next().charAt(0);

            if (opcion=='a')
            {
                mostrarArray(num);
            }
            else if (opcion== 'b')
            {
                introducirValores(num);
            }
            else if (opcion =='c')
            {
                System.out.println("Has salido del programa");
            }

            else
            {
                System.out.println("Opción no válida. Seleccione una opció valida");
            }
        }while (opcion!='c');
        
    }

    private static void mostrarArray (int num[])
    {
        for (int i=0; i<num.length; i++)
        {
            System.out.print(num[i] + " , ");
        }
    }

    public static void introducirValores(int numeros[])
    {
        Scanner sc= new Scanner(System.in);
        int valor=0;
        int posicion=0;

        System.out.println("Introduce una posición del 0 al 9: ");
        posicion = sc.nextInt();

        if (posicion<0 || posicion >= numeros.length) 
        {
            System.out.println("Posicion no valida");
        } 
        else 
        {
            System.out.println("Introduce el valor: ");
            valor = sc.nextInt();
            numeros[posicion] = valor;
        }
    }
}