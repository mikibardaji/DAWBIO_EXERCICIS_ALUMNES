import java.util.Scanner;

public class ex10 {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


float temperatura;
int conta=0;
        do
        {
        System.out.println("La temperatura es de " );
        temperatura=sc.nextFloat();
        conta ++;
        } 
        while (temperatura <=36.5);
    
    
    System.out.println("Han misurado " + conta + " veces la temperatura");

}
}