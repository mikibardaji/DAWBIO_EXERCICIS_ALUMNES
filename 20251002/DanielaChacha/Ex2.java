import java.util.Scanner;

public class Ex2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int sofa, conversion;
        System.out.println("Introduce el peso tu sofa en kg: ");
        sofa = sc.nextInt();
        System.out.println("A que quiees convertir los gramos?");
        System.out.println("1- Hectogramos");
        System.out.println("2- Decagramos");
        System.out.println("3- Gramos");
        System.out.println("4- Decigramos");
        System.out.println("5- Centiramos");
        System.out.println("6- Miligramos");
        conversion= sc.nextInt();

        switch (conversion)
        {
            case 1:
            sofa = sofa*10;
            System.out.println("Tienes "+ sofa + " quilos de arroz");
            break;

            case 2: 
            sofa = sofa*100;
            System.out.println("Tienes "+ sofa + " hectogramos de arroz");
            break;

            case 3:
            sofa = sofa*1000;
            System.out.println("Tienes "+ sofa + " decagramos de arroz");
            break;

            case 4:
            sofa = sofa*10000;
            System.out.println("Tienes "+ sofa + " decigramos de arroz");
            break;

            case 5:
            sofa = sofa*100000;
            System.out.println("Tienes "+ sofa + " centigramos de arroz");
            break;

            case 6:
            sofa = sofa*1000000;
            System.out.println("Tienes "+ sofa + " miligramos de arroz");
            break;

            default:
            System.out.println("Opción no válida");
            break;

        }
    }
}
