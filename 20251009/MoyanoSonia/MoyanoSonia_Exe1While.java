public class globulsW {

public static void main(String[] args) throws Exception {
        
    // 1.	Escriu un programa que mostri per pantalla els números del 1 al 10, representant el recompte de glòbuls vermells analitzats per un microscopi.
    
    //primer definim variable de comptador i mostrem per pantalla el procés a realitzar
int mostra=0;
System.out.println("Observant mostres......");

//definirem un bucle mentre la mostra no sigui 10 s'anirá executant quan sigui falsa la condició sortirà del bucle
        
do{

        System.out.println("Mostrant glòbul:"+(mostra+1));

        mostra++;

}while (mostra!=10);


//una vegada fora del bucle analitzarem les mostres des de la última observada 
System.out.println("Processant les mostres des de la última observada....");
//per això descomptarem el comptador começant pel 10 fins que el comptador mentre no sigui 0 quan aixó no es compleixi finalitzarà
do{

        System.out.println("Glòbul "+(mostra)+ " ja s'ha processat");

        mostra--;

}while (mostra!=0);

    }
}
