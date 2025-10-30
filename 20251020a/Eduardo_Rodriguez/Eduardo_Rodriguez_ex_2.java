import java.util.Scanner;

public class Eduardo_Rodriguez_ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Coloca tu edad: ");
        int edad = sc.nextInt();

        if (mayor(edad) == true) {
            System.out.println("eres mayor de edad");
        } else {
            System.out.println("no eres mayor de edad");
        }

    }

    private static boolean mayor(int edad) {
        return edad >= 18;
    }

}
