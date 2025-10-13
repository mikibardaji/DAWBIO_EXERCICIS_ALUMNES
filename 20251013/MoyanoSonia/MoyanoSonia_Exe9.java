import java.util.Random;

public class batecs {
    public static void main(String[] args) throws Exception {
    //9.	Demana a l’usuari les pulsacions (batecs per minut) d’un pacient durant 5 minuts,
    // i calcula la mitjana. Valors aleatoris entre 30 i 150.

    //definirem les variables, batec, suma (per recollir les mostres) i un accumulador, ara podriem no utilitzar-ho però va bé per començar
    // a acostumar-se, el primer valor del accumulador será d'un perque si només tenim una mostra no ens doni error al dividir per 0
    int batec, suma_mostres=0, acc=1;

    //la variable de la mitjana la definirem com a variable per evitar pèrdues de decimals
    double mitjana=0;

    //inicialitzem la variable per a que ens mostri numeros aleatoris
    Random rd = new Random();

    //durant 5 cicles (minuts) treurem un número aleatori i el sumarem al total de mostres, també actualitzarem l'accumulador
    for (int i=0; i<5 ; i++){
        batec=rd.nextInt(30,151);
        System.out.println("Pulsacions del " +acc+" minut: "+batec+" bpm");
        suma_mostres=suma_mostres+batec;
        acc++;

    }

    // una vegada acabat el mostreig, farem la mitjana i la mostrarem per pantalla.
    mitjana=suma_mostres/acc;
    System.out.println("La mitjana de les pulsacions ha sigut de " +mitjana+ " bpm");

   }
}
