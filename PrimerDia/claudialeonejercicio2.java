import java.util.Scanner;

public class claudialeonejercicio2 {
    public static void main(String[] args) throws Exception {
        //Programa que te pregunte que nota tienes
        //Si has suspendido nota<=4
        //Si has aprobado nota>=5

        Scanner sc= new Scanner(System.in);
        double nota;
        System.out.print("Que nota has sacado?");
        nota =sc.nextDouble();
        if (nota>=5){
            System.out.println("Has aprobado, enorabuena.");
            }
        else if (nota <=4){
            System.out.println("Has suspendido, estudia mas.");
            }
            sc.close();
            //este tmb podria ser else y directamentes poner el { sin poner nada de nota, para ahorrar linias de codigo
        }

}