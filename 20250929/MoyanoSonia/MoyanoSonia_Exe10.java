import java.util.Scanner;

public class HoresTreballador {

public static void main(String[] args) throws Exception {

Scanner sc = new Scanner(System.in);
final int PREUHORA=15, TRAM1=500, TRAM2=900;
final double IRPF1=0.25, IRPF2=0.45;
double horesTreballades, salaribrut, taxes, salarinet; 

// pedir hores treballades
System.out.print("Quantes hores has treballat aquest mes?");
horesTreballades = sc.nextInt();

//si treballa menys o igual a 130 hores el preu per hora serà de 15 euros

if (horesTreballades<130) {
    salaribrut=horesTreballades*PREUHORA;
}
//si treballa més de 130 hores el preu per hora serà de 20 euros
else {
    salaribrut=130*PREUHORA+(horesTreballades-130)*(PREUHORA*1.5);
}
System.out.println("El salari brut és de "+salaribrut+" Euros");

//calcular impostos
if (salaribrut<=TRAM1) {
    taxes=0;
} else if (salaribrut>TRAM1 && salaribrut<=TRAM2) {
    taxes=(salaribrut-TRAM1)*IRPF1;
} else {
    taxes=(TRAM2-TRAM1)*IRPF1+ (salaribrut-TRAM2)*IRPF2;
}
salarinet=salaribrut-taxes;
System.out.println("Les taxes en impostos són de "+taxes+" Euros");
System.out.println("El salari a percebre és de "+salarinet+" Euros");
sc.close();
}
}
