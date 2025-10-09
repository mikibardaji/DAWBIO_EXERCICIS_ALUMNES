public class globulsW {

public static void main(String[] args) throws Exception {
        
    // 1.	Escriu un programa que mostri per pantalla els números del 1 al 10, representant el recompte de glòbuls vermells analitzats per un microscopi.
    
    //primer definim variable de comptador i mostrem per pantalla el procés a realitzar
int mostra=0;
System.out.println("Observant mostres......");

    //definirem un bucle 
        
do{

System.out.println("Mostrant glòbul:"+(mostra+1));

mostra++;

}while (mostra!=10);


//una vegada fora del bucle analitzarem les mostres des de la última observada 
    System.out.println("Processant les mostres des de la última observada....");
//a la primera, per això descomptarem el comptador começant pel 10 fins que el comptador sigui major a 0 quan arribi a 0 finalitzarà
do{

System.out.println("Glòbul "+(mostra)+ " ja s'ha processat");

mostra--;

}while (mostra!=0);

    }
}

