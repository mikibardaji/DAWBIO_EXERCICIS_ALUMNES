import java.util.Scanner;
public class ejercicilliure2 {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        //Programa que calcular el IRPF descomptat del sou anuari brut
        //Exemple si l'usuari cobra fins o menys de 12.450 se li aplica una retenció del 19%.
        //I mostrar al final el seu sou anuari brut amb l'IRPF descomptat
        //(<=12.450 19%), (>=12.450 && <=20.199 24%), (>=20.200 && <=35.199 30%),
        // (>=35.200 && <=59.999 37%), (>=60.000 && <=299.999 45%), (>=300.000 47%)
        double irpf, sou, soufinal, soumensual;
        System.out.print("Indiqui el seu sou anuari brut: ");
        sou =sc.nextInt();
        if (sou<12450){
            irpf=0.19;
            soufinal=sou*irpf;
            soufinal=sou-soufinal;
        }
        else if (sou>=12450 && sou<20199){
            irpf=0.24;
            soufinal=sou*irpf;
            soufinal=sou-soufinal;

        }
        else if (sou>=20200 && sou<35199){
            irpf=0.30;
            soufinal=sou*irpf;
            soufinal=sou-soufinal;

        }
        else if (sou>=35200 && sou<59999){
            irpf=0.37;
            soufinal=sou*irpf;
            soufinal=sou-soufinal;

        }
        else if (sou>=60000 && sou<299999){
            irpf=0.45;
            soufinal=sou*irpf;
            soufinal=sou-soufinal;

        }
        else if (sou>=300000){
            irpf=0.47;
            soufinal=sou*irpf;
            soufinal=sou-soufinal;

        }
        else {
            System.out.println("No se li aplica cap retenció");
            return;
        }
        System.out.println("El seu sou anuari brut amb el irpf " + irpf + " aplicat será de " + soufinal);
        soumensual=soufinal%12;
        System.out.println("El teu sou mensual brut será de " + soumensual);
}
}