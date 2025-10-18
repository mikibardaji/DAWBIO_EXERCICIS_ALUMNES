import java.util.Random;
import java.util.Scanner;
public class jocAleatoriADV {
    public static void main(String[] args) throws Exception {
    //Programa on l'usuari pensa un número de l'1 al 100 i l'ordinador intenta endevinar-lo. 
    //És a dir, l'ordinador anirà proposant números una vegada i una altra fins a endevinar-lo 
    //(l'usuari haurà d'indicar-li a l'ordinador si és més gran, menor o igual al número que ha pensat). 
    //Se li indicara amb =(igual) +(mes gran) o -(mes petit). A cada volta el ordenador ha d'acotar el limit.

    int acc=0, accG=0, accP=0;//inicialitzarem tres comptadors un per intents i dos per quan el programa diu números mes gran o més petit.
    int rangBaix=0, rangAlt=101; //inicialitzem els rangs superior i inferior per que pugui esbrinar la maquina
    int num; //definirem una variable per enregistrar el numero pensat per la máquina
    char pensat; //definirem una variable tipus char per poder enregistrar +/-/=
    Scanner sc = new Scanner(System.in);
    Random rd = new Random(); 

    System.out.print("Suposo que ja has pensat un número, jo crec que és:");
    
    //mentre no acertem continuarem dintre del bucle 
    do{
        num=rd.nextInt(rangBaix,rangAlt);
        System.out.println(num);
        do{
        System.out.println("He encertat?( +/-/=)");
        pensat=sc.next().charAt(0);
        }while(pensat!='+'&& pensat!='-'&& pensat!='=');
        
        switch (pensat) {
        case '+':
            rangBaix=num+1; //al registre baix incrementem el rang+1 perque el num dit ja no pot ser, si indiquem que està dintre del rang ho podria tornar a intentar
            accP++; //incrementem l'acumulador dels intents que s'han quedat per sota
            acc++; //i l'accumulador general
            break;
            
        case '-':
            rangAlt=num;//el rang alt l'assignarem tal qual perquè aquest numero ja no l'agafara com a opció.
            accG++; //incrementem l'acumulador dels intents on s'ha passat
            acc++; //i l'accumulador general
            break;
            
        case '=':
            System.out.print("He encertat!!!"); // la màquina ha encertat
            acc++; // i augmentem l'accumulador d'intents generals
            break;
            
        }
    }while(pensat!='=');
    
    System.out.println("T'ho he encertat amb "+acc +" cops, "+accG+ " cops he dit un número més gran i "+accP +" cops més petit");
    sc.close();
}
}
