import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
    //Programa que demana a l’usuari una edat i indica si és major d’edat + prototip boolean es major(int anys).
    Scanner sc = new Scanner(System.in);

    int anys;
    System.out.print("Quants anys tens?: ");
    anys = sc.nextInt();

    if (major(anys))
    {
        System.out.println("Ets major d'edat.");
    } else 
    {
        System.out.println("Ets menor d'edat.");
    }
    }

}
private static boolean major(int anys)
    {
        if (anys >= 18)
    {
        return true;
    }   
    else   
    {
        return false;
    }
} 

