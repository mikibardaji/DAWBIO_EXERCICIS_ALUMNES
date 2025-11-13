import java.util.Scanner;
import java.util.Random;
public class ejruleta {

    public static void main(String[] args) {
        int saldo=0;
        saldo=AfegirPunts(saldo);


        int aposta = QuantitatAposta();
        int valid = apostaPunts(saldo, aposta);
        if (valid == -1) return;


        int tipus = tipusAposta();
        int numbola = bola();
        saldo= resultatJugada(tipus, saldo, aposta, numbola);
        System.out.println("Saldo final: " + saldo);


    }


    public static int AfegirPunts(int saldo){
        Scanner sc= new Scanner(System.in);
        int saldofinal;
        do{
        System.out.print("Quants punts vols afegir al saldo?: ");
        saldofinal=sc.nextInt();
        if(saldofinal<=0){
            System.out.println("Erroni, el saldo ha de ser més de 0. ");
        }
        else{
            break;
        }
        }while(saldofinal<=0);
        saldo+=saldofinal;
        return saldo;
    }
    public static int QuantitatAposta(){
        Scanner sc= new Scanner(System.in);
        int apostaquant;
        do{
        System.out.println("Quina cuantitat vols apostar?");
        apostaquant= sc.nextInt();  
        if (apostaquant<0){
            System.out.println("Error, ha de ser positiu.");
        }
        else{
            break;
        }
        }while(apostaquant<=0);
        return apostaquant;
    }
    public static void pintaAsterisc(int numero){
        for(int i=0;i<numero;i++){
            System.out.println("*");
        }
        System.out.println(" " + numero);


    }
    public static int bola(){
        Random rd= new Random();
        int numbola=rd.nextInt(0,37);
        return numbola;
    }
    public static int tipusAposta(){
        Scanner sc= new Scanner(System.in);
        int opcio;
        int num;
        do{
        System.out.println("Que tipus de aposta vols fer del 1 al 36: ");
        System.out.println("1-Senar, 0-Parell o numero concret: ");
        opcio=sc.nextInt();
        if (opcio<0 || opcio>2){
            System.out.println("Error, torna a introduir la opcio.");
        }
        }while(opcio <0 || opcio >2);


        if(opcio==0){
            return 0;
        }
        else if(opcio==1){
            return 1;
        }
        else{
            do{
                System.out.println("Escriu el numero concret 1-36:");
                num=sc.nextInt();
                if(num<1 || num>36){
                    System.out.println("Num. invàlid. Torna-ho a provar.");
                }
                }while(num<1 || num>36);
            return num;
        }
             
    }
    public static int apostaPunts(int puntsTotal, int puntsAposta){
        if(puntsAposta>puntsTotal){
            System.out.println("No tens prou saldo per apostar aquesta quantitat...");
            return -1;
        }
        else{
            return puntsAposta;
        }
    }
    public static int resultatJugada(int tipusAposta, int saldo, int puntsAposta, int bola){
        saldo -= puntsAposta;


    if (tipusAposta >= 1 && tipusAposta <= 36) {
        if (tipusAposta == bola) {
            saldo += puntsAposta * 36;
            System.out.println("Has encertat el numero! Has guanyat: " + (puntsAposta * 36) + " punts!");
        } else {
            System.out.println("No has tingut sort... el numero era: " + bola);
        }
    } else if (tipusAposta == 0) {
        if (bola != 0 && bola % 2 == 0) {
            saldo += puntsAposta * 2;
            System.out.println("Has encertat! Era parell!");
        } else {
            System.out.println("No era parell, el numero era: " + bola);
        }
    } else if (tipusAposta == 1) {
        if (bola % 2 != 0) {
            saldo += puntsAposta * 2;
            System.out.println("Has encertat! Era senar!");
        } else {
            System.out.println("No era senar, el numero era: " + bola);
        }
    }


    return saldo;
}
    }


