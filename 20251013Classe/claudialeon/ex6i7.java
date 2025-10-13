import java.util.Scanner;
public class ex6i7 {
public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner (System.in);
    //Programa que llegeix 10 valors de tensio arterial (no nuls)
    //En acabar mostra un missatge indicant si hi ha algun valor critic
    //Es a dir un valor negatiu, y dir al final quants valors critics hi ha.
    //L'exercici 7 que digi si hi ha algun valor negatiu o no.

    int contador = 0; // comptador de valors crítics (negatius)
    double valors = 0.0;
    double v_arterial=0;

    // Llegir exactament 10 valors i comptar quants són negatius
    for (v_arterial = 0; v_arterial < 10; v_arterial++) {
        System.out.print("Dime un valor arterial: ");
        valors = sc.nextDouble();
        if (valors < 0) {
            contador++;
        }
        } 
        if(contador>=1){
            System.out.println("Hi ha valors critics");
            }
            if(contador==0){
            System.out.println("No hi ha ningun valor critic");
        
    }

    

    System.out.println("Hi ha " + contador + " valors critics");
    

    
   sc.close();
   
}
}
