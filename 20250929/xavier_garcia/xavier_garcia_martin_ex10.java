import java.util.Scanner;

public class xavier_garcia_martin_ex10 {
    public static void main(String[] args) {
        //horas trabajadas
        //tarifa
        //calcular el salario brut les hores normals mes las hores extres
        //sacar los impostos i el salari net

        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix hores treballades: ");
        int hores = sc.nextInt();

        double tarifa = 15.0;
        double salariob;

        if (hores <= 40) {
            salariob = hores * tarifa;
        } else {
            int horesExtra = hores - 40;
            salariob = (40 * tarifa) + (horesExtra * tarifa * 1.5);
        }

        double impuestos = 0;
        if (salariob > 500) {
            double restant = salariob - 500;
            impuestos = restant * 0.25;
        } else {
            impuestos = 0;
        }

        double salariNet = salariob - impuestos;
        System.out.println("Salario bruto: " + salariob);
        System.out.println("impuestos: " + impuestos);
        System.out.println("Salari net: " + salariNet);
        sc.close();
    }
}
