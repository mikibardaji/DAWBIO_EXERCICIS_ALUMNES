import java.util.Scanner;
public class ejercicilliure {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in); 
     //Programa per a un institut/escola que pregunta als estudiants la seva edat y els clasifica a quina clase han danar, exemple primaria
     //Programa pregunta a estudiant la seva edad, si menys de 5 (vostè pertany a primari), (edad>5 && edad<=6) primer de primaria, així amb tots els cursos
     //Finalment un else per a les edads superiors a sisè de primaria indicant que no pertanyen a aquest grup.
     //<=5(no ets de primaria), (>=6 1r), (>=7 segon), (>=8 3r), (>=9 4r), (>=10 5t), (>=11 6sè), (if edad>=12 && edad<=15 "pertanys a l'eso") (else no pertanys a l'institut)
    int edad;
    String grup="0";
    System.out.print("Indica l'edat de l'estudiant: ");
    edad =sc.nextInt();
    if (edad<=5){
        grup="No pertanys a primaria";
    }
    else if (edad>=6 && edad<7){
        grup="Pertanys a 1º de primaria";
    }
    else if (edad>=7 && edad<8){
        grup="Pertanys a 2º de primaria";
    }
    else if (edad>=8 && edad<9){
        grup="Pertanys a 3º de primaria";
    }
    else if (edad>=9 && edad<10){
        grup="Pertanys a 4º de primaria";
    }
    else if (edad>=10 && edad<11){
        grup="Pertanys a 5º de primaria";
    }
    else if (edad>=11 && edad<12){
        grup="Pertanys a 6º de primaria";
    }
    else if (edad>=12 && edad<=15){
        grup="Pertanys a l'ESO";
    }
    else {
        grup="Vostè no pertany a l'institut";
    }
     System.out.println(grup);
    }}