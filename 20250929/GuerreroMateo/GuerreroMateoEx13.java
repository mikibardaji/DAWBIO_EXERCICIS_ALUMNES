import java.util.Scanner;

public class GuerreroMateoEx13 {
    public static void main(String[] args) throws Exception {
        double euros;
        char divisa;

        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, introduce un valor en euros:");
        euros = sc.nextDouble();
        System.out.println("Selecciona la divisa:");
        System.out.println("-----------------------");
        System.out.println("| Dolar americano | - D");
        System.out.println("| Libra esterlina | - L");
        System.out.println("| Franco suizo    | - F");
        System.out.println("| Yen japonés     | - Y");
        System.out.println("-----------------------");
        
        divisa = sc.next().charAt(0);
        if (divisa == 'D' || divisa =='d') {
            System.out.println(euros*1.17 + " Dolares");
            
        }else if (divisa == 'L' || divisa =='l') {
            System.out.println(euros*0.87 + " Libras");
            
        }else if (divisa == 'F' || divisa =='f') {
            System.out.println(euros*0.94 + " Francos");
            
        }else if (divisa == 'Y' || divisa =='y') {
            System.out.println(euros*172.52 + " Yenes");
            
        }else{
            System.out.println("//Letra incorrecta//");
        }

    }
}
