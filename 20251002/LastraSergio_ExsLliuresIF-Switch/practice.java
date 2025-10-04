import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        // 0.Pedir al usuario su edad para determinar si es un niño, un adulto o un jubilado
        // 1.Clasificar al usuario en una categoría de edad según el número introducido
        // 2.Devolver la categoría de edad correspondiente al número
        // 3.Decir mediante un mensaje escrito la edad y la categoría

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix la teva edat:");

        int edad;
        edad = sc.nextInt();
        sc.close();

        if(edad < 12){
            System.out.println("Ets un nen");
        }
        else if (edad >= 12 && edad <17){
            System.out.println("Ets un adolescent");
        }
        else if (edad >= 18 && edad < 64){
            System.out.println("Ets un adult");
        }
        else {
            System.out.println("Ets un jubilat");
        }

        System.out.println("Introduce un número del 1 al 7:");

        int respuesta;
        respuesta = sc.nextInt();
        sc.close();

        

        switch (respuesta) {
            case 1:
                System.out.println("Es Lunes");
                break;
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sabado");
                break;
            case 7:
                System.out.println("Es Domingo");
                break;
            default:
                System.out.println("Número no valido");
                break;
        }

    }
}
