import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.print("que nota tienes? ");
        nota =sc.nextDouble();
        if (nota>4.99) {
            if (nota>=5&&nota<5.99) {
                System.out.print("aprobado ");
            }
            else if (nota>=6&&nota<8.99) {
                System.out.print("notable ");
            }
            else if(nota>=9&&nota<=10) {
                System.out.print("excelente ");

            }
            else{
                System.out.print("nota no valida ");
            }
        
        }else{
            System.out.print("a tu casita bb, suspendiste ");
        }
    }
}


