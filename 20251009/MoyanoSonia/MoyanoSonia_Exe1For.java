public class globuls {
    public static void main(String[] args) throws Exception {
        
    // 1.	Escriu un programa que mostri per pantalla els números del 1 al 10, representant el recompte de glòbuls vermells analitzats per un microscopi.
    
    //primer definim variable de comptador i mostrem per pantalla el procés a realitzar
    int i;
    System.out.println("Observant mostres......");

    //definirem un bucle inicialitzant en 0 i que no finalitzará mentre sigui menor que 10 al arribar a 10 surtirá del bucle, i incrementem
    for (i=0 ; i<10;i++){
    //mostrarem el número de glòbul observat per això indicarem com a primera mostra el comptador + 1 
        System.out.println("Mostrant glòbul:"+(i+1));

    }
//una vegada fora del bucle analitzarem les mostres des de la última observada 
    System.out.println("Processant les mostres des de la última observada....");
//a la primera, per això descomptarem el comptador começant pel 10 fins que el comptador sigui major a 0 quan arribi a 0 finalitzarà
    for (i=10 ; i>0;i--){

        System.out.println("Glòbul "+(i)+ " ja s'ha processat");

    }

    }
}
