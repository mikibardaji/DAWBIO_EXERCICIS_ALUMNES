import java.util.Scanner;

public class milles {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        double milles,metres;
        System.out.println("introdueix les milles: ");

        milles = sc.nextDouble();
        
        metres = milles * 1852;

        System.out.println(milles + " milles nautiques equivalen a " + metres + " metres. ");
   
        
    }
}
 