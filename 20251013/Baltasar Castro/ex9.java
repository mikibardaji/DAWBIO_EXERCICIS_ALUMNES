public class ex9 {
    public static void main(String[] args) {
        //Demana a l’usuari les pulsacions (batecs per minut) d’un pacient durant 5 minuts, 
        //i calcula la mitjana. Valores aleatorios entre 30 y 150.
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introdueix pulsacions minut " + i + ": ");
            int pulsacions = sc.nextInt();
            suma += pulsacions;
        }

        double mitjana = suma / 5.0;
        System.out.println("Mitjana = " + mitjana + " bpm");

        sc.close();
    }
}


