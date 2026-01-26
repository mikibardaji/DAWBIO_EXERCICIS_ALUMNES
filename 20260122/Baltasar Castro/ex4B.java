public class ex4B {
 public static void main(String[] args) throws Exception {
    int [] numero; //declaració de vector
    int positiu=0, negatiu=0, saldoPos=0, saldoNeg=0;
    numero = new int [20];

for (int i=0;i<numero.length;i++){
        Random rd= new Random();
        numero[i]=rd.nextInt(-10,11);
       } 

    for (int i=0;i<numero.length;i++){
        if (numero[i]>0){
            positiu++;
            saldoPos +=numero[i];
        }
        if (numero[i]<0){
            negatiu++;
            saldoNeg +=numero[i];
        }
    }
    
    System.out.println("Números positius: " + positiu+ " i la suma de tots ells és "+saldoPos);
    System.out.println("Números negatius: "+ negatiu+ " i la suma de tots ells és "+saldoNeg);
    System.out.println("El salo total és: "+ (saldoPos+saldoNeg));


}
}
