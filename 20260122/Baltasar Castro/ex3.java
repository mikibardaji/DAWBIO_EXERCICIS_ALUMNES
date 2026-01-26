public class ex3 {
 public static void main(String[] args) throws Exception {
    int [] notas; //declaració de vector
    int min=10, max=0;
    notas = new int [20];

for (int i=0;i<notas.length;i++){
        Random rd= new Random();
        notas[i]=rd.nextInt(0,11);
       } 

    for (int i=0;i<notas.length;i++){
        if (notas[i]>max){
            max = notas[i];
        }
        if (notas[i]<min){
            min = notas[i];
        }
    System.out.println("La nota de és:" + notas[i]);
}
    
    System.out.println("Nota mínima:" + min);
    System.out.println("Nota màxima:"+max);

}
}
