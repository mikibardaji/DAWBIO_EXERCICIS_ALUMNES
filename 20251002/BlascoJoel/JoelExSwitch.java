import java.util.Scanner;

public class JoelExSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Inserti un mes del any (1-12)");
        int mes = sc.nextInt();
        String nom_mes = "";
        System.out.println("Inserta un dia del any (1-31)");
        int dia = sc.nextInt();

        switch (mes) {
            case 1:
                nom_mes = "gener";
                break;
            
            case 2:
                nom_mes = "febrer";
                break;

            case 3:
                nom_mes = "març";
                break;
               
            case 4:
                nom_mes = "abril";
                break;
                
            case 5:
                nom_mes = "maig";
                break;

            case 6:
                nom_mes = "juny";
                break;
            
            case 7:
                nom_mes = "juliol";
                break;
            
            case 8:
                nom_mes = "agost";
                break;

            case 9:
                nom_mes = "septembre";
                break;

            case 10:
                nom_mes = "octubre";
                break;

            case 11:
                nom_mes = "novembre";
                break;

            case 12:
                nom_mes = "decembre";
                break;

            default:
                System.out.println("Error!");
                break;
        }

        if(dia >= 30 & mes == 2 || dia == 31 & mes == 4 || dia == 31 & mes == 6 || dia == 31 & mes == 9 || dia == 31 & mes == 11){
            System.out.println("Aquest dia no existeix");
        } 
        else if(dia == 29 & mes == 2){
            System.out.println("Avui es " + dia + " de " + nom_mes + ".");
            System.out.println("Aquest dia només es cada 4 anys!");
        }
        else{
            System.out.println("Avui es " + dia + " de " + nom_mes + ".");
        }
    }
}

