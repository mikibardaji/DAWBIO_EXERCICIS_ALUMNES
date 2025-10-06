import java.util.Scanner;

public class JoelEx2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int pes;
        String medicament = "";
        String quantitat = "";
        System.out.print("Posa el teu pes: ");

        pes = sc.nextInt();

        System.out.println("0- Ibuprofeno");
        System.out.println("1- Xarelto");
        System.out.println("2- Amoxicilina");
        System.out.println("3- Fluoxetina");
           
        
       
        int medicina = sc.nextInt();
      
        switch (medicina) {
            case 0: 
             medicament = "Ibuprofeno";
              if(pes < 70 ) {
                quantitat = "500mg";
              }
              else {
                quantitat = "1g";
              }
            break;

            case 1:
             medicament = "Xarelto";
              if(pes < 60 ) {
                quantitat = "10mg";
              } 
              else if(pes >= 60 & pes < 80 ) {
                quantitat = "15mg";
              } 
              else {
                quantitat = "20mg";
              }
            break; 

            case 2: 
             medicament = "Amoxicilina";
              if(pes < 65 ) {
                quantitat = "500mg";
              } 
              else {
                quantitat = "1g";
              }
            break;

            case 3: 
             medicament = "Fluoxetina";
              if(pes < 80 ) {
                quantitat = "20mg";
              } 
              else {
                quantitat = "40mg";
              }
            break;

            default:
                System.out.println("Opció no vàlida!");
            break;
        }
        System.out.println("Amb el pes de " + pes + "kg, tens que prendre una quantitat de " + quantitat + " de " + medicament + ".");
    }
}