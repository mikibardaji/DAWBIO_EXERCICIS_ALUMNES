
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerr2while.java;

/**
 *
 * @author iviss
 */
public class Exerr2whileJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc =new Scanner(System.in);
        System.out.println("Quantes dosis necessites? ");
        int dosis = sc.nextInt();
        int queden = dosis -1;
        while (queden >=0){
       
             System.out.println("Dosis administrada te'n falten " + queden + "....");
            queden--;
             
             System.out.println("Ja aetsas curat!!!");
     
    }
    
}
