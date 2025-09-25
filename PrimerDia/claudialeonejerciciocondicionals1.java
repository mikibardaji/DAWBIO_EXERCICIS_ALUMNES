import java.util.Scanner;

public class claudialeonejerciciocondicionals1 {
    public static void main(String[] args) throws Exception {
        //Pedir tu edad, solo puede pasar quien tiene mas de 21 años
        Scanner sc= new Scanner(System.in);
        int edad;
        System.out.print("Que edad tienes?");
        edad = sc.nextInt();
        if (edad>=21){
             System.out.println("Puedes pasar");
            }
        else if (edad<=20){
             System.out.println("No puedes pasar");
            }
            System.out.println("Disco proven...");
}

}