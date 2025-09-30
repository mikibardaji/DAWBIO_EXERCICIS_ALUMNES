import java.util.Scanner;
//13.Desenvolupeu un programa que entri un import en euros, mostri un menú amb diferents monedes, llegeixi el nom de la moneda i mostri la conversió a la moneda escollida.
// Declarar el importo y los 3 tipos de monedas
// Hacer el if que dice que si quieres dollares hay que hacer importe*1.17, si quieres yen tienes que hacer importe*173.53 y si quieres Córdoba nicaraguense tienes que hacer importe*43,22
// Mostrar resultado

public class MartinaNicettoEx13 {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         double euros,dollares,yen,cordoba;
         CHAR moneda;
         System.out.println("Dime el importe en euros ");
         euros = sc.nextDouble();
         
       System.out.print("A que monedas quieres convertir dollares,yen,cordoba)? ");
        moneda = sc.next().charAt(0);


    if ( moneda == 'd')
    {
        dollares=euros*1.17;
        System.out.println("El importo en dollares es " + dollares);
    } 
    else if ( moneda == 'c') 
    {
        cordoba=euros*43.22;
        System.out.println("El importo en cordobas nicaguareses es " + cordoba);
    } 
    else if ( moneda == 'y')
    {
        yen=euros*173.53;
        System.out.println("El importe en yen es " + yen);
    } 
    else 
    {
        System.out.println("ERROR");
    }


    }
}