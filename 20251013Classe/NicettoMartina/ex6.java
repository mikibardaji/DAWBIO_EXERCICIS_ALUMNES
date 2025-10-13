import java.util.Scanner;

public class ex6 {
     public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    
    int contador=0, tension;
    int negativo=0;
    do 
    {
        System.out.println("Pon tension arterial ");
        tension=sc.nextInt();
        contador ++;
        if (tension<0)
        {
            negativo++;
        }
    }
    while(contador<=5);

      if (negativo>0)
      {
         System.out.println("Valor negativo");
      }
   
    }
    }