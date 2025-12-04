import objectes.Persona;
import java.util.Scanner;

public class A2Persona {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nom, cognoms, dni;
        int edat;

        System.out.println("===============");
        System.out.println("Primera persona");
        System.out.println("===============");
        System.out.println("Indiqui el seu nom:");
        nom =sc.nextLine();
        System.out.println("Indiqui el seus cognoms:");
        cognoms =sc.nextLine();
        System.out.println("Indiqui el seu DNI:");
        dni =sc.nextLine();
        System.out.println("Indiqui la seva edat:");
        edat=sc.nextInt();
        sc.nextLine(); //buidem el buffer

        Persona p1 = new Persona(nom, cognoms, dni, edat);
        
        System.out.println("===============");
        System.out.println(" Segona persona");
        System.out.println("===============");
        System.out.println("Indiqui el seu nom:");
        nom =sc.nextLine();
        System.out.println("Indiqui el seus cognoms:");
        cognoms =sc.nextLine();
        System.out.println("Indiqui el seu DNI:");
        dni =sc.nextLine();
        System.out.println("Indiqui la seva edat:");
        edat=sc.nextInt();
        sc.nextLine(); //buidem el buffer 
        Persona p2 = new Persona(nom, cognoms, dni, edat);

        System.out.println("Persones introduïdes:");
        p1.mostrarPersona();
        p1.esMajorEdat();
        p1.esJubilat();
        p2.mostrarPersona();
        p2.esMajorEdat();
        p2.esJubilat();
        System.out.println("La diferència d'edat de les persones introduïdes és:"+p1.diferenciaEdat(p2));

    sc.close();
    
    }
    
}
