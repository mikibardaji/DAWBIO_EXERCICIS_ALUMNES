import java.lang.Math;


public class temperatura {

    public static void main(String[] args) throws Exception {
//Simula que vas mesurant la temperatura d’un pacient.
//El programa ha de demanar valors (float) fins que la temperatura sigui 36.5 o més, 
//i després mostrar quants intents han calgut. Valores aleatorios entre 35 y 45.

    
    //inicialitzem la variable temperatura  i el comptador de mostres de temperatura
    float temperatura;
    int mostres=0;

    //mentre la temeratura no sigui major a 36,5º cicles seguirem demanant temperatura, 
    //actualitzem el comprador de mostres per saber-ne quantes vegades hem de pres mesura
    do{
        
        //perque ens doni un número entre 35 i 45 hem d'indicar que la diferencia de rang la multipliqui pel número aleatori 
        //i després afegeixi el valor inicial del rang. com l'exercici ens demana expressament un float com a temperatura 
        //hem de transformar el valor degut a que la funcio math ens retorna un double.
        temperatura= (float)((Math.random()*(45-35))+35);
        System.out.println("La temperatura del pacient és de " +temperatura);
        mostres ++;
    } while (temperatura <=36.5);
    

    // una vegada acabat el mostreig, farem  mostrarem les vegades que s'ha pres la temperatura per pantalla.
    
    System.out.println("S'ha pres " +mostres+ " vegades la temperatura");

}}

//Comentari: per accurar més el programa i degut que el rang de temperatura no és simètric hi ha moltes més probabilitats que 
//finalitzi el while amb la primera mostra, intentant la prova amb rang més simètric podem veure més cicles te mesures de temperatura.
