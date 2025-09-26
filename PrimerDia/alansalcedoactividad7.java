import java.util.Scanner;

public class alansalcedoactividad7 {
    public static void main(String[] args) {
         //poner tres varibles
        //hacer que una varible identifique que es mas grande que la otra
        //si no que sea igal
        // fin de la practica
        double variable1,variable2,variable3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("introduce el primer numero:");
        variable1 = scanner.nextDouble();
        System.out.print("introduce el segundo numero:");
        variable2 = scanner.nextDouble();
        System.out.print("introduce tercer numero:");
        variable3 = scanner.nextDouble();

        if (variable1 > variable2 && variable1 > variable3) {
            System.out.print("el mas grande:"+ variable1);
        }else if (variable2 > variable1 && variable2 > variable3){
            System.out.print("el mas grande:" + variable2);
        } else{
            System.out.print("el numero mas grande es:"+ variable3);
        }
    }
}
