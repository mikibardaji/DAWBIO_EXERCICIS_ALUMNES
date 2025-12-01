import java.util.Scanner;
public class persona {
    public static void main(String[] args) {
        Scanner sc = new Scannner();
    
        System.out.println("Dime el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Dime el apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Dime tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Dime tu DNI sin la letra: ");
        int dni = sc.nextInt();

        if (edad <18){
            System.out.println(nombre + apellido + "con DNI "+ dni + "es menor de edad.";
        } else {
            System.out.println(nombre + apellido + "con DNI "+ dni + "es mayor de edad.");
        }


        
    
}
}