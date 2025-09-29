import java.util.Scanner;

public class ex9_2 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas;
        int minutos;
        int Segundos;
        int segundos_sumados;


        System.out.println("introdueix les hores: ");
        horas = sc.nextInt();
        System.out.println("introdueix els minuts: ");
        minutos = sc.nextInt();
        System.out.println("introdueix els segons: ");
        Segundos = sc.nextInt();
        System.out.println("Introdueix el nombre de segons a afegir: ");
        segundos_sumados = sc.nextInt();

        Segundos = Segundos + segundos_sumados;

        System.out.println("hora: " + horas + " minuts: " + minutos + " segons: " + Segundos);

        if(Segundos >= 59){
            minutos = minutos + Segundos / 60;
            Segundos = Segundos % 60;
        }if(minutos >= 59){
            horas = horas + minutos / 60;
            minutos = minutos % 60;

    }
}
}