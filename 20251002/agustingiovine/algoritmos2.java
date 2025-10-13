import java.util.Scanner;
public class algoritmos2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int opcion;
    String medicamento = "";
    int cantidad = 0;
    int peso;
        
    System.out.print("elige tu medicamento con su numero correspondiente ");
    System.out.println("0- Ibuprofeno");
    System.out.println("1- Xarelto");
    System.out.println("2- Amoxicilina");
    System.out.println("3- Fluoxetina");
    opcion = sc.nextInt();  

    System.out.print("Cual es tu peso?");
    peso = sc.nextInt();    

    if (opcion == 0 && peso < 70) {
        medicamento = "ibuprofeno";
        cantidad = 500;
    } else if (opcion == 0 && peso >= 70) {
        medicamento = "ibuprofeno";
        cantidad = 1000;
    } else if (opcion == 1 && peso < 60) {
        medicamento = "xarelto";
        cantidad = 10;
    } else if (opcion == 1 && peso >= 60 && peso <=80) {
        medicamento = "xarelto";
        cantidad = 15;
    } else if (opcion == 1 && peso > 80) {
        medicamento = "xarelto";
        cantidad = 20;
    } else if (opcion == 2 && peso < 65) {
        medicamento = "amoxicilina";
        cantidad = 500;
    } else if (opcion == 2 && peso >= 65) {
        medicamento = "amoxicilina";
        cantidad = 1000;
    } else if (opcion == 3 && peso < 80) {
        medicamento = "fluoxetina";
        cantidad = 20;
    }   else if (opcion == 3 && peso >= 80) {
        medicamento = "fluoxetina";
        cantidad = 40;
    }

    System.out.println("con el peso de " + peso + "kg debo de tomar " + cantidad + "mg de " + medicamento);
    sc.close();
    }
}
