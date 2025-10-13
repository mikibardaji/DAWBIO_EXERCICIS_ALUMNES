import java.util.Scanner;

public class tensio2 {

    public static void main(String[] args) throws Exception {
//6.	El programa llegeix 10 valors de tensió arterial (no nuls) i, en acabar, mostra un missatge indicant 
//si s’ha detectat algun valor crític —és a dir, si algun valor ha estat negatiu, cosa que indicaria un error de mesura 
//o un pacient fictici. 
//7.	Un cop realitzat el 6, també al acabar te que dir quants negatius hi havia. (A l’exercici anterior sol te que avisar que n’hi hagut algún..).
    Scanner sc = new Scanner(System.in);
    int tensio=0; int valid=0; int novalid=0;
    boolean negatiu=true;
    do{
        System.out.println("Introdueix tensió arterial pacient: ");
        tensio= sc.nextInt();

        if (tensio > 0){
            valid++;
            
        }
        else {
            novalid++;
            negatiu=false;}

    }while (valid!=10 && negatiu);
    
    System.out.println("Hi ha agut " + valid + " lectures vàlidesde tensió i "+novalid+" lectures no vàlides");

    sc.close();
    }


}
