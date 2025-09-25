import java.util.Scanner;

public class aprovadoysuspendido {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        double calificacion;
        System.out.println("Introduce tu calificacion: ");
        calificacion = nota.nextDouble();
        if (calificacion >=0 && calificacion <= 4.9) {
            System.out.println("suspendido");
        } else if (calificacion >=5 && calificacion <=5.9) {
            System.out.println("aprobado");
        } else if (calificacion >=6 && calificacion <=8.9) {
            System.out.println("notable");
        } else if (calificacion >=9 && calificacion <=10) {
            System.out.println("sobresaliente");
        } else {
            System.out.println("calificacion no valida");
        }
    }
}
