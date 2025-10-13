import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner (System.in);
    //Programa que compte enrere de 10 a 1 abans d'una intervenció
    //Preparant quirofan... 10... 9.. 1.. inici de la interveció
   System.out.println("Preparant quiròfan..." );
    for(int compte=10; compte>=1; compte--){
        
         System.out.println(compte + "...");
    }
    System.out.println("Inici de la intervenció");
}
}
