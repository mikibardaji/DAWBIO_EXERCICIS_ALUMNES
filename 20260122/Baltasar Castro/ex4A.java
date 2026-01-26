public class ex4A {
public static void main(String[] args) throws Exception {
    int [] numero; //declaració de vector
    int positiu=0, negatiu=0;
    numero = new int [20];

for (int i=0;i<numero.length;i++){
        Random rd= new Random();
        numero[i]=rd.nextInt(-10,11);
       } 

    for (int i=0;i<numero.length;i++){
        if (numero[i]>0){
            positiu++;
        }
        if (numero[i]<0){
            negatiu++;
        }
    }
    
    System.out.println("Números positius:" + positiu);
    System.out.println("Números negatius:"+ negatiu);

}
}
