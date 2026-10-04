import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {     
    
    int num;
    Scanner lector = new Scanner (System.in);

    System.out.println("Digues 1 numero entre el -∞ i el ∞");
    num = lector.nextInt();
    
    if (num>0) {
        System.out.print("Es un numero positiu.");

    }if (num<0){
        System.out.print("Es un numero negatiu.");

        
    }if (num==0){
        System.out.print("Es 0.");
    }
}
}
