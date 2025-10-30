import java.util.Scanner;

public class ex2 {
    // Programa que demana a l’usuari una edat i indica si és major d’edat (edat major o igual a 18 anys).
    // Ha d’implementar un mètode amb el prototip boolean esMajorEdat(int edat).

    public static void main(String[] args) {
       
      int edad;

      edad=pedirNumeroEnteroPos();

      boolean mayor=mayored(edad);
      mostrar(edad);
    }

 public static void mostrar(int edad){
   System.out.println("Muestra la edad "+edad);

 }
    public static boolean mayored(int edad) 
    {
        boolean mayor = true;  
        if (edad>=18) {
            System.out.println("Eres mayor de edad");
            return mayor = true;
        } else {
            System.out.println("Eres menor de edad");
            return mayor = false;
        }
        
    }

    public static int pedirNumeroEnteroPos()
    {
        int valor;
         Scanner sc=new Scanner(System.in);
         do{
            System.out.println("Pon tu edad: ");
            valor=sc.nextInt();
         }while(valor<0);
         return valor;

    }
}
