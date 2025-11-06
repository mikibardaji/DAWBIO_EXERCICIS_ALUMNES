import java.util.Scanner;

public class ex6 {
    //6.	Programa que demana a l’usuari dos números enters i diu si són iguals o, cas que no ho siguin, quin és el valor del més gran. 
    //Ha d’implementar un mètode amb el prototip int compara(int x, int y) que retorna -1, 0, +1 segons que x sigui més petit, igual o major que y.
    public static void main(String[] args) {
        int v1,v2;
        v1=pedirValor(1);
        v2=pedirValor(2);

        int comparador=masgrande(v1,v2);
        mostraresultado(comparador,v1,v2);



    }
  
    private static int pedirValor(int x)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon el valor " + x +  ": ");
        int num = sc.nextInt();
        return num;
    }

    public static int masgrande(int x, int y)
    {
        int compara=0;
        if(x<y)
        {
            compara=-1;
        }
        else if (x>y)
        {
            compara=1;
        }
        return compara;
    }
    public static void mostraresultado(int compara, int x, int y)
    {
        if(compara==1)
        {
            System.out.print("El mas grande es " + x);
        }
        else if(compara==-1)
        {
            System.out.print("El mas grande es " + y);
        }
        else
        {
            System.out.print("Los numeros son iguales");
        }
    }
    
}
