import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Double nota;
        System.out.println("Hola, ingresa tu nota");
        Scanner sc = new Scanner(System.in);

        nota = sc.nextDouble();
        if (nota <=4.99) {
            System.out.println("Suspendido");
            
        }else if (nota>=5 && nota<6) {
            System.out.println("Aprobado");
            
        
        }else if (nota >=6 && nota <8.99) {
            System.out.println("Notable");
            
        }else if (nota ==9 && nota ==10) {
            System.out.println("Excelente");
            
        }else{
            System.out.println("Ingresa una nota correcta");
        }
            
        

    }
}
