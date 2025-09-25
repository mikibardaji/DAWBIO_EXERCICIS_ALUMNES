import java.util.Scanner; 
public class Teoriccondicionales {
    public static void main(String[] args) {
 int nota;  
 System.out.println("que nota has sacado?");      

Scanner sc = new Scanner(System.in);

nota = sc.nextInt();

if (nota < 5){

 System.out.println("desaprobado");


} else {
    System.out.println("aprobado");

}



    }   
}



