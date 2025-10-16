public class ex8 {
 public static void main(String[] args) {
//Mostra per pantalla una cadena de 20 lletres alternant A i T (adenina i timina):
//ATATATATAT
char aminoacid = 'A';
System.out.println("Cadena de 20 lletres alternant A i T:");
for (int i=0; i<20; i++){   
    System.out.print(aminoacid);
    if (aminoacid == 'A')
    {
        aminoacid = 'T';
    } 
    else 
    {
        aminoacid = 'A';
    }

}
 }}