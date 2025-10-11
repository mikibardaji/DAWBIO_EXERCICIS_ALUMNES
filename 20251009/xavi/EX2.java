import java.util.Scanner;

public class EX2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Dosis = 0;

        System.out.print("cuantas dosis nesesitas ");
        Dosis = sc.nextInt();

        for(int i=1; i<=Dosis ;i++){
            System.out.println("Dosis administrada t’en falten "+(Dosis-i));
        }


    }
}
