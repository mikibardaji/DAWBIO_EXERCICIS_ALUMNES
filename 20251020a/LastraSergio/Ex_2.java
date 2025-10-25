public class Ex_2 {
    public static void main(String[] args) {
        PreguntaEdad();
        edat(false);
    }

    public static void PreguntaEdad() {
        System.out.println("Introdueix la teva edat:");
    }

    public static boolean edat(boolean edad) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int edadInput = sc.nextInt();
        sc.close();
        if (edadInput >= 18) {
            System.out.println("Ets major d'edat.");
            edad = true;
        } else {
            System.out.println("Ets menor d'edat.");
            edad = false;
        }
        return edad;
    }
}
