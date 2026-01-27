import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) throws Exception {

    /*Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
distintas opciones:
a. Mostrar valores.
b. Introducir valor.
c. Salir.
La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta
que el usuario elija la opción ‘c’ que terminará el programa.*/
int [] valors;
valors = new int [10];
char sel=' ';

do{
sel=mostrarMenu();
if (sel=='a' || sel=='A'){
mostrarValors(valors);}
if (sel=='b' || sel=='B'){
editarValors(valors);}

}while(sel!='c' && sel!='C');

}

private static char mostrarMenu(){
char sel=' ';
Scanner sc=new Scanner(System.in);
System.out.println("");
System.out.println("--------CONFIGURACIO DE VALORS--------");
System.out.println("a : Mostrar valors ");
System.out.println("b : Editar valors ");
System.out.println("c : Sortir");
System.out.println("--------------------------------------");
System.out.println("Si us plau, indica opció a/b/c");
sel=sc.next().charAt(0);
return sel;
}

private static void mostrarValors(int [] valors){

for (int i=0;i<valors.length;i++){
        System.out.print(valors[i]+" " );
    }
}



private static int [] editarValors(int [] valors){
boolean salir=false;
int valor=0, posicio=0;
char borrar;
Scanner sc=new Scanner(System.in);
System.out.println("quina posició vols cambiar? indicar valor entre 1 i "+(valors.length));
do{
if (!sc.hasNextInt()){
    System.out.println("Entrada no vàlida. Introdueix un número:");
    sc.next();
    }
else {posicio=sc.nextInt();
        if(posicio <0 || posicio>(valors.length+1)){
        System.out.println("Entrada no vàlida. Introdueix un número sencer de 1 a "+(valors.length)+":");    
        }
        else {salir=true;}
        }
}while (!salir);

if (valors[posicio-1]!=0){ //analitzem si la posició no té un zero
    System.out.println("en aquests moments hi ha la xifra "+valors[posicio-1]+ " la vols canviar? (s/n)");
    borrar=sc.next().charAt(0);
    if (borrar=='s'|| borrar=='S'){
    System.out.println("quin valor vols posar?");
    do{
    salir=false;
    if (!sc.hasNextInt()){
    System.out.println("Entrada no vàlida. Introdueix un número:");
    sc.next();
    }
    else {valor=sc.nextInt();
        salir=true;}
        
    }while (!salir);
        
    valors[posicio-1]=valor;//posem el nou valor a la posició escollida
    return valors;
    }
    else {return valors;}
}
else {
System.out.println("quin valor vols posar?");
do{
    salir=false;
    if (!sc.hasNextInt()){
    System.out.println("Entrada no vàlida. Introdueix un número:");
    sc.next();
    }
    else {valor=sc.nextInt();
        salir=true;}
        
    }while (!salir);
valors[posicio-1]=valor;//posem el nou valor a la posició escollida
return valors;}
}
}
