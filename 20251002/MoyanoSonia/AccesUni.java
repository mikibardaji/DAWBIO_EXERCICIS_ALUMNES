import java.util.Scanner;

public class AccesUni {

public static void main(String[] args) throws Exception {

//Realitzarem un programa que ens dirà les opcions que tenims per entrar a una carrera universitaria 
//tenint en compte la dada mitjana si s'han cursat especifiques de la carrera i la nota de tall del anterior any.

final double NOTA_BIO=10.62;
final double NOTA_ENG=9.24;
final double NOTA_PSI=9.92;
final double NOTA_ADE=10.96;

int opcio;
double nota, tall=0;
double nota_uni=0;
char especifica;
Scanner sc = new Scanner(System.in);
System.out.print("Quin és la teva nota mitjana del GRAU SUPERIOR?");
nota = sc.nextDouble();
System.out.println("Quin GRAU UNIVERSITARI vols cursar?");
System.out.println("1 - Bioinformàtica");
System.out.println("2 - Enginyeria Electrònica Industrial i Automàtica");
System.out.println("3 - Psicologia");
System.out.println("4 - Administració i Direcció d'Empreses");
opcio=sc.nextInt();

//Donada la complexitat del sistema d'accés universitari en quant a variables i per no complicar molt el programa
//considerem que si s'ha realitzat la se especifica demanada a la PAU s'assignará 
//el multiplicador més alt (1,4) per arribar a 14 en cas d'haver tret un 10 al grau

switch (opcio) {
    case 1:
        nota_uni=NOTA_BIO;
        System.out.print("Has realitzat l'exàmen de Biologia a pujar nota? S/N ");
        especifica = sc.next().charAt(0);
        if (especifica=='S' || especifica=='s'){
            tall = nota*1.4;
        }
        else{ tall=nota;}
        break;
    
    case 2:
        nota_uni=NOTA_ENG;
        System.out.print("Has realitzat l'exàmen de Física per a pujar nota? S/N ");
        especifica = sc.next().charAt(0);
        if (especifica=='S' || especifica=='s'){
            tall = nota*1.4;
        }
        else{ tall=nota;}
        break;

    case 3:
        nota_uni=NOTA_PSI;
        System.out.print("Has realitzat l'exàmen de Matemàtiques Aplicades a les Ciencies Socials per a pujar nota? S/N ");
        especifica = sc.next().charAt(0);
        if (especifica=='S' || especifica=='s'){
            tall = nota*1.4;
        }
        else{ tall=nota;}
        break;
    case 4:
        nota_uni=NOTA_ADE;
        System.out.print("Has realitzat l'exàmen d'Economai de l'Empresa per a pujar nota? S/N ");
        especifica = sc.next().charAt(0);
        if (especifica=='S' || especifica=='s'){
            tall = nota*1.4;
        }
        else{ tall=nota;}
        break;

    default:
        System.out.print("No has seleccionat una opció de GRAU UNIVERSITARI VÀLID");

    break;

}
if (nota_uni>tall){

    System.out.print("Has tret un "+tall+" de nota global, i per l'accès al GRAU demanen "+ nota_uni+" no pots accedir");
}
else{
    System.out.print("Bona feina!! Has tret un "+tall+" de nota global més alta que "+nota_uni"que demanen al GRAU");}
    sc.close();
}

}


