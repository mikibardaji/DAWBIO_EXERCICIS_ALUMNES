import java.util.Scanner;

public class bucleact2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int docis;
        System.out.print("Cuantas docis necesitas:");
        docis = sc.nextInt();
       for(int fi =docis;fi > 0;fi--){
        System.out.println("Dosis administrada,te faltan " + (fi -1));
       }
       System.out.println("Ya estas curado!!!!");
    }
}
