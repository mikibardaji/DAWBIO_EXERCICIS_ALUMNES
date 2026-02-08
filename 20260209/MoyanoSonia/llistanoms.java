import Objectes.nom;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Crea una llista de noms que gestionarem amb un menú, amb les seguents opcions Llistar noms 
        // (mostrarà tots els noms fins al moment, al moment de llistar-lo, els ha de mostrar amb majuscules i a mes al canto
        // el numero de lletres que tinguis, si no tenen informació o estan en blanc no s'han de mostrar) . 
        // Al finalitzar el llistat t'ha de mostrar el numero de noms existents. 
        // Afegir nom(Buscara la primera posició no informada  i afegira el nom introduit al usuari) 
        // Modificar nom(Buscara el nom i el substituira pel nou que introdueixis, si no el troba ho ha de dir) 
        // Esborrar nom(opció fàcil, quant trobes la posició la deixes en blanc o a null, el que prefereixis).

//definir estructura de string per 10 noms
char opcio;

nom [] llistaNoms = new nom [10];
for (int i = 0; i < llistaNoms.length; i++) {
    llistaNoms[i] = new nom(); 
} //omplim l'array de 10 posicions amb noms buits

do {
mostrarMenu();
opcio = obtenirOpcioUsuari();

switch (opcio) {
case 'a':
llistarNoms(llistaNoms);
break;
case 'b':
afegirNom(llistaNoms);
break;
case 'c':
modificarNom(llistaNoms);
break;
case 'd':
buscarNom(llistaNoms);
break;
case 'e':
esborrarNom(llistaNoms);
break;
case 'f':
System.out.println("Fins aviat");
break;
case 'g':
buscarInicial(llistaNoms);
break;
default:
System.out.println("Opció no vàlida. Torna a intentar.");
}


} while (opcio!='f');
}

private static void mostrarMenu() {
System.out.println("Menú:");
System.out.println("a. Llistar noms");
System.out.println("b. Afegir nom");
System.out.println("c. Modificar nom");
System.out.println("d. Cerca en quina posició nom");
System.out.println("e. Esborrar nom");
System.out.println("f. Sortir");
System.out.println("g. Cerca inici de nom");
}

private static char obtenirOpcioUsuari() {
Scanner sc = new Scanner(System.in);

System.out.print ("Selecciona una opció: ");
//recollir lletra i retornar-la
return sc.next().charAt(0);
}

private static void llistarNoms(nom [] llistaNoms) {
int buit=0, recompte=0;
for(int i=0; i<llistaNoms.length;i++){
if (llistaNoms[i].isOcupat()==false){
    buit++;
    recompte+=llistaNoms[i].getLlargNom();
}
}
if (buit==10){
System.out.println ("Encara no hi ha noms introduits");
}
else{
    for (int i=0; i<llistaNoms.length;i++){
    if(!llistaNoms[i].getNom().equals("")){
    System.out.println (llistaNoms[i].getNom().toUpperCase()+ " - "+llistaNoms[i].getLlargNom());
    recompte+=llistaNoms[i].getLlargNom();//afegim els caracters del nom
    }}
}
//imprimir el contingut de llista

System.out.println ("Hi ha un total de "+(llistaNoms.length-buit)+" noms amb un total de "+recompte+" caracters.");
return;
}

private static void afegirNom(nom [] llistaNoms) {
Scanner sc = new Scanner(System.in);
System.out.println ("Introdueix quin nom vols afegir");
String nomDonat=sc.nextLine().toUpperCase();
int i=0;
while(i < llistaNoms.length){
if (llistaNoms[i].isOcupat()==false)
    {llistaNoms[i].setNom(nomDonat);
    return;
}
i++;
}
System.out.println (nomDonat+"No s'ha pogut introduir, està tota la llista plena");
return;
}
private static int buscarNom(nom [] llistaNoms) {
int i=0, posicio=0;
Scanner sc = new Scanner(System.in);
System.out.println ("Introdueix quin nom vols buscar");
String nomBuscat=sc.nextLine().toUpperCase();

while(i < llistaNoms.length){
if (llistaNoms[i].getNom().equals(nomBuscat)){
    posicio=i;
    System.out.println("Nom trobat a la posició: " + (i+1));
    return i; // Tornem la posició
}
i++;
}
System.out.println ("No s'ha trobat el nom indicat " +nomBuscat);
System.out.println (posicio);
posicio=-1;
return posicio;
}

private static void modificarNom(nom [] llistaNoms) {
Scanner sc = new Scanner(System.in);
int posicio=buscarNom(llistaNoms);
if (posicio==-1){
System.out.println ("No s'ha trobat el nom indicat");
}
System.out.println ("Quin és el nou nom a introduir?");
String nomDonat=sc.nextLine().toUpperCase();
llistaNoms[posicio].setNom(nomDonat);
return;
}

private static void esborrarNom(nom [] llistaNoms) {
int posicio=buscarNom(llistaNoms);
if (posicio==-1){
System.out.println ("No s'ha trobat el nom indicat");
}
System.out.println ("El nom "+llistaNoms[posicio].getNom()+" s'ha esborrat");
llistaNoms[posicio].setNomBuit();
return;
}

private static void buscarInicial(nom [] llistaNoms) {
int i=0, trobat=0;
Scanner sc = new Scanner(System.in);
System.out.println ("Com comença el nom que busques?");
String inici=sc.nextLine().toUpperCase();

while(i < llistaNoms.length){
if (llistaNoms[i].getNom().startsWith(inici)){
    
    System.out.println(llistaNoms[i].getNom());
    trobat++; 
}
i++;
}
if (trobat==0){

System.out.println ("No s'han trobat noms que comenci amb " +inici);

}
return;
}
}
